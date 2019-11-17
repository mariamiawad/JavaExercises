
public class Exercise_19_01_Test {

	public Exercise_19_01_Test() {
		
	}
	public static void main(String[] args) {
		Exercise_19_01_Stack<Integer>stack = new Exercise_19_01_Stack<>();
		System.out.println(stack.isEmpty());
		for (int i = 0; i <10; i++) {
			stack.push(i);
		}
		System.out.println(stack.isEmpty());
		System.out.println(stack.peek());
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
}
