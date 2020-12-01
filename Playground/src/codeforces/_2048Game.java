package codeforces;

import java.util.Scanner;

public class _2048Game {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int q = scanner.nextInt();
		// 512 512 1024
		// 128 128 256 512 1024
		// 265 265 512 1024
		// 512 512 512 512 512
		// 2048
		// 16 16 16 ..... (128*16)
		// 2 2 ...... (2*1024)
		// 512 2 2 2 .... (2 *768)
		// 20*16 (4*5) (2*253) (1 *100) (3*128)
		// 4096 4
		// 4096 1024 1024
		for (int i = 0; i < q; i++) {
			int sum = 0;
			int n = scanner.nextInt();
			for (int j = 0; j < n; j++) {
				int k = scanner.nextInt();
				if (k > 2048) {
					continue;
				}
				sum += k;
			}
			if (sum >= 2048) {
				System.out.println("YES");
			} else {
				System.out.println("NO");

			}
		}
		scanner.close();
	}
}
