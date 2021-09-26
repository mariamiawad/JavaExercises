package studyplanleetcode;

public class ReverseWordsInAString_III {
	public static String reverseString(char[] s) {
		for (int i = 0, j = s.length - 1; i < s.length / 2 && j >= s.length / 2; i++, j--) {
			char c = s[i];
			s[i] = s[j];
			s[j] = c;
		}
		String string = "";
		for (int i = 0; i < s.length; i++) {
			string+= s[i];
		}
		return string;
	}
	 public static String reverseWords(String s) {
		 String string = "";
		 	String[] strings = s.split(" ");
		 	for (int i = 0; i < strings.length; i++) {
				string += reverseString(strings[i].toCharArray()) + " ";
			}
	        return string.trim();
	    }
	 public static void main(String[] args) {
		String string = "Let's take LeetCode contest";
		System.out.println(reverseWords(string));
	}
}

