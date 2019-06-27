import java.util.*;
public class MinOfArray{
    public static void main(String[] args){
        Scanner input =new Scanner(System.in).useLocale(Locale.US);;
        System.out.println("Enter ten numbers");
        double [] array = new double [10];
        
        for (int i=0; i<10; i++){
            array[i]= input.nextDouble();
        }
       double min = min(array);
        System.out.println("Smallest Number is " + min);
    }
    public static double min(double [] array){
        double min = array[0];
        for(int i =0; i<array.length; i++){
            if (min > array[i]){
                min = array[i];
            }
        }
        return min;
    }
}