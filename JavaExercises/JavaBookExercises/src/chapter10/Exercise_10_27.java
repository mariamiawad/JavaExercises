package chapter10;

public class Exercise_10_27 {
	private char[] chars;

	public Exercise_10_27(String s) {
		this.chars = s.toCharArray();
	}

	public Exercise_10_27 append(Exercise_10_27 s) {
		return new Exercise_10_27(toString() + s.toString());
	}

	public Exercise_10_27 append(int i) {
		String tempString = "";
		for (int j = 0; j < chars.length; j++) {
			tempString += chars[j];
		}
		tempString += Integer.toString(i);
		return new Exercise_10_27(tempString);
	}

	public int length() {
		return chars.length;
	}

	public char charAt(int index) {
		return chars[index];
	}

	public Exercise_10_27 toLowerCase() {
		String tempString = "";
		for (int i = 0; i < chars.length; i++) {
			chars[i] = Character.toLowerCase(chars[i]);
			tempString += Character.toString(chars[i]);
		}
		return new Exercise_10_27(tempString);

	}

	public Exercise_10_27 substring(int begin, int end) {
		String tempString = "";
		for (int i = begin; i < end; i++) {
			tempString += chars[i];
		}
		return new Exercise_10_27(tempString);
	}

	@Override
	public String toString() {
		String tempString = "";
		for (int i = 0; i < chars.length; i++) {
			tempString += chars[i];
		}
		return tempString;
	}
	public static void main(String[] args) {

        Exercise_10_27 s = new Exercise_10_27("ButtonDemo");
        System.out.println(s.toString());
        System.out.println(s.append(100).toString());
        System.out.println(s.toString());
        System.out.println("lowercase = " + s.toLowerCase());
        System.out.println("substring 0 3: " + s.substring(0, 3));

    }
}
