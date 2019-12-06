package exam1;

public class Exam1_Question1 {
	
	public static void main(String[] args) {
		int n = Math.abs(Integer.parseInt(args[0]));
		for (int i = 0; i <=n ; i++) {
			if(Math.pow(i, 2)<=n)
			System.out.println("Power of " + i + "= " + Math.pow(i, 2));
		}
	}
}
