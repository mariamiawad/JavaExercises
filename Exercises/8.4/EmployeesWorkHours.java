import java.util.*;
public class EmployeesWorkHours{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double [][] hours = new double[8][7];
        double [][] sum = new double [8][2];
        for(int i = 0; i < hours.length; i++){
            System.out.println("Enter overtime of employee " + i);
            for(int j = 0; j < hours[0].length; j++){
                hours[i][j] = input.nextDouble();
            }

        }
        for(int i = 0; i < sum.length; i++){
            int sumHours =0;
            for(int j = 0; j < sum[0].length; j++){
                sum [i][1] = sumHours + hours[i][j];
            }
            sum[i][0] = i;
            decreasingSort(sum);    
        }
        for (int j = sum.length-1; j >= 0; j--) {
            System.out.println("Employee " + j + "'s overtime is " + sum[j][0]);
        }
        
    }
    public static void decreasingSort(double unsorted[][]){
        for(int i = 0; i < unsorted.length - 1; i++){
            double currentSum = unsorted[i][0];
            int currentIndex = i;
            for(int j = 0; j < unsorted.length; j++){
                if(currentSum > unsorted[i][0]){
                    currentSum = unsorted[i][0];
                    currentIndex = j;
                }
            }
            if(currentIndex != i){
                unsorted[currentIndex][1] = unsorted[i][1];
                unsorted[i][1] = currentSum;
                unsorted[currentIndex][0] = unsorted[i][0];
                unsorted[i][0] = currentIndex;
            }
        }


    }
   

    

}