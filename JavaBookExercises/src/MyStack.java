import java.util.ArrayList;
import java.util.Scanner;

public class MyStack extends ArrayList<Object>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public boolean isEmpty() {
		if(size()<=0) {
			return false;
		}
		return true;
	}

	public int getSize() {
		return size();
	}

	public Object peek() {
		return get(getSize() - 1);
	}

	public Object pop() {
		Object o = get(getSize() - 1);
		remove(getSize() - 1);
		return o;
	}

	public void push(Object o) {
		add(o);
	}

	@Override
	public String toString() {
		return "stack: " + toString();
	}
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		MyStack stack = new MyStack();
		for (int i = 0; i < 5; i++) {
			stack.add(inputScanner.nextInt());
		}
		int size = stack.getSize();
		for (int i = 0; i < size; i++) {
			System.out.print(stack.pop()+" ");
		}
	}
}