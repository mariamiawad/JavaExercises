package chapter18;

public class Exercise_18_16 {
	public static void main(String[] args) {
		String nameString ="Mariam";
		char [] chars = nameString.toCharArray();
		System.out.println(count(chars));
	}
	public static int count(char[] chars) {
		return count(chars, 0);
	}
	public static int count(char[] chars, int high) {
		if (high>=chars.length) {
			return 0;
		}
		if (Character.isUpperCase(chars[high])) {
			return 1+ count(chars,high+1);
		}
		return count(chars, high+1);
	}
}
