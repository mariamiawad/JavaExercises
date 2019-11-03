import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class Exercise_17_01 {

	public Exercise_17_01() {
	
	}
	public static void main(String[] args) throws IOException {
		
		File file = new File("Exercise_17_01.txt");
		try {
			
			FileOutputStream outputStream  = null;
			if (file.exists()) {
				outputStream = new FileOutputStream(file, true);
			}
			else {
				outputStream = new FileOutputStream(file);
			}
			Random random = new Random();
			for (int i = 0; i < 100; i++) {
				int intRandom = random.nextInt(1000);
				outputStream.write(intRandom);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
