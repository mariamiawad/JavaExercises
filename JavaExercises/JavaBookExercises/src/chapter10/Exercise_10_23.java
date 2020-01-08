package chapter10;

public class Exercise_10_23 {
	private Exercise_10_22 ss;

	public Exercise_10_23(String s) {
		this.ss = new Exercise_10_22(s.toCharArray());

	}

	public int compare(String s) {

		if (this.ss.equals(new Exercise_10_22(s.toCharArray()))) {
			return 0;
		} else {
			return -1;
		}
	}

	public Exercise_10_23 substring(int begin) {
		String string = "";
		Exercise_10_22 s = this.ss.substring(begin, ss.length());
		for (int i = 0; i < s.length(); i++) {
			string += s.charAt(i);
		}
		return new Exercise_10_23(string);
	}

	public Exercise_10_23 toUpperCase() {
		char[] chars = new char[ss.length()];
		for (int i = 0; i < chars.length; i++) {
			chars[i] = ss.charAt(i);
		}
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
		String string = "";
		for (int j = 0; j < chars.length; j++) {
			string += chars[j];
		}
		return new Exercise_10_23(string);

	}

	public char[] toChars() {
		char[] chars = new char[ss.length()];
		for (int i = 0; i < ss.length(); i++) {
			chars[i] = ss.charAt(i);
		}
		return chars;
	}

	public static Exercise_10_23 valueOf(boolean b) {
		if (b) {
			return new Exercise_10_23("true");

		}
		return new Exercise_10_23("false");
	}
	
	 public static void main(String[] args) {
	        Exercise_10_23 exercise_10_23 = new Exercise_10_23("Mariam");
	       char [] chars = exercise_10_23.toChars();
	       for (int i = 0; i < chars.length; i++) {
	    	   System.out.print(chars[i]);
		}
	       System.out.println();
	       exercise_10_23 = exercise_10_23.toUpperCase();
	       for (int i = 0; i < exercise_10_23.toChars().length; i++) {
			System.out.print(exercise_10_23.toChars()[i]);
		}
	       System.out.println();
	       exercise_10_23 = exercise_10_23.substring(2);
	       for (int i = 0; i < exercise_10_23.toChars().length; i++) {
				System.out.print(exercise_10_23.toChars()[i]);
			}
		 System.out.println();
		for (int i = 0; i < Exercise_10_23.valueOf(true).toChars().length; i++) {
			System.out.print(Exercise_10_23.valueOf(true).toChars()[i]);
		}
		System.out.println();
		System.out.println(exercise_10_23.compare("ARIAM"));
	    }
}
