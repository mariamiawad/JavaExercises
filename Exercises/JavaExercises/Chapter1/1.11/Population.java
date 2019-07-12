public class Population {
public static void main (String[] args){
	
	double birth = (365*24*60*60)/7;
	double death = (365*24*60*60)/13;
	double immigration = (365*24*60*60)/45;
	int population1 = (int)(312032486+birth-death+immigration);
	int population2 = (int)(population1+birth-death+immigration);
	int population3 = (int)(population2+birth-death+immigration);
	int population4 =(int)(population3+birth-death+immigration);
	int population5 = (int)(population4+birth-death+immigration);
	System.out.println("Year one:\n");
	System.out.printf("%d\n",population1);
	System.out.println("Year two:\n");
	System.out.printf("%d ,\n",population2);
	System.out.println("Year three:\n");
	System.out.printf("%d\n",population3);
	System.out.println("Year four:\n");
	System.out.printf("%d\n",population4);
	System.out.println("Year five:\n");
	System.out.printf("%d\n",population5);
	
	
		
}
}