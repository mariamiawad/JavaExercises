import java.util.Scanner;

public class CheckSubstring {

	public CheckSubstring() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter string s1:");
		String s1 = inputScanner.next();
		System.out.println("Enter string s2:");
		String s2 = inputScanner.next();
		boolean flag = false;
		int n = 0;
		if(s1.contains(s2)) {
			flag = true;
		}
		if (flag) {
			System.out.println(s2 + " is a substring of " + s1);
		} else {
			System.out.println(s2 + " is not a substring of " + s1);
		}
	}

}
