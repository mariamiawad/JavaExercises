package chapter18;

public class Exercise_18_08 {

	public Exercise_18_08() {
		// 
	}

	public static void main(String[] args) {
		reverseDisplay(123);
	}

	public static void reverseDisplay(int value) {
		if (value == 0) {
			return;
		}
		System.out.print(value % 10);
		reverseDisplay(value / 10);
	}

}
