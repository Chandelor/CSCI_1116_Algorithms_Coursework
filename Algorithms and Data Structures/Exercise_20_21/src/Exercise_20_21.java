/**
 * @author Chandelor
 * Date: 10/3/2023
 */

import java.util.Comparator;

public class Exercise_20_21 {

	public static void main(String[] args) {
	  
	GeometricObject[] list = {new Circle(5), new Rectangle(4, 5),
							  new Circle(5.5), new Rectangle(2.4, 5), new Circle(0.5), 
							  new Rectangle(4, 65), new Circle(4.5), new Rectangle(4.4, 1),
							  new Circle(6.5), new Rectangle(4, 5)};
	
	Circle[] list1 = {new Circle(2), new Circle(3), new Circle(2),
					  new Circle(5), new Circle(6), new Circle(1), new Circle(2),
					  new Circle(3), new Circle(14), new Circle(12)};
	
	selectionSort(list1, new GeometricObjectComparator());
	
	for (int i = 0; i < list1.length; i++) System.out.println(list1[i].getArea() + " ");
	}
	
	public static <E> void selectionSort(E[] list, Comparator<? super E> comparator) {
		E tempArea;
		int oldArea = 0;
		
		for (int i = 1; i < list.length; i++) {
			if (comparator.compare(list[oldArea], list[i]) == 1) {
				tempArea = list[i];
				list[i] = list[oldArea];
				list[oldArea] = tempArea;
				i = 0;
			}
				
			oldArea = i;
		}
		
	}

}