package exam1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Exam1_Question2 {
//a^3 +b^3 = (a+b)(a2+b2 -ab)
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		int n = Integer.parseInt(args[0]);
		for (int i = 1; i <= Math.pow(n, (1.0 / 3)) + 1; i++) {
			for (int j = 2; j <= Math.pow(n, 1.0 / 3) + 1; j++) {
				for (int j2 = 3; j2 <= Math.pow(n, 1.0 / 3) + 1; j2++) {
					for (int k = 4; k <= Math.pow(n, 1.0 / 3) + 1; k++) {
						if ((Math.pow(i, 3) + Math.pow(j, 3)) == (Math.pow(j2, 3) + Math.pow(k, 3))
								&& ((Math.pow(i, 3) + Math.pow(j, 3)) <= n && (Math.pow(j2, 3) + Math.pow(k, 3)) <= n)
								&& i != j && i != j2 && i != k && j != j2 && j2 != k) {

							map.put((int) (Math.pow(i, 3) + Math.pow(j, 3)), 1);

						}
					}
				}
			}
		}
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey());
		}

	}

}
