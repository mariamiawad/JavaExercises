package chapter17;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Exercise_17_03 {

	public Exercise_17_03() {

	}

	public static void main(String[] args) {
		;
		try {
			DataOutputStream outputStream = outputStream = new DataOutputStream(
					new FileOutputStream("Exercise_17_3.dat"));
			DataInputStream inputStream = new DataInputStream(new FileInputStream("Exercise_17_3.dat"));

			Random random = new Random();
			for (int i = 0; i < 100; i++) {
				outputStream.write(random.nextInt(100));
			}
			int sum = 0;
			int temp = 0;
			while ((temp = inputStream.read()) != -1) {
				sum += temp;
			}
			System.out.println("The sum = " + sum);
		} catch (IOException e) {
	
			e.printStackTrace();
		}
	}
}
