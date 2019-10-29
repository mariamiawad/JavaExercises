import java.util.Random;

public class RandomClass {

public static void main(String[] args) {
	Random random = new Random(1000);
	int  NUMBER_PER_LINE =10;
	
	for (int i = 0; i <50; i++) {
		if( i>0 && i%NUMBER_PER_LINE==0 )
			System.out.println();
		System.out.print(random.nextInt(100)+ " " );
		
	}
	
}
}
