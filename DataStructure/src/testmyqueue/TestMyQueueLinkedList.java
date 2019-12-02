package testmyqueue;


import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Test;

import myqueue.MyQueueLinkedList;
import myqueue.MyQueueLinkedList.MyIterator;



public class TestMyQueueLinkedList {

	@Test
	public void testEnqueue_AddOneElement_SizeOne() {
		MyQueueLinkedList<Integer>linkedList = new MyQueueLinkedList<>();
		linkedList.enqueue(1);
		MyQueueLinkedList<Integer>.MyIterator iterator = linkedList.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next());
		}
		assertEquals(linkedList.size(), 1);
	}
	@Test
	public void testEnqueue_AddTwoElement_SizeTwo() {
		MyQueueLinkedList<Integer>linkedList = new MyQueueLinkedList<>();
		linkedList.enqueue(1);
		linkedList.enqueue(2);
		MyQueueLinkedList<Integer>.MyIterator iterator = linkedList.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next());
		}
		assertEquals(linkedList.size(), 2);
	}
	@Test
	public void testEnqueue_AddTenElement_SizeTen() {
		MyQueueLinkedList<Integer>linkedList = new MyQueueLinkedList<>();
		for (int i = 1; i < 11; i++) {
			linkedList.enqueue(i);
		}
		
		MyQueueLinkedList<Integer>.MyIterator iterator = linkedList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		assertEquals(linkedList.size(),10);
	}
	


	@Test
	public void testDequeue_OneElement_ReturnOne() {
		MyQueueLinkedList<Integer>linkedList = new MyQueueLinkedList<>();
		linkedList.enqueue(1);
		assertEquals(linkedList.dequeue(),Integer.valueOf(1));
	}
	@Test
	public void testDequeue_TwoElement_ReturnOneTwo() {
		MyQueueLinkedList<Integer>linkedList = new MyQueueLinkedList<>();
		linkedList.enqueue(1);
		linkedList.enqueue(2);
		assertEquals(linkedList.dequeue(),Integer.valueOf(1));
		assertEquals(linkedList.dequeue(),Integer.valueOf(2));
	}
	@Test
	public void testDequeue_TenElement_ReturnOneToTen() {
		MyQueueLinkedList<Integer>linkedList = new MyQueueLinkedList<>();
		for (int i = 1; i < 11; i++) {
			linkedList.enqueue(i);
		}
		for (int i = 1; i <11; i++) {
			assertEquals(linkedList.dequeue(),Integer.valueOf(i));
		}
		
	}
	@Test (expected = NoSuchElementException.class)
	public void testDequeue_EmptyQueue_ReturnOneToTen() {
		MyQueueLinkedList<Integer>linkedList = new MyQueueLinkedList<>();
		linkedList.dequeue();
	}


	@Test
	public void testSize_TenElementAfterDequeue_SizeZero() {
		MyQueueLinkedList<Integer>linkedList = new MyQueueLinkedList<>();
		for (int i = 1; i < 11; i++) {
			linkedList.enqueue(i);
		}
		assertEquals(linkedList.size(), 10);
		for (int i = 1; i <11; i++) {
			linkedList.dequeue();
		}
		assertEquals(linkedList.size(), 0);
	}
	@Test
	public void testSize_TenElementAfterEnqueue_SizeTen() {
		MyQueueLinkedList<Integer>linkedList = new MyQueueLinkedList<>();
		for (int i = 1; i < 11; i++) {
			linkedList.enqueue(i);
		}
		
		assertEquals(linkedList.size(), 10);
	}
	@Test
	public void testSize_OneElemenet_SizeOne() {
		MyQueueLinkedList<Integer>linkedList = new MyQueueLinkedList<>();
		linkedList.enqueue(1);
		assertEquals(linkedList.size(), 1);
	}

	@Test
	public void testIsEmpty_EmptyQueue_True() {
		MyQueueLinkedList<Integer> linkedList = new MyQueueLinkedList<>();
		assertEquals(linkedList.isEmpty(), true);
	}
	@Test
	public void testIsEmpty_OneElementInQueue_False() {
		MyQueueLinkedList<Integer> linkedList = new MyQueueLinkedList<>();
		linkedList.enqueue(1);
		assertEquals(linkedList.isEmpty(), false);
	}

}
