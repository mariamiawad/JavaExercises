import java.util.*;
public class Time {
    long hours;
    long minutes;
    long seconds;
    long currentTime;
    public Time (){
            long totalSeconds = System.currentTimeMillis() / 1000;
            long totalMinutes = totalSeconds / 60;
            long totalHours = totalMinutes / 60;
            this.hour = totalHours % 24;
            this.minute = totalMinutes % 60;
            this.second = totalSeconds % 60;
    
        
    }
    public Time(long elspsedTime){
        long totalSeconds = elspsedTime/1000;
        long totalMinutes = totalSeconds/60;
        long totalHours = totalMinutes/60;
        this.hours = totalHours % 24;
        this.minutes = minutes % 60;
        this.seconds = seconds % 60;
    }
    public Time(long hours, long minutes, long seconds){
        this.hours=hours;
        this.minutes = minutes;
        this.seconds= seconds;
    }
    public long getHours(){
        return hours;
    }
    public long getMinutes(){
        return minutes;
    }
    public long getSeconds(){
        return seconds;
    }

}