import java.util.Arrays;
import java.util.Scanner;

public class Test
{
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public static int generalizedGCD(int num, int[] arr)
    {
      int max = 0;
      for (int i = 0, j = 2;i< arr.length ;i++, j++){
          
          max = getGCD(arr[i], arr[i-1]);
      } 
      return max;
    }

    private static int getGCD(int a, int b) {
        if(a == 0){
            return b;
        }
       
        	return getGCD(a, b%a);
        
    }
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	int [] arr = new int [n];
	for (int i = 0; i < arr.length; i++) {
		arr[i] = scanner.nextInt();
	}
	int x = generalizedGCD(n, arr);
	
}
	
        
    
    // METHOD SIGNATURE ENDS
}