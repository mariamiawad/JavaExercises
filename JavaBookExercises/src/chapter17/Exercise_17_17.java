package chapter17;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercise_17_17 implements AutoCloseable {

	private FileOutputStream file;
	private char[] bits = new char[8];
	private int bitPos = 7;

	public Exercise_17_17(File file2) throws IOException {
		this.file = new FileOutputStream(file2);
		for (int i = 0; i < bits.length; i++) {
			bits[i] = '0';
		}
	}

	public void writeBit(char bit) throws IOException {
		if (bit != '0' && bit != '1') {
			throw new NumberFormatException();
		}
		writeBit(bit + "");

	}

	public void writeBit(String bit) throws IOException {
		for (int i = 0; i < bit.length(); i++) {
			if (bit.charAt(i) != '0' && bit.charAt(i) != '1') {
				throw new NumberFormatException();
			}
			bits[bitPos] = bit.charAt(i);
			bitPos--;
			String string = "";
			if (bitPos < 0) {
				try {
					for (int j = 0; j < bits.length; j++) {
						string += bits[j];
						bits[j] = '0';
					}
					file.write(String.valueOf(string).getBytes());
				} catch (NumberFormatException e) {
					e.printStackTrace();
				}
				bitPos = 7;
			}

		}

	}

	public void close() throws IOException {
		String string = "";
		for (int i = 0; i < bits.length; i++) {
			string += bits[i];
			bits[i] = '0';

		}
		file.write(String.valueOf(string).getBytes());

	}

	public static void main(String[] args) {

		File file = new File("Exercise17_17.dat");
		String bits = "010000100100001001101";

		try (Exercise_17_17 out = new Exercise_17_17(file)) {

			out.writeBit(bits);

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
