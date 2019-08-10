import java.io.IOException;
import java.io.ObjectOutputStream.PutField;
import java.time.chrono.MinguoChronology;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.print.attribute.Size2DSyntax;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class ClosestNumbers {

    // Complete the closestNumbers function below.
    static int[] closestNumbers(int[] arr) {
    	ArrayList<Integer> arrayList = new ArrayList<Integer>();
    	int min = Math.abs(arr[0]-arr[1]);
    	sort(arr, 0, arr.length-1);
    	int temp = 0;
    	int [] finall;
    	int[] tempArray = new int [arr.length+1];
    	int count = 0;
    	for (int i = 0; i < arr.length; i++) {
    		for (int j = 0; j < arr.length-i-1 ; j++) {
    			
    			if(min >= Math.abs(arr[j]-arr[j+1])) {
    				
    				min =Math.abs(arr[j]-arr[j+1]);
    				temp = arr[j+1];
    				arr[j+1]=arr[j];
    				arr[j]= temp;
    				tempArray[j] = arr[j];
    				tempArray[j+1] = arr[j+1];
    				
    			}
    			
    			
    		}
    		
    		
			}
				
		
    	
    	for (int i = 0; i < tempArray.length-1; i++) {
    		if(min == Math.abs(tempArray[i]-tempArray[i+1])){
    		arrayList.add(tempArray[i]);
			arrayList.add(tempArray[i+1]);
		}
    	}
    	
    		
    		
        		
    		
    	
			
    
    		
    		
			
    	

			finall = new int [arrayList.size()];
    	for (int i =0; i <finall.length; i++) {
    		finall[i]=arrayList.get(i);
		}
    	return finall;
    	
    }
		
 public static   int partition(int arr[], int low, int high) 
    { 
        int pivot = arr[high];  
        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) 
        { 
            // If current element is smaller than or 
            // equal to pivot 
            if (arr[j] <= pivot) 
            { 
                i++; 
  
                // swap arr[i] and arr[j] 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        // swap arr[i+1] and arr[high] (or pivot) 
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    } 
    
    
   public static void sort(int arr[], int low, int high) 
    { 
        if (low < high) 
        { 
            /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi = partition(arr, low, high); 
  
            // Recursively sort elements before 
            // partition and after partition 
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
    } 

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = closestNumbers(arr);

        for (int i = 0; i < result.length; i++) {
        	System.out.println(result[i]);
//            bufferedWriter.write(String.valueOf(result[i]));

//            if (i != result.length - 1) {
//                bufferedWriter.write(" ");
            }
//        }

//        bufferedWriter.newLine();

//        bufferedWriter.close();

        scanner.close();
    }
}
