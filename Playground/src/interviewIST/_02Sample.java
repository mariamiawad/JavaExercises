package interviewIST;

import java.util.ArrayList;
import java.util.List;

public class _02Sample {
	public static void main(String[] args) {
		_02Sample sample = new _02Sample();
		System.out.println(sample.selfDividingNumbers(1, 22).toString());
	}

	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = left; i <= right; i++) {
			if (containsZero(i)) {
				continue;
			}
			if (allOkay(i)) {
				list.add(i);
			}
			
		}
		return list;
	}

	public boolean containsZero(int number) {
		String string = number + "";
		return string.contains("0");

	}
	public boolean allOkay(int number) {
		List<Integer> integers = selfDividing(number);
		for (int i = 0; i < integers.size(); i++) {
			if (number%integers.get(i)!=0) {
				return false;
			}
		}
		return true;
	}

	public List<Integer> selfDividing(int number) {
		List<Integer> list = new ArrayList<Integer>();
		while (number > 0) {
			list.add(number % 10);
			number = number / 10;

		}
		return list;
	}
}
