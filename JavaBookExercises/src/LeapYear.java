import java.time.Year;

public class LeapYear {

	public LeapYear() {
		// 
	}
	public static void main(String[] args) {
		int countYear =0;
		for (int i = 101; i <=2100; i++) {
			
			if(Year.isLeap(i)) {
				System.out.print(i+" ");
				countYear++;
				
			}
			if(countYear%10==0) {
				System.out.println();
			}
			
		}
		System.out.println();
		System.out.println(countYear);
	}

}
