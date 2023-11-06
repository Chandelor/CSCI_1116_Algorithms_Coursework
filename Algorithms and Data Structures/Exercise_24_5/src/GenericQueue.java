import java.util.LinkedList;

public class GenericQueue<E> extends LinkedList<E> {
	
	LinkedList<E> list = new LinkedList<>();

	public void enqueue(E e) {
		list.addLast(e);
	}
	
	public E dequeue() {
		return list.removeFirst();
	}
	
	public int getSize() {
		return list.size();
	}
	
}
