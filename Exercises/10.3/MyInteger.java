import java.util.*;
public class MyInteger{
    int value;
    public MyInteger(int value){
        this.value = value;
    }
    public int getMyInteger(){
        return value;
    }
    public void setMyInteger(int value) {
        this.value = value;
    }

    public boolean isEven(){
        return value % 2 == 0;
    }
    public boolean isOdd(){
        return value % 2 !=0;
    }
    public boolean isPrime(){
        boolean isPrime =true;
        if(value<1){
            isPrime =false;
        }
        for(int divisor=2; divisor<=Math.sqrt(value); divisor++){
            if(value % divisor==0){
                isPrime = false;
            }
        }
        return isPrime;
    }
    public static boolean isEven(int value){
        return value % 2 == 0;
    }
    public static boolean isOdd(int value){
        return value % 2 !=0;
    }
    public static boolean isPrime(int value){
        boolean isPrime =true;
        if(value<1){
            isPrime =false;
        }
        for(int divisor=2; divisor<=Math.sqrt(value); divisor++){
            if(value%divisor==0){
                isPrime = false;

            }
        }
        return isPrime;
    }
    public static boolean isEven(MyInteger integer){
        return integer.isEven();
    }
    public static boolean isOdd(MyInteger integer){
        return integer.isOdd();
    }
    public static boolean isPrime(MyInteger integer){
        return integer.isPrime();
    }
    public boolean equal(int x, int y){
        return x == y;
    }
    public boolean equal(MyInteger integer){
        return this.value == integer.value;
    }
    public static int parseInt(char[] value ){
      double valueDouble = 0;
      int toPower = value.length-1;
      for (char valueChar : value) {
          valueDouble += Math.pow(10, toPower--) *(valueChar -'0');
      }
      return (int)valueDouble;

        
        
    }
    public static int parseInt(String value){
      return parseInt(value.toCharArray());
    }

}

    
    
    
