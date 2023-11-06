/**
 * @author Chandelor
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_8_37 {
	
	public static void main(String[] args) {
		
		String[][] stateCapital = {
		{"Alabama", "Montgomery"},
		{"Alaska", "Juneau"},
		{"Arizona", "Phoenix"},
		{"Arkansas", "Little Rock"},
		{"California", "Sacramento"},
		{"Colorado", "Denver"},
		{"Connecticut", "Hartford"},
		{"Delaware", "Dover"},
		{"Florida", "Tallahassee"},
		{"Georgia", "Atlanta"},
		{"Hawaii", "Honolulu"},
		{"Idaho", "Boise"},
		{"Illinois", "Springfield"},
		{"Indiana", "Indianapolis"},
		{"Iowa", "Des Moines"},
		{"Kansas", "Topeka"},
		{"Kentucky", "Frankfort"},
		{"Louisiana", "Baton Rouge"},
		{"Maine", "Augusta"},
		{"Maryland", "Annapolis"},
		{"Massachusettes", "Boston"},
		{"Michigan", "Lansing"},
		{"Minnesota", "Saint Paul"},
		{"Mississippi", "Jackson"},
		{"Missouri", "Jefferson City"},
		{"Montana", "Helena"},
		{"Nebraska", "Lincoln"},
		{"Nevada", "Carson City"},
		{"New Hampshire", "Concord"},
		{"New Jersey", "Trenton"},
		{"New York", "Albany"},
		{"New Mexico", "Santa Fe"},
		{"North Carolina", "Raleigh"},
		{"North Dakota", "Bismarck"},
		{"Ohio", "Columbus"},
		{"Oklahoma", "Oklahoma City"},
		{"Oregon", "Salem"},
		{"Pennsylvania", "Harrisburg"},
		{"Rhode Island", "Providence"},
		{"South Carolina", "Columbia"},
		{"South Dakota", "Pierre"},
		{"Tennessee", "Nashville"},
		{"Texas", "Austin"},
		{"Utah", "Salt Lake City"},
		{"Vermont", "Montpelier"},
		{"Virginia", "Richmond"},
		{"Washington", "Olympia"},
		{"West Virginia", "Charleston"},
		{"Wisconsin", "Madison"},
		{"Wyoming", "Cheyenne"}
		};
		
		Scanner input = new Scanner(System.in);
		int correctCount = 0;
		
		for (int i = 0; i < stateCapital.length; i++) {
			int randomState = (int) (Math.random() * stateCapital.length) + 0;
			if (stateCapital[randomState][0] != "") {
				// Prompt the user with a question
				System.out.print("What is the capital of " + stateCapital[randomState][0] + "? ");
				String capital = input.nextLine().trim().toLowerCase();
				
				if (capital.toLowerCase().equals(stateCapital[randomState][1].toLowerCase())) {
					System.out.println("Your answer is correct");
					correctCount++;
				}
				
				else System.out.println("The correct answer should be " + stateCapital[randomState][1]);
				stateCapital[randomState][0] = "";
				
				
			}
			
		}
		
//		ArrayList<ArrayList <String>> multi = new ArrayList<>();
//		ArrayList<String> single = new ArrayList<>();
//		ArrayList<String> single2 = new ArrayList<>();
//		
//		for(int i = 0; i < stateCapital.length; i++) {
//				single.add(stateCapital[i][0]);	
//				single2.add(stateCapital[i][1]);	
//		}
		
//		multi.add(single);
//		multi.add(single2);
//	
//		for(int i = 0; i < multi.get(1).size(); i++) {
//			for(int j = 0; j < multi.size(); j++) {
//				System.out.print(multi.get(j).get(i));
//				if (j == 0) System.out.print(", ");
//				else System.out.println();
//				}
		
//			}
		
//				System.out.println(multi.get(1).get(i));
//		}
		
		//System.out.println("The correct count is " + correctCount);
	}
	
}