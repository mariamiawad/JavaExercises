package chapter10;

public class Exercise_10_28 {
	private char[] chars;

	public Exercise_10_28() {
		this.chars = new char[20];
	}

	public Exercise_10_28(char[] chars) {
		this.chars = chars;
	}

	public Exercise_10_28(String s) {
		this.chars = s.toCharArray();
	}

	public int length() {
		return this.chars.length;
	}

	public char charAt(int i) {
		return this.chars[i];
	}

	public Exercise_10_28 insert(int offset, Exercise_10_28 s) {
		char[] temp = new char[s.length() + chars.length];
		for (int i = 0; i < offset; i++) {
			temp[i] = this.chars[i];
		}
		for (int i = 0; i < s.length(); i++) {
			temp[offset + i] = s.charAt(i);
		}
		for (int i = offset + s.length(); i < temp.length; i++) {
			temp[i] = this.chars[offset++];
		}
		return new Exercise_10_28(temp);
	}

	public Exercise_10_28 reverse() {
		char[] temp = new char[this.chars.length];
		int j = 0;
		for (int i = this.chars.length - 1; i >= 0; i--, j++) {
			temp[j] = this.chars[i];
		}
		return new Exercise_10_28(temp);
	}

	public Exercise_10_28 substring(int begin) {
		char[] chars = new char[this.chars.length - begin];
		for (int i = begin; i < chars.length; i++) {
			chars[i] = this.chars[i];
		}
		return new Exercise_10_28(chars);
	}

	public Exercise_10_28 toUpperCase() {

		for (int i = 0; i < chars.length; i++) {
			switch (chars[i]) {
			case 'a':
				chars[i] = 'A';
				break;
			case 'b':
				chars[i] = 'B';
				break;
			case 'c':
				chars[i] = 'C';
				break;
			case 'd':
				chars[i] = 'D';
				break;
			case 'e':
				chars[i] = 'E';
				break;
			case 'f':
				chars[i] = 'F';
				break;
			case 'g':
				chars[i] = 'G';
				break;
			case 'h':
				chars[i] = 'H';
				break;
			case 'i':
				chars[i] = 'I';
				break;
			case 'j':
				chars[i] = 'J';
				break;
			case 'k':
				chars[i] = 'K';
				break;
			case 'l':
				chars[i] = 'L';
				break;
			case 'm':
				chars[i] = 'M';
				break;
			case 'n':
				chars[i] = 'N';
				break;
			case 'o':
				chars[i] = 'O';
				break;
			case 'p':
				chars[i] = 'P';
				break;
			case 'q':
				chars[i] = 'Q';
				break;
			case 'r':
				chars[i] = 'R';
				break;
			case 's':
				chars[i] = 'S';
				break;
			case 't':
				chars[i] = 'T';
				break;
			case 'u':
				chars[i] = 'U';
				break;
			case 'v':
				chars[i] = 'V';
				break;
			case 'w':
				chars[i] = 'W';
				break;
			case 'x':
				chars[i] = 'X';
				break;
			case 'y':
				chars[i] = 'Y';
				break;
			case 'z':
				chars[i] = 'Z';
				break;

			}

		}

		return new Exercise_10_28(chars);

	}
	@Override
	public String toString() {
		String string = "";
		for (int i = 0; i < chars.length; i++) {
			string += chars[i];
		}
		return string;
	}

	public static void main(String[] args) {

		Exercise_10_28 temp = new Exercise_10_28("temp123");
		System.out.println("inserting INSERT at index 1: " + temp.insert(1, new Exercise_10_28("INSERT")).toString());
		System.out.println("reverse temp123: " + temp.reverse().toString());
		System.out.println("to upper: " + temp.toUpperCase().toString());
	}

}
