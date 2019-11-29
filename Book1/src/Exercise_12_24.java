import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Exercise_12_24 {
	final static String ASSOCIATE = "associate";
	final static String ASSISTANT = "assistant";
	final static String FULL = "full";
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	public Exercise_12_24() {
	}

	public static void main(String[] args) throws IOException {
		File file = new File("Salary.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		FileWriter writer = new FileWriter(file);
		Random random = new Random();
		for (int i = 1; i < 1001; i++) {
			StringBuilder all = new StringBuilder();
			String firstName = "FirstName" + i;
			all.append(firstName + " ");
			String lastName = "LastName" + i;
			all.append(lastName + " ");
			int a = random.nextInt(3);
			double salary = 0;
			switch (a) {
			case 0:
				all.append(ASSISTANT + " ");
				salary = ThreadLocalRandom.current().nextDouble(50000, 80001);
				all.append(df2.format(salary));
				all.append("\n");
				break;

			case 1:
				all.append(ASSOCIATE + " ");
				salary = ThreadLocalRandom.current().nextDouble(60000, 110001);
				all.append(df2.format(salary));
				all.append("\n");
				break;
			case 2:
				all.append(FULL + " ");
				salary = ThreadLocalRandom.current().nextDouble(75000, 130001);
				all.append(df2.format(salary));
				all.append("\n");
				break;

			default:
				throw new IllegalArgumentException("Unexpected value: " + a);
			}
			writer.append(all);

		}
		writer.close();

	}
}
