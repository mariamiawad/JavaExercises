
public class Exercise_10_22 {
	char[] chars;

	public Exercise_10_22(char[] chars) {
		this.chars = new char[chars.length];
		for (int i = 0; i < chars.length; i++) {
			this.chars[i] = chars[i];
		}
	}

	public char charAt(int index) {
		return chars[index];
	}

	public int length() {
		return chars.length;
	}

	public Exercise_10_22 substring(int begin, int end) {
		if (begin < 0 || end > chars.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		int size = end - begin;
		char[] chars = new char[size];
		for (int i = begin; i < chars.length; i++) {
			chars[i] = this.chars[i];
		}
		Exercise_10_22 exercise_10_22 = new Exercise_10_22(chars);
		return exercise_10_22;

	}

	public Exercise_10_22 toLowerCase() {
		for (int i = 0; i < chars.length; i++) {
			switch (chars[i]) {
			case 'A':
				chars[i] = 'a';
				break;
			case 'B':
				chars[i] = 'b';
				break;
			case 'C':
				chars[i] = 'c';
				break;
			case 'D':
				chars[i] = 'd';
				break;
			case 'E':
				chars[i] = 'e';
				break;
			case 'F':
				chars[i] = 'f';
				break;
			case 'G':
				chars[i] = 'g';
				break;
			case 'H':
				chars[i] = 'h';
				break;
			case 'I':
				chars[i] = 'i';
				break;
			case 'J':
				chars[i] = 'j';
				break;
			case 'K':
				chars[i] = 'k';
				break;
			case 'L':
				chars[i] = 'l';
				break;
			case 'M':
				chars[i] = 'm';
				break;
			case 'N':
				chars[i] = 'n';
				break;
			case 'O':
				chars[i] = 'o';
				break;
			case 'P':
				chars[i] = 'p';
				break;
			case 'Q':
				chars[i] = 'q';
				break;
			case 'R':
				chars[i] = 'r';
				break;
			case 'S':
				chars[i] = 's';
				break;
			case 'T':
				chars[i] = 't';
				break;
			case 'U':
				chars[i] = 'u';
				break;
			case 'V':
				chars[i] = 'v';
				break;
			case 'W':
				chars[i] = 'w';
				break;
			case 'X':
				chars[i] = 'x';
				break;
			case 'Y':
				chars[i] = 'y';
				break;
			case 'Z':
				chars[i] = 'z';
				break;

			}

		}
		Exercise_10_22 exercise_10_22 = new Exercise_10_22(chars);
		return exercise_10_22;
	}

	public boolean equals(Exercise_10_22 exercise_10_22) {
		if (chars.length != exercise_10_22.length()) {
			return false;
		}
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] != exercise_10_22.charAt(i)) {
				return false;
			}
		}
		return true;

	}

	public static Exercise_10_22 valueOf(int i) {
		int value = i;
		int count = 0;

		while (value > 0) {
			int d = value / 10;
			value = d;
			count++;
		}
		char[] chars = new char[count];

		for (int j = chars.length - 1; j >= 0; j--) {
			int d = i / 10;
			int k = i - d * 10;
			i = d;
			chars[j] = (char) (k + '0');
		}
		Exercise_10_22 exercise_10_22 = new Exercise_10_22(chars);
		return exercise_10_22;
	}

	public static void main(String[] args) {
		char[] chars = { 'a', 'B', 'C', 'e' };

		Exercise_10_22 exercise_10_22 = new Exercise_10_22(chars);
		for (int i = 0; i < exercise_10_22.length(); i++) {
			System.out.print(exercise_10_22.toLowerCase().charAt(i));
		}
		System.out.println();
		exercise_10_22 = exercise_10_22.substring(0, 2);
		for (int i = 0; i < exercise_10_22.length(); i++) {
			System.out.print(exercise_10_22.charAt(i));
		}
		System.out.println();
		for (int j = 0; j < Exercise_10_22.valueOf(123).length(); j++) {
			System.out.print(Exercise_10_22.valueOf(123).charAt(j));
		}
		System.out.println();
		char [] charss = {'1','2','3'};
		Exercise_10_22 exercise_10_222 = new Exercise_10_22(charss);
		System.out.println(exercise_10_222.equals(Exercise_10_22.valueOf(123)));
	}
}
