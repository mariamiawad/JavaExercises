import java.util.*;
public class SumOfDiagonal{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        double[][] array = new double [4][4];
        System.out.println("Enter a 4-by-4 matrix row by row:");
        for(int row =0; row<array.length; row++){
            for(int column =0; column<array[row].length; column++){
                array[row][column]= input.nextDouble();

            }
        }
        
        System.out.println("The sum is "+sumMajorDiagonal(array));
    }
    public static double sumMajorDiagonal(double[][] array){
        double sum =0;
        for (int row = 0; row<array.length; row++){
            sum+=array[row][row];
         }
         return sum;

    }
}