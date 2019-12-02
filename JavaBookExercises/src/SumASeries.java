
public class SumASeries {

	public static void main(String[] args) {
		double sum = 0.0;
		for (int i = 3; i <100 ; i=i+2) {
			sum += (i-2)/(i*1.0);
		}
		System.out.println(sum);
	}

}
