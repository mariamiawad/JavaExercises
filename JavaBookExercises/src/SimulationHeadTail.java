import java.util.Random;

public class SimulationHeadTail {

	public SimulationHeadTail() {
		// 
	}
	public static void main(String[] args) {
		Random random = new Random();
		int headTail = random.nextInt(2);
		int countTail = 0;
		int countHead =1;
		for (int i = 0; i < 1000000; i++) {
			headTail = random.nextInt(2);
			if(headTail == 1) {
				countTail++;
			}
			else {
				countHead++;
			}
		}
		System.out.println("head occured " +countHead);
		System.out.println("tail occured "+ countTail);
	}
}
