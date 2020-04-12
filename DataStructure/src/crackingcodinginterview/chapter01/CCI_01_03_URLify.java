package crackingcodinginterview.chapter01;

public class CCI_01_03_URLify {

	public char[] urlify(char[] s, int trueLength) {
		String string = "";
		for (int i = 0; i < trueLength; i++) {
			if (Character.isSpace(s[i])) {
				string += "%20";
				continue;
			}
			string += s[i];
		}
		return string.toCharArray();
	}

	public static void main(String[] args) {
		CCI_01_03_URLify client = new CCI_01_03_URLify();
		System.out.println(client.urlify("Mr John Smith    ".toCharArray(), 13)); // should print Mr%20John%20Smith
		System.out.println(client.urlify("Mariam Awad  ".toCharArray(), 11)); // should print Mariam%20Awad

	}

}
