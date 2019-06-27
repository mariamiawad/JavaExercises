import java.util.*;
public class Pentagonal{
    public static void main(String[] args){
        int NUMBER_PERLINE =10;
        for ( int i = 1; i<=100;i++){
            System.out.print(getPentagonalNumber(i)+ " ");
            if(i % NUMBER_PERLINE ==0){
                System.out.println();

            }
        }
        
    }
    public static int getPentagonalNumber(int number){
        int pentagonalNumber = (number*((3*number)-1))/2;
        return pentagonalNumber;
    }

}