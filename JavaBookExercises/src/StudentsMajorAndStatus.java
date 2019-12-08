import java.util.Scanner;

public class StudentsMajorAndStatus {

	public StudentsMajorAndStatus() {
		// 
	}
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter two characters:");
		String temp = inputScanner.next();
		char major = temp.charAt(0);
		char status =temp.charAt(1);
		switch (major) {
		case 'M':
			System.out.print("Mathematics ");
			if(status == '1') {
				System.out.println("Freshman");
			}
			else if(status == '2') {
				System.out.println("Sophomore");
			}
			else if(status == '3') {
				System.out.println("Junior");
			}
			else if(status == '4') {
				System.out.println("Senior");
			}
			else {
				System.out.println("Invalid input");
			}
			break;
			
		case 'C':
			System.out.print("Computer Science ");
			if(status == '1') {
				System.out.println("Freshman");
			}
			else if(status == '2') {
				System.out.println("Sophomore");
			}
			else if(status == '3') {
				System.out.println("Junior");
			}
			else if(status == '4') {
				System.out.println("Senior");
			}
			else {
				System.out.println("Invalid input");
			}
			break;
		case 'I':
			System.out.print("Computer Science ");
			if(status == '1') {
				System.out.println("Freshman");
			}
			else if(status == '2') {
				System.out.println("Sophomore");
			}
			else if(status == '3') {
				System.out.println("Junior");
			}
			else if(status == '4') {
				System.out.println("Senior");
			}
			else {
				System.out.println("Invalid input");
			}
			break;
		default:
			System.out.println("Invalid input");
			break;
		}
	}

}
