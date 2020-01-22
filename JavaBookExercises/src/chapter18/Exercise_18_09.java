package chapter18;

public class Exercise_18_09 {
	public static void main(String[] args) {
		String value = "khaled";
		reverseDisplay(value);
	}
	public static void reverseDisplay(String value) {
		System.out.println(reverseDisplay(value, value.length()-1, ""));
	}
	
	public static String reverseDisplay(String value, int high, String string) {
		if (high<0) {
			return string;
		}
		string += value.substring(high, high+1);
		return reverseDisplay(value, high-1, string);
		
	}
}
