import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Grades {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
    	List<Integer> list = new ArrayList<Integer>();
    	for (Integer integer : grades) {
    		if(integer.compareTo(38)<0) {
    			list.add(integer);
    		}
    		
    		else if(integer.compareTo(38)>=0) {
    			int five = (integer+4)/ 5*5;
    			if(Math.abs(integer-five)<3) {
    				int x =five;
    				list.add(x);
    			}
    			else 
    				list.add(integer);
    		}
			
		}
    	return list;
    }

}

public class StudentsGrading {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Grades.gradingStudents(grades);
for (int i = 0; i < result.size(); i++) {
	System.out.println(result.get(i));
}
//        bufferedWriter.write(
//            result.stream()
//                .map(Object::toString)
//                .collect(joining("\n"))
//            + "\n"
//        );

       bufferedReader.close();
//        bufferedWriter.close();
    }
}
