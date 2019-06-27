import java.util.*;
public class TuitionFees{
	public static void main (String [] args){
		int fees = 10000;
		int totalCost =0;
		int feesTen =0;
		int years=0;
		while (years<14) {
			years++;
			fees += fees*0.05;
			if ( years>10){
				totalCost += fees;
			}
			if (years == 10 ){
				feesTen = fees;
			}
		}
		System.out.println("The tuition in ten years "+ feesTen);
		System.out.println("The total cost of four years’ worth of tuition after the tenth year " + totalCost);
		
	}
}