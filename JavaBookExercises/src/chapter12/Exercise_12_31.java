package chapter12;

import java.io.File;
import java.util.Scanner;

public class Exercise_12_31 {
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter the year:");
		int year = inputScanner.nextInt();
		System.out.println("Enter the gender");
		String gender = inputScanner.next();
		System.out.println("Enter the name");
		String name = inputScanner.next();
		String fileName = "BabyName/babynameranking" + year + ".txt";
		File file = new File(fileName);
		int rank = 0;
		try {
			Scanner read = new Scanner(file);
			while (read.hasNext()) {

				String s = read.nextLine();
				String[] temp = s.split(" ");

				if (gender.equalsIgnoreCase("M") && temp[1].contains(name))
					rank = new Integer(temp[0]);
				else if (temp[3].contains(name))
					rank = new Integer(temp[0]);
			}
		} catch (Exception e) {

		}

        if (rank == 0) {
            System.out.println("The name "+name+" is not ranked in year " + year);
        } else {

            System.out.println(name+" is ranked #"+rank+" in year "+ year);
        }
	}
}
