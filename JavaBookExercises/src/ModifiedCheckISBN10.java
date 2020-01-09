import java.util.Scanner;

public class ModifiedCheckISBN10 {

	public ModifiedCheckISBN10() {
		// 
	}
public static void main(String[] args) {
	Scanner inputScanner = new Scanner(System.in);
	System.out.println("Enter the first 9 digits of an ISBN");
	String string = inputScanner.next();
	int sum = 0;
	int multiplier =0;
	for (int i = 0; i <string.length(); i++) {
		sum += Integer.parseInt(string.substring(i, i+1))*(i+1);
	}
	int result = sum%11;
	String resultString ="";
	if(result==10) {
		resultString =string+"X";
	}
	else {
		resultString = string +"" +result;
	}
	System.out.println("The ISBN-10 number is " + resultString);
}

}
