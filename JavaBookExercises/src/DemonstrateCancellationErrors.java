
public class DemonstrateCancellationErrors {

	public DemonstrateCancellationErrors() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		int n = 50000;
		double sum1 = 0;
		double sum2 =0;
		for (int i = n; i >0; i--) {
			sum1 += 1.0/i;
		}
		for (int i = 1; i <=n; i++) {
			sum2 += 1.0/i;
		}
		System.out.println(sum1);
		System.out.println(sum2);
	}
}
