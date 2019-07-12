import java.util.*;
public class TestTime{
    public static void main (String [] args) {
        Time currentTime = new Time();
        System.out.println(currentTime.hours + ":" + currentTime.minutes + ":" + currentTime.seconds);
        Time time = new Time(555550000);
        System.out.println(time.hours + ":" + time.minutes + ":" + time.seconds);       
    }
}