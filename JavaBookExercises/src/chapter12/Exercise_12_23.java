package chapter12;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Exercise_12_23 {

	public Exercise_12_23() {
	}
	public static void main(String[] args) {
		int count =0;
		double totalScores = 0;
		try {
			URL url = new URL("http://m.uploadedit.com/bbtc/1574004572604.txt");
			Scanner inputScanner = new Scanner(url.openStream());
			while (inputScanner.hasNext()) {
				totalScores += inputScanner.nextDouble();
				count++;
				
			}
		} catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		double averageScore = totalScores/count;
		System.out.println("Total Scores = " + totalScores);
		System.out.println("Average Scores = " + averageScore);
	}

}
