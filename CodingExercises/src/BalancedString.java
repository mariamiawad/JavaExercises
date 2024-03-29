import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BalancedString {

	// Complete the isBalanced function below.
	static String isBalanced(String s) {



        boolean isBalanced = false;
        int length = s.length();
        char symbol6 = '}';
        char symbol5 = '{';
        char symbol4 = ')';
        char symbol3 = '(';
        char symbol2 = ']';
        char symbol1 = '[';
        char[] charArray = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if(symbol1== charArray[i] || symbol3 == charArray[i]||symbol5 == charArray[i]) {
                stack.push(charArray[i]);
                if(i< length-1)
                    continue;
            }
            if(stack.size()>0) {
                if (stack.peek().equals(symbol1) && charArray[i] == symbol2) {
                stack.pop();
                isBalanced = true;
                continue;
            } else if (charArray[i] == symbol4 && stack.peek() == symbol3) {

                stack.pop();
                isBalanced = true;
                continue;

            } else if (charArray[i] == symbol6 && stack.peek() == symbol5) {

                stack.pop();
                isBalanced = true;
                continue;

            }

//            else if (charArray[i-1] == symbol1 && stack.peek() == symbol2) {
//
//                stack.pop();
//                isBalanced = true;
//
//            } else if (charArray[i-1] == symbol4 && stack.peek() == symbol3) {
//
//                stack.pop();
//                isBalanced = true;
//
//            } else if (charArray[i-1] == symbol6 && stack.peek() == symbol5) {
//
//                stack.pop();
//                isBalanced = true;
//
//            }
            else {
                isBalanced = false;
                break;
            }
            }
            else {
                isBalanced = false;
            }
            
        }

        if (isBalanced) {
            return "YES";

        } else {
            return "NO";

        }

    
    }

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			String s = scanner.nextLine();

			String result = isBalanced(s);
			System.out.println(result);
//            bufferedWriter.write(result);
//            bufferedWriter.newLine();
		}

//        bufferedWriter.close();

		scanner.close();
	}
}
