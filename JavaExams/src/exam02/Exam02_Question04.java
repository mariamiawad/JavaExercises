package exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam02_Question04 { //Function for swapping the characters at position I with character at position j  
    public static List<String> swapString(String a, int i, int j) {  
    	char c;
    	List<String> strings = new ArrayList<>();
        for (int j2 = 0; j2 < a.length(); j2++) {
        	if (j2 == i) {
				continue;
			}
			c = a.charAt(i);
			strings.add(c+""+a.charAt(j2));
		} 
        return strings;
    }  
      
    public static void main(String[] args) {
    	
		Scanner inputScanner = new Scanner(System.in);
		int n = inputScanner.nextInt();
		int m = inputScanner.nextInt();
		if (n<m) {
			System.out.print("Invalid input");
			System.exit(1);
		}
		String string = "";
		for (int i = 0; i < n; i++) {
			string += (char) (i + 'a');
		}
		List<String> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n ; j++) {
				
				 list = swapString(string, i, j);
				 
			}
			System.out.println(list.toString());
			
		}
		
	}

      
    //Function for generating different permutations of the string  
//    public static void generatePermutation(String str, int start, int end)  
//    {  
//        //Prints the permutations  
//        if (start == end-1)  
//            System.out.println(str);  
//        else  
//        {  
//            for (int i = 0; i < end; i++)  
//            {  
//                //Swapping the string by fixing a character  
//                str = swapString(str,start,i);  
//                str = swapString(str,start+1,i);  
//                //Recursively calling function generatePermutation() for rest of the characters   
//                generatePermutation(str,start+1,end);  
//                //Backtracking and swapping the characters again.  
//                str = swapString(str,start,i);  
//            }  
//        }  
//    }  
}  
