import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Exercise_17_04 {

	public Exercise_17_04() {
	}

	public static void main(String[] args) throws IOException {
		try (BufferedReader in = new BufferedReader(new FileReader(new File("Exercise_17_04.txt")));
				DataOutputStream out = new DataOutputStream(new FileOutputStream("Exercise_17_04.dat"));) {
			String string = "";
			int fileCount = 0;
			while ((string = in.readLine()) != null) {
				out.writeUTF(string);
				fileCount += string.length();

			}
			

			System.out.println("Text size = " + fileCount + " Binary size = " + out.size());

		}
	}
}
