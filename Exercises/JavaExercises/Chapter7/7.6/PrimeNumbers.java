import java.util.*;
public class PrimeNumbers{
	public static void main(String [] args){
		int [] numbers ={2};
		int number = 2;
		int NUMBER_OF_PRIMES =50;
		int NUMBER_OF_PRIMES_PER_LINE =10;
		while(numbers.length <=NUMBER_OF_PRIMES){
			boolean isPrime=true;
			for (int i=0; i<numbers.length && numbers[i] < Math.sqrt(number);i++){
				int divisor = numbers[i];
				if(number%divisor==0){
					isPrime= false;
					break;
				}
			}
				if (isPrime){
					numbers = add2Array(numbers, number);
					if((numbers.length-1) % NUMBER_OF_PRIMES_PER_LINE ==0){
						System.out.println(number+" ");
					}
					else {
						System.out.print(number + " ");
					}
				}
				number++;
			
		}
		
	}
	public static int [] add2Array (int [] source,int  data){
		int [] dest = new int [source.length+1];
		copyArray(source, dest);
		dest[source.length] =data;
		return dest;
		
		
	}
	public static boolean copyArray( int [] source, int [] dest){
		if (source.length > dest.length ){
			return false;
		}
		
		for (int i =0; i<source.length;i++){
			dest[i] = source[i];
		}
		
		return true;
	}
}