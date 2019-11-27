public class TestQueue{
	public static void main(String[] args) {
		MyQueueArrayList<Integer> queueArrayList = new MyQueueArrayList<Integer>();
		System.out.println(queueArrayList.size()); 
		System.out.println(queueArrayList.isEmpty());
		queueArrayList.enqueue(Integer.valueOf(1));
		queueArrayList.enqueue(Integer.valueOf(2));
		queueArrayList.enqueue(Integer.valueOf(3));
		queueArrayList.enqueue(Integer.valueOf(4));
		System.out.println(queueArrayList.size()); 
		System.out.println(queueArrayList.isEmpty());
		int size = queueArrayList.size();
		for (int i = 0; i < size; i++){
			System.out.println(" QueueArrayList " + queueArrayList.dequeue()+ " ");
		}
		System.out.println();
		MyQueueLinkedList<Integer> queueLinkedList = new MyQueueLinkedList<Integer>();
		System.out.println(queueLinkedList.size()); 
		System.out.println(queueLinkedList.isEmpty());
		queueLinkedList.enqueue(Integer.valueOf(1));
		queueLinkedList.enqueue(Integer.valueOf(2));
		queueLinkedList.enqueue(Integer.valueOf(3));
		queueLinkedList.enqueue(Integer.valueOf(4));
		System.out.println(queueLinkedList.size()); 
		System.out.println(queueLinkedList.isEmpty());
		size = queueLinkedList.size();
		for (int i = 0; i < size; i++){
			System.out.println(" QueueLinkedList " + queueLinkedList.dequeue());
		}
		System.out.println();
	}
}