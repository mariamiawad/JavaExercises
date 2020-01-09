package chapter17;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Exercise_17_01 {

	public Exercise_17_01() {

	}

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("Exercise17_01.txt");

		boolean append = file.exists();

		try (PrintWriter printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(file, append)))) {
			Random random = new Random();
			for (int i = 0; i < 100; i++) {
				printWriter.write(random.nextInt(100) + " ");
			}
		}
	}

}
