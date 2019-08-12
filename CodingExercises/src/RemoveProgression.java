import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveProgression {

	public RemoveProgression() {
		// TODO Auto-generated constructor stub
	}
	public static int getElement(int x , int y) {

		
		return 2*y;
		
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println(getElement(input.nextInt(), input.nextInt()));
		}
		input.close();
	}
	

}
