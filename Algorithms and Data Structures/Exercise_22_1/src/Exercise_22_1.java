/**
 * @author Chandelor
 * Date: 10/30/2023
 * This program has a linear time complexity.
 */
import java.util.Scanner;

public class Exercise_22_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a String: ");
		String userString = input.next();
		
		String currentString = "";
		String maxString = "";
		for (int i = 0; i < userString.length(); i++) {
			
			// Stores character in current string if it does not already contain it.
			if (currentString.indexOf(userString.charAt(i)) < 0) {
				currentString += userString.charAt(i);
			}
			
			// Stores substring if it is larger than the last and resets the current String to the current character.
			else {
				if (currentString.length() > maxString.length()) maxString = currentString;
				currentString = "" + userString.charAt(i);
			}
			
		}
		
		System.out.println(maxString);
	}

}
