package chapter18;

public class Exercise_18_15 {
	public static void main(String[] args) {
		String str = "mariam";
		System.out.println(count(str, 'm'));
	}
	public static int count(String str, char a) {
		return count(str, a, 0);
	}

	public static int count(String str, char a, int high) {
		if (high >= str.length()) {
			return 0;
		}
		if (str.charAt(high) == a) {
			return 1 + count(str, a, high + 1);
		}
		return count(str, a, high + 1);
	}
}
