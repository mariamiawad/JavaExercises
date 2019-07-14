import java.util.*;
public class MyQueueArrayList<E>{
	int head;
	int tail;
	int size;
	E[] elements;
	MyQueueArrayList(){
		elements = (E[])new Object[1];
	}
	public void enqueue(E element){
		elements[tail] = element;
		tail++;
		size++;
		resize(size, elements.length);
	}
	public E dequeue(){
		E temp =  elements[head];
		rotate(tail, head);
		head++;
		size--;
		return temp;

	}
	public void resize(int size, int length){
		if(size >= length){
			E[] newElemenets = (E[])new Object[size*2];
			for(int i = 0; i< tail; i++){
				newElemenets[i] = elements[i];
			}
			this.elements = newElemenets;
		}
	}
	public void rotate(int tail, int head){
		if(tail == elements.length){
			tail = 0;
		}
		else if(head == elements.length){
			head = 0;
		}
	}
	public boolean isEmpty(){
		return size==0;
	}
	public int size(){
		return size;
	}
}