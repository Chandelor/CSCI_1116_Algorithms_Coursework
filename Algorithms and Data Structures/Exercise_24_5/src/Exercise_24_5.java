/**
 * @author Chandelor
 */
import java.util.Scanner;

public class Exercise_24_5 {
	
	static GenericQueue que = new GenericQueue();
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Amount of numbers to add to list: ");
		int count = input.nextInt();
		fillRandom(count);
		printText();
	}
	
	public static void fillRandom(int count) {

		for (;count > 0; count--) {
			int number = (int) (Math.random() * 100) + 0;
			que.enqueue(number);
		}
		
	}
	
	public static void printText() {
		System.out.println("List: " + que.list);
		System.out.println("Size: " + que.getSize());
		
		System.out.println();
		que.dequeue();
		System.out.println("List after dequeue: " + que.list);
		System.out.println("Size after dequeue: " + que.getSize());
	}

}
