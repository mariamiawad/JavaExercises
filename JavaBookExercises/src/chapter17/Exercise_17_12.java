package chapter17;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise_17_12 {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		PrintWriter pw = new PrintWriter("output.txt");
		List<String>list = new ArrayList<>();
		String string ="";
		while (!(string= scanner.next()).equals("B")) {
			list.add(string);
			
		}
		Object[] fileNames = list.toArray();
		for (Object fileName : fileNames) {

			File f = new File((String) fileName);

			BufferedReader br = new BufferedReader(new FileReader(f));
			

			String line = br.readLine();
			while (line != null) {
				pw.println(line);
				line = br.readLine();
			}
			pw.flush();
			
		}
		
	}

}
