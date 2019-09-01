
public class ComputeE {

	public ComputeE() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
		for (int i = 10000; i <=100000; i=i+10000) {
			System.out.println(summation(i));
		}
	}
	public static double summation(int n) {
		double sum = 0;
		for (int i = n; i > 0; i--) {
			sum +=1.0/i ;
		}
		return sum;
	}
}
