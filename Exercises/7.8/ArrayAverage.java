import java.util.*;
public class ArrayAverage{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double [] numbers = new double[10] ;
        for (int i = 0; i<10; i++){
            numbers[i]=input.nextDouble();
        }
        double average = average(numbers);
        System.out.println(average);
        
    }
    public static int average(int[] array){
        int average =0;
        for (int i=0; i<10;i++){
            average += array[i];

        }
        return average/10;
    }
    public static double average(double[] array){
        double average =0;
        for (int i=0; i<10;i++){
            average += array[i];

        }
        return average/10.0;
    }
}