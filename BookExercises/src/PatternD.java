
public class PatternD {

	public PatternD() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {


		for (int row = 1; row < 7; row++) {
			for (int column = 1; column<row; column++) {
				System.out.print("  ");
			}
			
			for (int i =1; i <8-row; i++) {
				System.out.print(i);
				System.out.print(" ");
			}
			
			
		

			System.out.println();
		}

	
	}

}