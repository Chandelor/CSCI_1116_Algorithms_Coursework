/**
 * @author Chandelor
 * Date: 10/31/2023
 * This program has a linear time complexity.
 */

import java.util.Scanner;

public class Exercise_22_3 {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int index = 0;
		int matched = 0;

		System.out.print("Enter a String (string1): ");
		String string1 = input.nextLine();
		
		System.out.print("Enter a String (string2): ");
		String string2 = input.nextLine();

		for (int n = 0; n < string1.length(); n++) {
			
			if (string1.charAt(n) == string2.charAt(0) && index == 0) {
				index = n;
				matched++;
			}
			
			else if (string1.charAt(n) == string2.charAt(matched)) matched++;
			else {
				index = 0;
				matched = 0;
			}

			if (matched == string2.length()) break;
		}
			
		if (index > 1) System.out.println("The string \"" + string2 + "\" is a substring of \"" + string1 + "\"");
		else System.out.println("The string \"" + string2 + "\" is not a substring of \"" + string1 + "\".");
	}
	
}
