
public class NumberPatterPyramids {

	public NumberPatterPyramids() {
		
	}
	public static void main(String[] args) {

		for (int row = 1; row <= 8; row++) {
			
			for (int column = 7; column >= row; column--) {
				System.out.print("    ");
			}
//			for (int k = 1; k >= row; k--) {
//				System.out.print(" "+row);
//			}
//			for (int i = row; i > 1; i--) {
			
			for (int j = 0; j < row; j++) {
				System.out.printf("%4d", (int) Math.pow(2, j));
			}

			// Printing number decreamentally from i-2 to 0
			for (int j = row - 2; j >= 0; j--) {
				System.out.printf("%4d", (int) Math.pow(2, j));
			}
//				for (int j = 1, j2=1, j3=j2; j < row+1; j++, j2 =j2*2, j3 = j3/2) {
//					System.out.print("    "+j2);
//					System.out.print(" ");
//
//					
//				}
////				int c = 1;
////				int d = c;
////				int j2=1;
////				int j = 0;
//				
//				for (int j = row - 2; j >= 0; j--) {
//				    System.out.print("    "+(int) Math.pow(2, j));
////				    System.out.print(" " );
//				   }
//					
//				
//				
////			}

			System.out.println();
		}

	}

}
