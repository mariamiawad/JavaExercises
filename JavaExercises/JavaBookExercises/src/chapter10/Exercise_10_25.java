package chapter10;
import java.util.ArrayList;
import java.util.Arrays;

public class Exercise_10_25 {

	public Exercise_10_25() {

	}

	public static void main(String[] args) {
		String s = "ab#12#453";
		String regex = "#";
		String[] strings = split("a?b?gf#e", "[?#]");
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
	}

	public static String[] split(String s, String regex) {
		ArrayList<String> strings = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			strings.add(s.charAt(i) + "");

		}
		ArrayList<String> list = new ArrayList<String>();
		String string = "";
		boolean flag = true;
		for (int i = 0; i < strings.size(); i++) {
			flag = true;
			for (int j = 0; j < regex.length(); j++) {
				if (strings.get(i).equals(regex.charAt(j) + "")) {
					if (!string.isEmpty()) {
						list.add(string);
					}

					list.add(strings.get(i));
					string = "";
					flag = false;
					break;
				}

			}
			if (!flag) {

				continue;

			} else {
				string += strings.get(i);
			}

		}
		if (!string.isEmpty()) {
			list.add(string);
		}
		if (list.size() > 0) {
			String[] strings2 = new String[list.size()];
			for (int i = 0; i < list.size(); i++) {
				strings2[i] = list.get(i);
			}
			return strings2;
		}
		return null;
	}

}
