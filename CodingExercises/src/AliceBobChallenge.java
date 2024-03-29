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

public class AliceBobChallenge {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) { int alice =0;
    int bob = 0;
    for(int i = 0; i< b.size() && i < a.size(); i++){
        if(a.get(i)> b.get(i)){
           alice +=1;
        }
        else if(a.get(i) < b.get(i)){
            bob +=1;
         }
    }
    Integer [] arrays = new Integer [2];
    
        for (int i =0; i<2; i++) {
        	if(i == 0) {
                arrays[0] = alice;
        	}
        	if(i==1) {
        		arrays[1]=bob;
            }
        
    }
    return Arrays.asList(arrays);}

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = compareTriplets(a, b);

       
           
        

        bufferedReader.close();
    }
}
