package chapter19;

public class Exercise_19_02_Test {

	public Exercise_19_02_Test() {
	}
	public static void main(String[] args) {
		
		Exercise_19_02_Stack<Integer> stack = new Exercise_19_02_Stack<>();
		System.out.println(stack.isEmpty());
		for (int i = 0; i < 10; i++) {
			stack.add(i);
		}
		System.out.println(stack.isEmpty());
		System.out.println(stack.peek());
		for (int i = 0; i <10; i++) {
			System.out.println(stack.pop());
		}
		System.out.println(stack.isEmpty());
		
	}
}
