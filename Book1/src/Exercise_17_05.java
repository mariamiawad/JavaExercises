import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Date;

public class Exercise_17_05 {

	public Exercise_17_05() {

	}

	public static void main(String[] args)  {

		try (FileOutputStream file = new FileOutputStream("Exercise_17_05.dat");
				ObjectOutputStream outputStream = new ObjectOutputStream(file);){
			int [] number = {1,2,3,4,5};
			outputStream.writeObject(number);
			Date date = new Date();
			outputStream.writeDouble(5.5);
			
			outputStream.writeObject(date);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
