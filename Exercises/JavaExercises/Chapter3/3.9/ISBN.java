import java.util.*;
public class ISBN{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first 9 digits of an ISBN as integer:");
		int ISBN = input.nextInt();
		int a = ISBN/100000000;
		ISBN = ISBN%100000000;
		int b = ISBN/10000000;
		ISBN= ISBN%10000000;
		int c = ISBN/1000000;
		ISBN = ISBN%1000000;
		int d = ISBN /100000;
		ISBN = ISBN%100000;
		int e = ISBN/10000;
		ISBN = ISBN%10000;
		int f = ISBN/1000;
		ISBN = ISBN%1000;
		int g = ISBN /100;
		ISBN =ISBN %100;
		int h =ISBN /10;
		ISBN =ISBN%10;
		int i = ISBN ;
		int result = (a*1+b*2+c*3+d*4+e*5+f*6+g*7+h*8+i*9)%11;
		if (result ==10)
			System.out.println(a+ "" + b + "" + c + "" + d + "" + e + "" + f + "" + g + "" + "" + h + "" + i + "X");
		else 
			System.out.println(a+ "" + b + "" + c + "" + d + "" + e + "" + f + "" + g + "" + "" + h + "" + i + "" + result);
	}
}