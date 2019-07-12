import java.util.*;
public class AnalyzeScores{
	public static void main (String [] args){
		Scanner input = new Scanner (System.in);
		System.out.println("Enter Scores between 0 and 100");
		int MAX=100;
		double sum =0;
		double average = 0;
		double countAbove =0;
		double countBelow=0;
		double countEqual =0;
		int n =0;
		double [] scores = new double [MAX];
		for ( int i=0; i<scores.length;i++){
			scores[i]= input.nextDouble();
			sum += scores[i];
			n++;
			if (scores[i]<0){
				average = sum /i;
				break;
			}
		}
		for (int i=0; i<n;i++){
			if (scores[i]>average){
				countAbove++;
			}
			else if (scores[i]==average){
				countEqual++;
			}
			else{
				countBelow++;
			}
		}
		 System.out.println("The number of scores equal to average is " + countEqual);
		System.out.println("The number of scores above average is " + countAbove);
		System.out.println("The number of scores below average is " + countBelow);
		
	}
}