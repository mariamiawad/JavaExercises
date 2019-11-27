import java.util.*;
public class MyStackArrayList<E>{
	E[] elements;
	int size;
	MyStackArrayList(){
		elements = (E[])new Object[1];
	}
	public void push(E element){
		if(size >= elements.length){
			resize(size,elements.length);
		}
		elements[size]=element;
		size++;

	}
	public E pop(){
		--size;
		E returnValue = elements[size];
		return returnValue;
	}
	public E peek(){
		E returnValue = elements[size-1];
		return returnValue;
	}
	public int size(){
		return size;
	}
	public boolean isEmpty(){
		return size == 0;
	}
	public void resize(int size, int length){
		E[] newElements;
		if(size >= length){
			newElements = (E[])new Object[size*2];
			for(int i = 0; i < length; i++){
				newElements[i] = elements[i];
			}
			this.elements = newElements;
		}
		else if (length >= 0.25 * size){
			newElements = (E[])new Object[size/2];
			for(int i = 0; i < newElements.length;i++){
				newElements[i] = elements[i];
			}
			this.elements = newElements;
		}
	}
}