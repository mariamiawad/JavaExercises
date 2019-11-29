
public class Exercise_18_10 {

	public Exercise_18_10() {

	}

	public static void main(String[] args) {
		System.out.println(count("mariam", 'm'));
	}

	public static int count(String str, char a) {
		str = str.toLowerCase();
		a = Character.toLowerCase(a);

		int size = str.length();
		if (size == 0) {
			return 0;
		}
		size--;
		if (str.charAt(size) == a) {
			str = str.substring(0, size);
			return count(str, a) + 1;

		} else {

			return count(str.substring(0, size), a);
		}

	}

}
