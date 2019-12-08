
public class OutOfMemoryExceptionHandling {

	public OutOfMemoryExceptionHandling() {
		// 
	}

	public static void main(String[] args) {
		try {
			int[] list = new int[Integer.MAX_VALUE];
		} catch (Error ex) {
			ex.printStackTrace();
			System.out.println("You are running out of memory.");
		}
	}
}
