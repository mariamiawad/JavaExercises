package chapter12;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise_12_18 {

	public static void main(String[] args) {

		File file = null;
		try {

			
			 
			for (int i = 1; i < 6; i++) {

				String string = "";
				file = new File("C:\\Users\\maria\\eclipse-workspace\\Book1\\src\\srcRootDirectory\\chapter" + i + "\\Chapter"+i + ".java");
				Scanner input = new Scanner(file);
				while (input.hasNext()) {
					string += input.nextLine();
				}
				 PrintWriter printWriter = new PrintWriter(file);
				String packageString = "package srcRootDirectory.chapter" + i + ";\n";
				packageString += string;
				printWriter.write(packageString);
				printWriter.close();
				input.close();

			}
			

		} catch (FileNotFoundException e) {
	
			e.printStackTrace();
		}
	}

}
