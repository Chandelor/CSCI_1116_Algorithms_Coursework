
public class MyArrayList<E> extends MyAbstractList<E> {
	
	public static final int INITIAL_CAPACITY = 16;
	private E[] data = (E[])new Object[INITIAL_CAPACITY];
	private int size = 0;
	
	/** Create a default list */
	public MyArrayList() {
	}

	/** Create a list from an array of objects */
	public MyArrayList(E[] objects) {
		for (int i = 0; i < objects.length; i++)
			add(objects[i]); // Warning: donít use super(objects)! 
	}

	/** Add a new element at the specified index in this list */
	public void add(int index, E e) {
		ensureCapacity();

		// Move the elements to the right after the specified index
		for (int i = size - 1; i >= index; i--)
			data[i + 1] = data[i];

		// Insert new element to data[index]
		data[index] = e;

		// Increase size by 1
		size++;
	}

	/** Create a new larger array, double the current size + 1 */
	private void ensureCapacity() {
		if (size >= data.length) {
			E[] newData = (E[])(new Object[size * 2 + 1]);
			System.arraycopy(data, 0, newData, 0, size);
			data = newData;
		}
	}

	/** Clear the list */
	public void clear() {
		data = (E[])new Object[INITIAL_CAPACITY];
		size = 0;
	}

	/** Return true if this list contains the element */
	public boolean contains(Object e) {
		for (int i = 0; i < size; i++)
			if (e.equals(data[i])) return true;

		return false;
	}

	/** Return the element from this list at the specified index */
	public E get(int index) {
		return data[index];
	}

	/** Return the index of the first matching element in this list.
	 *  Return -1 if no match. */
	public int indexOf(Object e) {
		for (int i = 0; i < size; i++)
			if (e.equals(data[i])) return i;

		return -1;
	}

	/** Return the index of the last matching element in this list
	 *  Return -1 if no match. */
	public int lastIndexOf(Object e) {
		for (int i = size - 1; i >= 0; i--)
			if (e.equals(data[i])) return i;

		return -1;
	}

	/** Remove the element at the specified position in this list
	 *  Shift any subsequent elements to the left.
	 *  Return the element that was removed from the list. */
	public E remove(int index) {
		E e = data[index];

		// Shift data to the left
		for (int j = index; j < size - 1; j++)
			data[j] = data[j + 1];

		data[size - 1] = null; // This element is now null

		// Decrement size
		size--;

		return e;
	}

	/** Replace the element at the specified position in this list
	 *  with the specified element. */
	public E set(int index, E e) {
		E old = data[index];
		data[index] = e;
		return old;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder("[");

		for (int i = 0; i < size; i++) {
			result.append(data[i]);
			if (i < size - 1) result.append(", ");
		}

		return result.toString() + "]";
	}

	/** Trims the capacity to current size */
	public void trimToSize() {
		if (size != data.length) { 
			E[] newData = (E[])(new Object[size]);
			System.arraycopy(data, 0, newData, 0, size);
			data = newData;
		} // If size == capacity, no need to trim
		
	}

	/** Override the iterator method defined in Iterable */
	public java.util.Iterator<E> iterator() {
		return new ArrayListIterator();
	}

	private class ArrayListIterator 
			implements java.util.Iterator<E> {
		private int current = 0; // Current index 

		public boolean hasNext() {
			return (current < size);
		}

		public E next() {
			return data[current++];
		}

		public void remove() {
			MyArrayList.this.remove(current);
		}
		
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	/** Adds the elements in otherList to this list.
	* Returns true if this list changed as a result of the call */ 
	public boolean addAll(MyList<E> otherList) {
		ensureCapacity();
		for (int i = size, j = 0; i != size + otherList.size(); i++, j++) data[i] = otherList.get(j);
		if (data.length > size) {
			size += otherList.size();
			return true;
		}
		
		else return false;
	}

	@Override
	/** Removes all the elements in otherList from this list
	* Returns true if this list changed as a result of the call */ 
	public boolean removeAll(MyList<E> otherList) {
		int count = 0;
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < size; j++) {
				if (data[i] == otherList.get(j)) {
					data[i] = null;
					count++;
				}
				
			}
				
		}
		
		size -= count;
		if (size != otherList.size()) return true;
		return false;
	}

	@Override
	/** Retains the elements in this list that are also in otherList 
	* Returns true if this list changed as a result of the call */
	public boolean retainAll(MyList<E> otherList) {
		boolean inList = false;
		int notInList = 0;
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < size; j++) {
				if (data[i] == otherList.get(j)) inList = true;
			}
			
			if (!inList) {
				notInList++;
				data[i] = null;
			}
			
		}
		
		moveNull();
		size -= notInList;
		if (size != otherList.size()) return true;
		return false;
	}
	
	/** Moves any non null objects to the start of the array */
	public void moveNull() {
		for (int n = 0; n != size; n++) {
			for(int i = 0; i != size; i++) {
				if (data[i] == null) {
					data[i] = data[i + 1];
					data[i + 1] = null;
				}
				
			}
			
		}
		
	}
	
}