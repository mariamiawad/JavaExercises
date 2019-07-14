import java.util.*;
public class SumMatrices{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        double a[][] = new double [3][3];
        double b[][] = new double [3][3];
        System.out.println("Enter matrix1:");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < a[0].length; j++){
                a[i][j]= input.nextDouble();
            }
        }
        System.out.println("Enter matrix2:");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < a[0].length; j++){
                b[i][j]= input.nextDouble();
            }
        }
        double sum [][] = addMatrix(a, b);
        for (int i = 0; i < sum.length; i++){
            for(int j = 0; j < sum[0].length; j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static double[][] addMatrix(double[][] a, double[][] b){
        if(a.length != b.length){
            throw new ArithmeticException();
        }
        double sum[][] = new double [a.length][a.length];
        for(int row = 0; row < a.length; row++){
            for( int column = 0;  column < a[0].length; column++){
                sum[row][column]= a[row][column] + b[row][column];
            }

        }
        return sum;
    }
}