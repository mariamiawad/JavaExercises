package chapter08;

import java.util.Random;
import java.util.Scanner;

public class Exercise_08_37 {

	public Exercise_08_37() {

	}

	public static void main(String[] args) {
		int count = 0;
		Scanner inputScanner = new Scanner(System.in);
		String[][] cities = { { "Alabama", "Montgomery" }, { "Alaska", "Juneau" }, { "Arizona", "Phoenix" },
				{ "Arkansas", "Little Rock" }, { "California", "Sacramento" }, { "Colorado", "Denver" },
				{ "Connecticut", "Hartford" }, { "Delaware", "Dover" }, { "Florida", "Tallahassee" },
				{ "Georgia", "Atlanta" }, { "Hawaii", "Honolulu" }, { "Idaho", "Boise" }, { "Illinois", "Springfield" },
				{ "Indiana", "Indianapolis" }, { "Iowa", "Des Moines" }, { "Kansas", "Topeka" },
				{ "Kentucky", "Frankfort" }, { "Louisiana", "Baton Rouge" }, { "Maine", "Augusta" },
				{ "Maryland", "Annapolis" }, { "Massachusetts", "Boston" }, { "Michigan", "Lansing" },
				{ "Minnesota", "St. Paul" }, { "Mississippi", "Jackson" }, { "Missouri", "Jefferson City" },
				{ "Montana", "Helena" }, { "Nebraska", "Lincoln" }, { "Nevada", "Carson City" },
				{ "New Hampshire", "Concord" }, { "New Jersey", "Trenton" }, { "New Mexico", "Santa Fe" },
				{ "New York", "Albany" }, { "North Carolina", "Raleigh" }, { "North Dakota", "Bismarck" },
				{ "Ohio", "Columbus" }, { "Oklahoma", "Oklahoma City" }, { "Oregon", "Salem" },
				{ "Pennsylvania", "Harrisburg" }, { "Rhode Island", "Providence" }, { "South Carolina", "Columbia" },
				{ "South Dakota", "Pierre" }, { "Tennessee", "Nashville" }, { "Texas", "Austin" },
				{ "Utah", "Salt Lake City" }, { "Vermont", "Montpelier" }, { "Virginia", "Richmond" },
				{ "Washington", "Olympia" }, { "West Virginia", "Charleston" }, { "Wisconsin", "Madison" },
				{ "Wyoming", "Cheyenne" } };

		for (int i = 0; i < cities.length; i++) {
				System.out.println("What is the capital of " + cities[i][0]);
				String capital = cities[i][1];
				String guess = inputScanner.next();
				if (guess.equalsIgnoreCase(capital)) {
					System.out.println("Your answer is correct");
					count++;
				} else {
					System.out.println("The correct answer should be " + cities[i][1]);
				}

			
		}
		System.out.println("The correct count is " + count);
	}

}
