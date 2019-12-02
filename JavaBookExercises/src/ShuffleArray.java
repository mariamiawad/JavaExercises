import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ShuffleArray {

	static void shuffle(ArrayList<Integer> arrayList) {
		
		Random random = ThreadLocalRandom.current();
		for (int i = arrayList.size() - 1; i > 0; i--) {
			int index = random.nextInt(i + 1);
			int a = arrayList.get(index);
			arrayList.set(index, arrayList.get(i));
			arrayList.set(i, a);
		}
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(100);
		arrayList.add(200);
		arrayList.add(300);
		arrayList.add(400);
		arrayList.add(500);
		arrayList.add(600);
		arrayList.add(700);
		arrayList.add(800);
		arrayList.add(900);
		shuffle(arrayList);
	}

	

}
