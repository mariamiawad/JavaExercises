package chapter20;

import java.util.Iterator;
import java.util.LinkedList;

public class Exercise_20_06 {
public static void main(String[] args) {
	LinkedList<Integer> linkedList = new LinkedList<>();
	for (int i = 0; i < 5000000; i++) {
		linkedList.add(i);
	}
	Iterator<Integer> iterator = linkedList.iterator();
	double currentTime = System.currentTimeMillis()*1000;
	
	while (iterator.hasNext()) {
		Integer integer = (Integer) iterator.next();
		
	}
	double endTime = System.currentTimeMillis()*1000;
	System.out.println("Start Time " + currentTime + " end " +endTime);
	
	currentTime = System.currentTimeMillis()*1000;
	for (int i = 0; i < linkedList.size(); i++) {
		linkedList.get(i);
	}
	 endTime = System.currentTimeMillis()*1000;
	 System.out.println("Start Time " + currentTime + "end" +endTime);
}
}
