package exam1;

public class Exam1_Question1 {
	
	public static void main(String[] args) {
		int n = Math.abs(Integer.parseInt(args[0]));
		for (int i = 0; i <=n ; i++) {
			if(Math.pow(2, i)<=n)
			System.out.println(" 2 Power of " + i + " = " + Math.pow(2, i));
		}
	}
}
