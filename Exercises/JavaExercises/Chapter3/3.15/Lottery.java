import java.util.*;
public class Lottery{
	public static void main(String [] args){
		int lottery= (int)(Math.random()*1000);
		int lotteryNumber = lottery;
		int a = lotteryNumber/100;
		lotteryNumber =lotteryNumber%100;
		int b = lotteryNumber/10;
		lotteryNumber=lotteryNumber%10;
		int c =lotteryNumber;
		System.out.println("The lottery number is " + lottery);
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the number consists of 3 digits ");
		int m = input.nextInt();
		int x = m/100;
		m= m%100;
		int y = m/10;
		m= m%10;
		int z = m;
		System.out.println("The lottery number is " + lottery);
		if (a==x &&   b==y  &&  c==z)
			System.out.println("You Win $10,000");
		else if (((a==x ||  a==y || a==z) && (b==x ||  b==y || b==z))||(c==x || c == y || c==z)) 
			System.out.println("You Win $3,000");
		else if ((a==x ||  a==y || a==z) || (b==x ||  b==y || b==z) ||(c==x ||  c==y || c==z))
			System.out.println("You Win $1,000");
		else 
			System.out.println("You loose");
	}
}