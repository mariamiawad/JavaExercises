
public class FindTheSalesAmountForLoop {

	public FindTheSalesAmountForLoop() {
		// 
	}
public static void main(String[] args) {
	double comissions = 0;
	double i =0;
	for ( i = 0; comissions <=25000; i=i+ 0.01) {
		if(i<=5000) {
			comissions = i * 0.08;
		}
		else if(i>5000 && i<=10000) {
			comissions =5000 * 0.08 + (i - 5000) * 0.1;
		}
		else if(i>10000) {
			comissions =(5000 * 0.08) + (5000 * 0.1) + (i - 10000) * 0.12;
		}
		
	}
	System.out.println(i);
		
	}
}

