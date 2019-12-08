
public class SumSeries {

	public SumSeries() {
		// 
	}
public static void main(String[] args) {
	double x =0;
	for (int i = 1; i <=20; i++) {
		System.out.print(i + "   " );
		x += i/((i*1.0)+1);
		System.out.printf("%.4f", x);
		System.out.println();
	}
}
}
