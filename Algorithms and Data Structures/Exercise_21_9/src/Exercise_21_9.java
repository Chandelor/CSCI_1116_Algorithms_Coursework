/**
 * @author Chandelor
 */

import java.util.HashMap;
import java.util.Scanner;

public class Exercise_21_9 {
	
	public static void main(String[] args) {
		
		HashMap<String, String> stateCapital = new HashMap<>();
		
		stateCapital.put("ALABAMA", "Montgomery");
		stateCapital.put("ALASKA", "Juneau");
		stateCapital.put("ARIZONA", "Phoenix");
		stateCapital.put("ARKANSAS", "Little Rock");
		stateCapital.put("CALIFORNIA", "Sacramento");
		stateCapital.put("COLORADO", "Denver");
		stateCapital.put("CONNECTICUT", "Hartford");
		stateCapital.put("DELAWARE", "Dover");
		stateCapital.put("FLORIDA", "Tallahassee");
		stateCapital.put("GEORGIA", "Atlanta");
		stateCapital.put("HAWAII", "Honolulu");
		stateCapital.put("IDAHO", "Boise");
		stateCapital.put("ILLINOIS", "Springfield");
		stateCapital.put("INDIANA", "Indianapolis");
		stateCapital.put("IOWA", "Des Moines");
		stateCapital.put("KANSAS", "Topeka");
		stateCapital.put("KENTUCKY", "Frankfort");
		stateCapital.put("LOUISIANA", "Baton Rouge");
		stateCapital.put("MAINE", "Augusta");
		stateCapital.put("MARYLAND", "Annapolis");
		stateCapital.put("MASSACHUSETTES", "Boston");
		stateCapital.put("MICHIGAN", "Lansing");
		stateCapital.put("MINNESOTA", "Saint Paul");
		stateCapital.put("MISSISSIPPI", "Jackson");
		stateCapital.put("MISSOURI", "Jefferson City");
		stateCapital.put("MONTANA", "Helena");
		stateCapital.put("NEBRASKA", "Lincoln");
		stateCapital.put("NEVADA", "Carson City");
		stateCapital.put("NEW HAMPSHIRE", "Concord");
		stateCapital.put("NEW JERSEY", "Trenton");
		stateCapital.put("NEW YORK", "Albany");
		stateCapital.put("NEW MEXICO", "Santa Fe");
		stateCapital.put("NORTH CAROLINA", "Raleigh");
		stateCapital.put("NORTH DAKOTA", "Bismarck");
		stateCapital.put("OHIO", "Columbus");
		stateCapital.put("OKLAHOMA", "Oklahoma City");
		stateCapital.put("OREGON", "Salem");
		stateCapital.put("PENNSYLVANIA", "Harrisburg");
		stateCapital.put("RHODE ISLAND", "Providence");
		stateCapital.put("SOUTH CAROLINA", "Columbia");
		stateCapital.put("SOUTH DAKOTA", "Pierre");
		stateCapital.put("TENNESSEE", "Nashville");
		stateCapital.put("TEXAS", "Austin");
		stateCapital.put("UTAH", "Salt Lake City");
		stateCapital.put("VERMONT", "Montpelier");
		stateCapital.put("VIRGINIA", "Richmond");
		stateCapital.put("WASHINGTON", "Olympia");
		stateCapital.put("WEST VIRGINIA", "Charleston");
		stateCapital.put("WISCONSIN", "Madison");
		stateCapital.put("WYOMING", "Cheyenne");
		
		Scanner input = new Scanner(System.in);
		String userState = "";
		
		System.out.println("Enter a State to get its Capital or type stop to close program.");
		
		while (!userState.equalsIgnoreCase("stop")) {
			System.out.print("Capital: ");
			userState = input.nextLine();
			
			if (stateCapital.containsKey(userState.toUpperCase())) System.out.println("The Capital of " + userState + " is " + stateCapital.get(userState.toUpperCase()));
			else if (userState.equalsIgnoreCase("stop")) break;
			else System.out.println("Invalid State");
		}
		
	}
	
}
