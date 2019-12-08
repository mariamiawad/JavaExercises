import java.util.Random;

public class GeneratePlateNumber {

	public GeneratePlateNumber() {
		// 
	}
	public static void main(String[] args) {
		Random random = new Random();
		String string ="";
		for (int i = 0; i < 3; i++) {
			char c = (char)(random.nextInt(26) + 'a');
			string +=c;
			
		}
		string = string.toUpperCase();
		for (int i = 0; i < 4; i++) {
			string +=random.nextInt(10);
		}
		System.out.println(string);
	}
	

}
