import java.util.Scanner;

public class ApproximateTheSquareRoot {

	public ApproximateTheSquareRoot() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println(sqrt(inputScanner.nextLong()));
	}
	public static double sqrt(long n) {
		 double lastGuess = 1, nextGuess = 1;
		 
		 
		  do {
		   lastGuess = nextGuess;
		   nextGuess = (lastGuess + (n / lastGuess)) / 2;
	
		   
		  } while (Math.abs(lastGuess - nextGuess) > 0.0001);
		 
		  return nextGuess;
	}
	
}
