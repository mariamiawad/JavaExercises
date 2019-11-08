import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Exercise_17_08 {

	public Exercise_17_08() {

	}

	public static void main(String[] args) {
		File file = new File("Exercise17_08.dat");
		try (RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");) {
			int count = (randomAccessFile.length() != 0) ? randomAccessFile.readByte() + 1 : 1;
			randomAccessFile.seek(0);
			randomAccessFile.writeByte(count);
			System.out.println("The count is " + count);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
