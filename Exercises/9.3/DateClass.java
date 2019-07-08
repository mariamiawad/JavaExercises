import java.util.*;

public class DateClass{
    public static void main(String[] args){
        Date date;
        long time = 10000;
        for (int i = 0; i < 8; i++, time *= 10) {
            date = new Date(time);
            System.out.println(date.toString());
        }
       

    }
    
}