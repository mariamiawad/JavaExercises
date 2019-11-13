import java.util.Scanner;

public class Exercise_07_34 {

	public Exercise_07_34() {
	}
	
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		String s = inputScanner.next();
		 s = sort(s);
		 System.out.println(s);
		
	}
	
	
	public static String sort(String s) {
		s = s.toLowerCase();
		char temp = s.charAt(0);
		char[] tempString = s.toCharArray();
		for (int i = 1; i < tempString.length; i++) {
			if(temp>tempString[i]) {
				temp = tempString[i];
				tempString[i]= tempString[i-1];
				tempString[i-1]= temp;	
			}
			temp = tempString[i];
			
		}
		s="";
		for (int i = 0; i < tempString.length; i++) {
			s+= tempString[i];
		}
		return s;
	}
}
