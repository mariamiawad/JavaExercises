public class Exercise_06_38 {
public static void main(String[] args) {
	char [] chars = new char[100];
	char [] digits = new char[100];
		for (int i = 0; i < 100; i++) {
			chars[i]= getRandomUpperCaseLetter();
			digits [i] = getRandomDigitCharacter();
		}
		for (int i = 0; i < digits.length; i++) {
			if (i%10==0 && i!=0) {
				System.out.println();
			}
			System.out.print(chars[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < chars.length; i++) {
			if (i%10==0 && i!=0) {
				System.out.println();
			}
			System.out.print(digits[i]+" ");
		}
	}
	/** Generate a random character between ch1 and ch2 */
	public static char getRandomCharacter(char ch1, char ch2) {
		return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
	}

	/** Generate a random lowercase letter */
	public static char getRandomLowerCaseLetter() {
		return getRandomCharacter('a', 'z');
	}

	/** Generate a random uppercase letter */
	public static char getRandomUpperCaseLetter() {
		return getRandomCharacter('A', 'Z');
	}

	/** Generate a random digit character */
	public static char getRandomDigitCharacter() {
		return getRandomCharacter('0', '9');
	}

	/** Generate a random character */
	public static char getRandomCharacter() {
		return getRandomCharacter('\u0000', '\uFFFF');
	}
	
}