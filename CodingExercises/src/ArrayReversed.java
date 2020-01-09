import java.util.Arrays;
import java.util.Scanner;

import javax.xml.transform.Templates;

public class ArrayReversed {
	private static final Scanner scanner = new Scanner(System.in);

	 public static void MyReversedArray(int[] n, int d) {
	        if (n.length < 1 && n.length > (int) Math.pow(10, 5)) {
	            System.exit(1);
	        }
	        if (d < 1 && d > n.length) {
	            System.exit(1);
	        }
	        
    int   temp= 0;
//    ;
            
            for(int j = 0; j<d ; j++) {
            	temp = n[0];
            for(int i = 0;  i< n.length-1; i++) {
            	n[i] = n[i+1];
            	
            	
            	
            	
            }
            n[n.length-1] = temp;
            }
//            n[j-1] = temp;
            
            
//            a[d] = n[0];
//            n = a;
//       n[d]= temp;
//       n[0] = temp2;
//            n[d-1]=temp;
//            for (int i = 0; i < n.length; i++) {
//                System.out.print(n[i] + " ");
//            }
            
            
	            
	                    
	              
	        for (int i = 0; i < n.length; i++) {
	            System.out.print(n[i] + " ");
	        }
	            }
	        
	    
	    //    for(int i = 1; i <n.length; i++) {
	    //     if(n[i-1] == d) {
	    //     temp = n[i];
	    //     n[i]= n[i];
	    //     n[i] = temp;
	    //     }
	    // }
//	        int x = index(n, d);
//	        for (int i = 0; i <= x; i++) {
//				for (int j = i+1; j <a.length; j++) {
//					 if (n[i]< n[j]) {
//
//							temp = n[i];
//			                n[i]= n[j];
//			                n[j]= temp;
//					}
//					
//				}
//			}
//	        for (int i = 1; i <= x; i++) {
//				for (int j = i+1; j<a.length; j++) {
//					 if(n[i]> n[j]) {
//					temp = n[i];
//	                n[i]= n[j];
//	                n[j]= temp;
//					 }
//					
//				}
//			}
//	        
//	                
//	            //     continue;   
//	            
//	            
//	            //     temp = n[i];
//	            //     n[i] = n[i+1];
//	            //     n[i+1]=temp;
//	            
////	        }
	      
//	        
//	    }
//	 public static int  index(int [] n , int d) {
//		int i;
//		for( i = 0; i < n.length; i++ ) {
//			if (n[i]==d) {
//				return i;
//			}
//		}
//		return -1;
//	}
	public static void main(String[] args) {
		String[] nd = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nd[0]);

		int d = Integer.parseInt(nd[1]);

		int[] a = new int[n];

		String[] aItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		 for (int i = 0; i < n; i++) {
	            int aItem = Integer.parseInt(aItems[i]);
	            a[i] = aItem;
	        }
		MyReversedArray(a, d);

		scanner.close();
	}
}
