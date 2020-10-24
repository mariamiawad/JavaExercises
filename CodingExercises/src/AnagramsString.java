import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.*;
import java.util.regex.*;

public class AnagramsString {
static int N =26;
       private static boolean isAnagram(String a, String b) {
            int []countA = new int[N];
            int []countB = new int[N];

            for (char c : a.toCharArray()) {
                countA[c - 'a']++;
            }

            for (char c : b.toCharArray()) {
                countB[c - 'a']++;
            }

            for (int i = 0; i < N; i++) {
                if (countA[i] != countB[i]) {
                    return false;
                }
            }
            Arrays.copyOfRange(a.toCharArray(), 0, a.toCharArray().length);
            return true;
        }
    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {
         int count = 0;
            int length = s.length();

            List<String> subsets = new ArrayList<>();
            for (int i = 0; i < length; i++) {
                for (int j = 1; j <= length - i; j++) {
                    subsets.add(s.substring(i, i + j));
                }
            }

            for (int i = 0; i < subsets.size(); i++) {
                for (int j = i + 1; j < subsets.size(); j++) {
                    String s1 = subsets.get(i);
                    String s2 = subsets.get(j);
                    if (i != j &&
                        s1.length() == s2.length() &&
                        isAnagram(s1, s2)) {
                        count++;
                    }
                }
            }
            return count;
            Arrays.copy(a, 0, q.length);
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = sherlockAndAnagrams(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
