package codeforces;

import java.util.Scanner;

public class DoubleCola {
	public static String doubleCola(int n) {
		int[] sheldrons = getSheldon(n);
		int firstShedron = sheldrons[0];
		int numberOfShedron = sheldrons[1];
		int who = 0;
		int sum = firstShedron;
		while (sum < n) {
			sum += numberOfShedron;
			if (sum <= n) {
				who++;
			}

		}
		String[] names = { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
		return names[who];

		// Sheldon, Leonard, Penny, Rajesh, Howard
		// (1) (s0+5=6 7) (s1+10=16 17 18 19) (s2+20 =36 37 38 39 40 41 42 43)(s3+40
		// =76.....)(s4+80=156)(s5+160=316)
		// (1) (1+5=6)(6+ 5*2 =16)(16+10*2 = 36)(36 + 20 *2 = 76)(76 + 40 * 2 =156)(156
		// +80 *2 = 316)(316 + 160 * 2 =636 )(636+320*2 =1276)
		// sheldon
		// ( 32 number of sheldons in every sequence, 156 first sheldons in every
		// sequence
		// ,76 first sheldons in previous sequence + 80 multiplies of 5 ) (
		// 6
		// sheldon
		// penny
		// (s+2) (s+4= 10 11) (s+8=24 25 26 27) (s+16 = 52 53 54 55 56 57 58)
		// 59)(s+32.....s+47)
		// rajeh
		// (s+4) (s+6 ...)(s+12 )
		// howard
		// (s+4)(s+8)(s+16)(s+32)
		// penny
		// 10
		// s l p r h s s l l(p) p r r ;
		// 15
		// s l p r h s s l l p p r r h (h) s s s s
		// 31
		// s l p r h s s l l p p r h h s s s s l l l l p p p p r r r (r) h h h h
		// 217
		// l

		// 1802
		// penny

	}

	private static int[] getSheldon(int n) {
		int firstSheldon = 1;
		int numberOfSheldronsInSequence = 1;
		int multiplier = 5;
		while (firstSheldon <= (n - multiplier)) {
			firstSheldon += multiplier;
			numberOfSheldronsInSequence *= 2;
			multiplier *= 2;

		}

		return new int[] { firstSheldon, numberOfSheldronsInSequence };

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(doubleCola(n));
	}
}
