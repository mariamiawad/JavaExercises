import java.util.*;
public class Sorting {
	public static void main ( String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter three numbers");
		int x = input.nextInt();
		int y =  input.nextInt();
		int z = input.nextInt();
		int temp = 0;
		if (x>y ||x>z){
		if (x>y ){
			temp =x ;
			x=y;
			y= temp;
			}
		if (x>z ){
			temp = x;
			x=z;
			z=temp;
		}
	}
		if (y>z){
			temp =y;
			y=z;
			z=temp;
		}
	
	System.out.println(x + " " + y + " " + z);
	
	}
}
