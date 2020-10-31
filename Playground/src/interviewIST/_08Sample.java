package interviewIST;

import java.util.ArrayList;
import java.util.List;

public class _08Sample {
	public List<String> readBinaryWatch(int n) {
		List<String> ret = new ArrayList<>();
		for (int h = 0; h < 12; h++) {
			for (int m = 0; m < 60; m++) {
				if (Integer.bitCount(h) + Integer.bitCount(m) == n) {
					ret.add(String.format("%d:%02d", h, m));
				}
			}
		}
		return ret;
	}
}
