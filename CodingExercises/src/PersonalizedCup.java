import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class PersonalizedCup {
public PersonalizedCup() {
	// TODO Auto-generated constructor stub
}
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int maxColumns = 20;

		String columnString = s.next();
		int columnCount = 0;
		int column = 0;
		int row = 0;
		columnCount = columnString.length();
		if (columnCount >= 0 || columnCount <= 100) {
			if (columnCount > maxColumns) {
				row = (int) (Math.ceil(columnCount / (maxColumns*1.0)));
				column = (int) Math.ceil((columnCount / Math.ceil(columnCount / (Math.ceil(maxColumns)))));
			} else {
				row = 1;
				column = columnCount;
			}
			if (row <= 5) {
				System.out.println(row + " " + column);
				int index = 0;
				int value = 0;
				int x = columnString.length();
				String colString = "";
				;
				value = (columnString.length() % column);
				int stars = (int)((row * column)-columnString.length()) ;
				for (int i = row; i > 0; i--) {
					if (stars > 0) {
						colString = columnString.substring(index, index + 1) + "*"
								+ columnString.substring(index + 1, index + column - 1);
						index += column - 1;
						stars = stars - 1;
					}

					else {
						colString = columnString.substring(index, index + column);
						index += column;
					}
					System.out.println(colString);

				}

			} else
				System.out.println("Can't Proceed");

		}
		s.close();
	
	} 

}
