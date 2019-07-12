import java.util.*;
public class AnalyzeScores{
	public static void main ( String [] args ){
		Scanner input = new Scanner (System.in);
		System.out.println("Enter scores");
		double number;
		double [] scores = new double [0];
		while (( number = input.nextDouble())>=0){
			scores= add2Array(scores, number);
		}
		double sum=0;
		for (int i =0; i<scores.length;i++){
			sum += scores[i];
		}
		double average = sum / scores.length;
		int countBelow=0;
		int countAbove=0;
		for ( int i =0; i< scores.length;i++){
			if ( scores[i] >=average){
				countAbove++;
			}
			else if (scores[i]<average){
				countBelow++;
			}
		}
		System.out.println("The average score = "+average);
		System.out.println("Scores below average = " + countBelow);
		System.out.println("Scores above average = " + countAbove);
		System.out.println("Scores above average = " + sum);
	}
	public static double [] add2Array(double[] scores, double number){
		double [] dest = new double [scores.length+1];
		copyArray(scores, dest);
		dest[scores.length] = number;
		return dest;
	}
	public static boolean copyArray(double [] scores, double [] dest){
		if (scores.length > dest.length){
			return false;
		}
		else {
			for (int i =0; i<scores.length; i++){
				dest[i] = scores[i];
			}
		}
		return true;
	}
}