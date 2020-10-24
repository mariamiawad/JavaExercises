package hackerRank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class NewYearChaos {
	static void minimumBribes(int[] q) {
		boolean toomany = false;
		int[] bribes = new int[q.length];
        long bribeCount = 0;
        for (int j = 0; j < q.length && !toomany; j++)
        {
            boolean found = false;
            for (int i = 0; i < q.length-1 && !toomany; i++)
            {
                if (q[i] > q[i+1])
                {
                    found = true;
                    bribes[q[i]-1]++;
                    bribeCount++;
                    if (bribes[q[i]-1] > 2)
                    {
                        toomany = true;
                    }
                    int t = q[i];
                    q[i] = q[i+1];
                    q[i+1] = t;
                }
            }
            if (!found) break;
        }
        if (toomany)
        {
            System.out.println("Too chaotic");
        }
        else
        {
            System.out.println(bribeCount);
        }
    }

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		minimumBribes(array);
	}
}
