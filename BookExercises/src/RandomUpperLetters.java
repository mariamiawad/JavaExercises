
public class RandomUpperLetters {

	public RandomUpperLetters() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		char s = (char)('A'+(Math.random()*26)%26);
		System.out.println(s);
	}

}
