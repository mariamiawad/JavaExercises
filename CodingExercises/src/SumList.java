import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

	
	

	

    public static int diagonalDifference(List<List<Integer>> arr) {
    	int i =0;
    	int j =0;
    	int sum = 0;
    	List<Integer> list1 = null;
    	for (List<Integer> list : arr) {
    		list = arr.get(i);
    		for (int k = 0; k < list.size(); k++) {
    			Integer integer = list.get(i);
    			sum += integer;
    			break;
    		}
    		i++;
    		}
    	i=0;
    	int sum2 =0;
    	for (List<Integer> list : arr) {
    		
    		list = arr.get(i);
    		int n = list.size()-1-i;
    		for (int k = 0; k < list.size(); k++) {
    			Integer integer = list.get(n);
    			sum2+=integer;
    			n--;
    			break;
    		}
    		i++;
    		}
    		return Math.abs(sum-sum2);	
    		}

}

public class SumList {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr);
System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}