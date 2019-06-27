public class CountSingleDigit{
	public static void main (String[] args){
		int [] mainNumber = {0,1,2,3,4,5,6,7,8,9};
		int [] numbers = new int [100];
		int count = 0;
		for(int i=0; i<100; i++){
			int number =(int)( Math.random()*10);
			numbers [i]= number;
		}
		for(int i =0; i<numbers.length; i++){
			int j;
			for (j =0; j<mainNumber.length ;j++){
				if (numbers[i]== mainNumber[j]){
					count++;
				}
			}
			
			System.out.print(mainNumber[i] + "occurs" + count+"\n");
		}
		
	}
}