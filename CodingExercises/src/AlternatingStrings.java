import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class AlternatingStrings {
	 
    static int alternate(String s) {
    	int NUM_LETTERS = 26;
    	int[][] pair = new int[NUM_LETTERS][NUM_LETTERS];
        int[][] count = new int[NUM_LETTERS][NUM_LETTERS];
     
        for (int i = 0; i < s.length(); i++) {
          char letter = s.charAt(i);
          int letterNum = letter - 'a';
          for (int col = 0; col < NUM_LETTERS; col++) {
            if (pair[letterNum][col] == letter) {
              count[letterNum][col] = -1;
            }
            if (count[letterNum][col] != -1) {
              pair[letterNum][col] = letter;
              count[letterNum][col]++;
            }
          }
          for (int row = 0; row < NUM_LETTERS; row++) {
            if (pair[row][letterNum] == letter) {
              count[row][letterNum] = -1;
            }
            if (count[row][letterNum] != -1) {
              pair[row][letterNum] = letter;
              count[row][letterNum]++;
            }
          }
        }
     
        int max = 0;
        for (int row = 0; row < 26; row++) {
          for (int col = 0; col < 26; col++) {
            max = Math.max(max, count[row][col]);
          }
        }
        return max;
      }
        
    

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int l = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int result = alternate(s);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
