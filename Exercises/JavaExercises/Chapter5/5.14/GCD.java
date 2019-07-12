import java.util.*;
public class GCD{
	public static void main ( String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println ("Enter n1 and n2");
		int n1 = input.nextInt();
		int n2= input.nextInt();
		int d=0; 
		int m =0;
		if (n1>n2){
			d=n2;
		}
		if (n2>=n1){
			d= n1;
		}
		while (d>0){
			if(n1%(d)==0&& n2%(d)==0){
				m = d; 
				break;
			}
			d--;
		}
		System.out.println(m);
	}
}