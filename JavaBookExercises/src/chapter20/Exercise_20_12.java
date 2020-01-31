package chapter20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Exercise_20_12<E> extends PriorityQueue<E> implements Cloneable {

	@Override
	public Object clone() throws CloneNotSupportedException {

		Exercise_20_12<E> clone = new Exercise_20_12<>();

		forEach(clone::offer);

		return clone;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Exercise_20_12<Integer> exercise_20_12 = new Exercise_20_12<>();
		exercise_20_12.add(1);
		exercise_20_12.add(2);
		Exercise_20_12<Integer> exercise_20_122 = (Exercise_20_12<Integer>) (exercise_20_12.clone());
		exercise_20_122.remove(2);

		System.out.println(exercise_20_122 + " " + exercise_20_12);
	}

}
