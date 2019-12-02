
public class QueueClass {
	private int[] elements;
	private int size;

	public QueueClass() {
		elements = new int[8];
		size = 0;
	}

	public void enqueue(int v) {
		if (size >= elements.length) {
			int[] newElements = new int[size * 2];
			System.arraycopy(elements, 0, newElements, 0, elements.length);
			elements = newElements;
		}
		elements[size] = v;
		size++;
	}

	public int dequeue() {
		int n = elements[0];
		for (int i = 0; i < elements.length - 1; i++) {
			elements[i] = elements[i + 1];
		}
		size--;
		return n;
	}
	public boolean isEmpty() {
		return size == 0;
		
	}
	public int getSize() {
		return size;
	}
	public static void main(String[] args) {
		QueueClass queueClass = new QueueClass();
		for (int i = 1; i <= 20; i++) {
			queueClass.enqueue(i);
		}
		int size = queueClass.getSize();
		for (int i = 0; i < size; i++) {
			System.out.println(queueClass.dequeue());
		}
	}
}
