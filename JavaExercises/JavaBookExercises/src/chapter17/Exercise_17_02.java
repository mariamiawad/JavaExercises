package chapter17;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Exercise_17_02 {

	public Exercise_17_02() {
		// 
	}
	public static void main(String[] args) throws IOException {
		File file = new File("Exercise17_02.dat");

		boolean append = file.exists();

		try (PrintWriter printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(file, append)))) {
			Random random = new Random();
			for (int i = 0; i < 100; i++) {
				printWriter.print(random.nextInt(100) + " ");
			}
		}
	}
}
