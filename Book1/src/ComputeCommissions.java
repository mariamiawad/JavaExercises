
public class ComputeCommissions {

	public ComputeCommissions() {
		
	}
	public static void main(String[] args) {
		System.out.println("Sales Amount    Commission");
		for (int i = 10000; i <=100000; i+=5000) {
			
			System.out.println(i+"            " +computeCommission(i));
		}
	}
	public static double computeCommission(double salesAmount) {
		double commissions = 0;
		if(salesAmount <= 5000&& salesAmount>0.1) {
			commissions = salesAmount * 0.08;
		}
		else if( salesAmount>5000 && salesAmount <=10000) {
			commissions = 5000 * 0.08 + (salesAmount - 5000) * 0.1;
		}
		else if(salesAmount >10000) {
			commissions = (5000 * 0.08) + (5000 * 0.1) + (salesAmount - 10000) * 0.12;
		}
		return commissions;
	}
}
