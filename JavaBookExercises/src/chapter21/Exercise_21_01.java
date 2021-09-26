package chapter21;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Exercise_21_01 {
public static void main(String[] args) {
	String [] strings1 = {"George","Jim", "John", "Blake", "Kevin", "Michael"};
	Set<String> set1 = new LinkedHashSet<String>();
	set1.addAll(Arrays.asList(strings1));
	String[] strings2 = {"George", "Katie","Kevin", "Michelle", "Ryan"};
	Set<String> set2 = new LinkedHashSet<String>();
	set2.addAll(Arrays.asList(strings2));
	Set<String> unionSet = new LinkedHashSet<String>();
	unionSet.addAll(set1);
	unionSet.addAll(set2);
	System.out.println("Union =  " + unionSet);
	Set<String> difference1 = new LinkedHashSet<String>();
	difference1.addAll(set1);
	difference1.addAll(set2);
	difference1.removeAll(set2);
	Set<String> difference2 = new LinkedHashSet<String>();
	difference2.addAll(set1);
	difference2.addAll(set2);
	difference2.removeAll(set1);
	difference1.addAll(difference2);
	System.out.println("Difference = " + difference1);
	Set<String> intersection = new LinkedHashSet<String>();
	intersection.addAll(set1);
	intersection.retainAll(set2);
	System.out.println("Intersection = " +intersection);
	
	
	
}
}
