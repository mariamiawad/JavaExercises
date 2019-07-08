import java.util.*;

public class TestArrayList {
	public static void main(String[] args) {

		MyArrayList<Integer> arrayList = new MyArrayList<Integer>();
		arrayList.add(32);
		arrayList.add(33);
		arrayList.add(34);
		arrayList.add(36);
		arrayList.add(4, 1);
		for (int i = 0; i < arrayList.size; i++) {
			if (arrayList.get(i) == null) {
				break;
			}
			System.out.print(arrayList.get(i) + " ");
		}
		System.out.println();

		System.out.print("Added  " + arrayList.indexOf(Integer.valueOf(32)) + " "
				+ arrayList.indexOf(Integer.valueOf(33)) + " " + arrayList.indexOf(Integer.valueOf(34)) + " "
				+ arrayList.indexOf(Integer.valueOf(36)) + " " + arrayList.indexOf(Integer.valueOf(1)));

		System.out.println();
		System.out.println(arrayList.contains(Integer.valueOf(32)));
		arrayList.remove(Integer.valueOf(34));
		for (int i = 0; i < arrayList.size; i++) {
			if (arrayList.get(i) == null) {
				break;
			}
			System.out.print("Remove Object " + arrayList.get(i) + " ");
		}
		System.out.println();

		arrayList.add(39);
		arrayList.remove(1);

		for (int i = 0; i < arrayList.size; i++) {
			if (arrayList.get(i) == null) {
				break;
			}
			System.out.print("Remove index " + arrayList.get(i) + " ");
		}
		System.out.println();
		System.out.print(
				"Added   " + arrayList.indexOf(Integer.valueOf(33)) + " " + arrayList.indexOf(Integer.valueOf(34)) + " "
						+ arrayList.indexOf(Integer.valueOf(36)) + " " + arrayList.indexOf(Integer.valueOf(1)));

		System.out.println();
		arrayList.set(0, 4);
		for (int i = 0; i < arrayList.size; i++) {
			System.out.print(arrayList.get(i) + " ");
		}

	}
}