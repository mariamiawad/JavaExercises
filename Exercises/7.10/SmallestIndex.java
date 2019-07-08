import java.util.*;
public class SmallestIndex{
    public static void main (String [] args){
        double [] array = {1, 1, 2, 0.5, 4, 5, 0.5};
        System.out.println(indexOfSmallestElement(array));

    }
    public static int indexOfSmallestElement(double[] array){
        double index=array[0];
        int j =0;
        for(int i = 0; i < array.length; i++){
            if(index > array[i]){
                index= array[i];
                j=i;
            }
        }
        return j;
    }
}