package chapter20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise_20_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int correctCount = 0;
		List<String>list;
	ArrayList<List<String>>arrayList = new ArrayList<>();
	for (int i = 0; i < stateCapitals.length; i++) {
		list =  new ArrayList<>();
		list.add(stateCapitals[i][0]);
		list.add(stateCapitals[i][1]);
		arrayList.add(list);
	}
	Collections.shuffle(arrayList);
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.print("What is the capital of " + arrayList.get(i).get(0) + "? ");
			String s = input.nextLine();
			if (s.equalsIgnoreCase(arrayList.get(i).get(1))) {
				System.out.println("Your answer is correct!");
				correctCount++;
			} else {
				System.out.println("WRONG - The correct answer is " + arrayList.get(i).get(1));
			}
		}
		System.out.println("The correct count is " + correctCount);
	}
	 
  

  private static String[][] stateCapitals = {
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
                  {"Maryland", "Annapolis"},
                  {"Minnesota", "Saint Paul"},
                  {"Iowa", "Des Moines"},
                  {"Maine", "Augusta"},
                  {"Kentucky", "Frankfort"},
                  {"Indiana", "Indianapolis"},
                  {"Kansas", "Topeka"},
                  {"Louisiana", "Baton Rouge"},
                  {"Oregon", "Salem"},
                  {"Oklahoma", "Oklahoma City"},
                  {"Ohio", "Columbus"},
                  {"North Dakota", "Bismark"},
                  {"New York", "Albany"},
                  {"New Mexico", "Santa Fe"},
                  {"New Jersey", "Trenton"},
                  {"New Hampshire", "Concord"},
                  {"Nevada", "Carson City"},
                  {"Nebraska", "Lincoln"},
                  {"Montana", "Helena"},
                  {"North Carolina", "Raleigh"},
                  {"Missouri", "Jefferson City"},
                  {"Mississippi", "Jackson"},
                  {"Massachusetts", "Boston"},
                  {"Michigan", "Lansing"},
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
}
