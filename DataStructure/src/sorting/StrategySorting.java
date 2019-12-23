package sorting;

public interface StrategySorting {
	public <T extends Comparable<T>> void sort(T[]array);
	public <T extends Comparable<T>> void sortWithShuffle(T[] arr);
	public <T extends Comparable<T>> void sortMedianOfThree(T[] arr);
	
}
