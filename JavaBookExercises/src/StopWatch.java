import java.util.Random;
import java.util.Scanner;

public class StopWatch {
	private double startTime;
	private double endTime;
	public double getStartTime() {
		return startTime;
	}
	public void setStartTime(double startTime) {
		this.startTime = startTime;
	}
	public double getEndTime() {
		return endTime;
	}
	public void setEndTime(double endTime) {
		this.endTime = endTime;
	}
	public void start() {
		this.startTime = System.currentTimeMillis();
	}
	public void stop() {
		this.endTime = System.currentTimeMillis();
	}
	public double getElapsedTime() {
		return this.endTime - this.startTime;
	}
	 public static void main(String args[])  
	   {  
	       int size, i, j, temp;  
	       int arr[] = new int[100000];  
	       for (int k = 0; k < arr.length; k++) {
			arr[k] = (int) (Math.random()*1000);
		}
	      
	       StopWatch stopWatch = new StopWatch();
	       stopWatch.start(); 
	       for(i=0; i<arr.length; i++)  
	       {  
	           for(j=i+1; j<arr.length; j++)  
	           {  
	               if(arr[i] > arr[j])  
	               {  
	                   temp = arr[i];  
	                   arr[i] = arr[j];  
	                   arr[j] = temp;  
	               }  
	           }  
	       }  
	         stopWatch.stop();
	      double elapsedTime = stopWatch.getElapsedTime();
	      elapsedTime = elapsedTime/1000;
	      System.out.println(elapsedTime);  
	   }  
	}  

