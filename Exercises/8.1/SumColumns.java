import java.util.*;
public class SumColumns{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double [][] array = new double[3][4];
        System.out.println("Enter a 3-by-4 matrix row by row:");
        for(int row =0; row < array.length; row++){
            for (int column = 0 ; column < array[row].length;column++){
                array[row][column]= input.nextDouble();
            }
        }
        for (int columnIndex = 0; columnIndex< array[0].length;columnIndex++){
                System.out.println("Sum of the elements at column " + columnIndex + " is "+ sumColumn(array, columnIndex));
        }

    }
    public static double sumColumn(double[][] array, int columnIndex){
        double sum = 0;
        for (int row =0; row< array.length;row++){
            sum += array[row][columnIndex];
        }
        return sum;
    }

       
}