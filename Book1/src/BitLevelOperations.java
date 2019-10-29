import java.util.Scanner;

public class BitLevelOperations {

	public BitLevelOperations() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int x = inputScanner.nextInt();
		String string = "";
		if(x>=0) {
			int z =Integer.toBinaryString(x).length();
			for (int i = 0; i < 16-z; i++) {
				string +="0";
			}
			string+=Integer.toBinaryString(x);
		}
		else {
		string = Integer.toBinaryString(x);
		}
		System.out.println(string);
		
	}

}
