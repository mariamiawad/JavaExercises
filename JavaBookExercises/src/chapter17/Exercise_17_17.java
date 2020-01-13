package chapter17;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercise_17_17 implements AutoCloseable {

	private FileOutputStream file;
	private int[] bits = new int[8];
	private int bitPos = 7;

	public Exercise_17_17(File file2) throws IOException {
		this.file = new FileOutputStream(file2);
	}

	public void writeBit(char bit) throws IOException {
		if (bit != '0' || bit != '1') {
			throw new IllegalArgumentException();
		}
		if (bitPos < 0) {
			try {
				for (int i = 0; i < bits.length; i++) {
					file.write(bits[i]);
				}
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
			bitPos = 7;
		}
		bits[bitPos] = bit;
		bitPos--;

	}

	public void writeBit(String bit) throws IOException {
		for (int i = bit.length() - 1; i >= 0; i--) {
			writeBit(bit.charAt(i));
		}
	}

	public void close() {
		for (int i = 0; i < bits.length; i++) {
			if (bits[i] != 0) {
				try {
					file.write(bits[i]);
				} catch (IOException e) {
					e.printStackTrace();
				}
				bits[i] = 0;
			}
		}

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
