
public class FindTheSalesAmount {

	public FindTheSalesAmount() {
		// 
	}

	public static void main(String[] args) {
		double comissions = 0;
		double sales = 0.01;
		while (comissions<=25000) {
			if(sales<=5000) {
				comissions = sales * 0.08;
			}
			else if(sales>5000 && sales<=10000) {
				comissions =5000 * 0.08 + (sales - 5000) * 0.1;
			}
			else if(sales>10000) {
				comissions =(5000 * 0.08) + (5000 * 0.1) + (sales - 10000) * 0.12;
			}
			sales+=0.01;
		}
		System.out.printf("The amount of yearly sales for a $30000 year pay will be $%.2f", sales);
	    }
}
