package testmyqueue;
import static org.junit.Assert.assertEquals;

import java.util.NoSuchElementException;

import org.junit.Test;

import crackingcodinginterview.chapter03.CCI_03_04_MyQueue;


public class TestCCI_03_04_MyQueue {

	@Test
	public void testEnqueue_OneElement_ReturnSizeOne() {
		CCI_03_04_MyQueue<Integer> list = new CCI_03_04_MyQueue<>();
		list.enqueue(1);
		assertEquals(1, list.size());
	}
	@Test
	public void testEnqueue_TwoElement_ReturnSizeTow() {
		CCI_03_04_MyQueue<Integer> list = new CCI_03_04_MyQueue<>();
		list.enqueue(1);
		list.enqueue(2);
		assertEquals(2, list.size());
	}
	@Test
	public void testEnqueue_ElevenElement_ReturnSizeEleven() {
		CCI_03_04_MyQueue<Integer> list = new CCI_03_04_MyQueue<>();
		for (int i = 1; i < 11; i++) {
			list.enqueue(i);
		}
		assertEquals(10, list.size());
	}

	@Test
	public void testDequeue_OneElement_ReturnOne() {
		CCI_03_04_MyQueue<Integer> list = new CCI_03_04_MyQueue<>();
		list.enqueue(1);
		assertEquals(Integer.valueOf(1), list.dequeue());
	}
	@Test
	public void testDequeue_TwoElement_ReturnOneAndTwo() {
		CCI_03_04_MyQueue<Integer> list = new CCI_03_04_MyQueue<>();
		list.enqueue(1);
		list.enqueue(2);
		assertEquals(Integer.valueOf(1),list.dequeue());
		assertEquals(Integer.valueOf(2),list.dequeue());
	}
	@Test
	public void testDequeue_TwentyElements_ReturnSizeZero() {
		CCI_03_04_MyQueue<Integer> list = new CCI_03_04_MyQueue<>();
		for (int i = 1; i < 21; i++) {
			list.enqueue(i);
		}
		for (int i = 0; i <20; i++) {
			assertEquals(Integer.valueOf(i+1),list.dequeue());
		}
		assertEquals(0, list.size());
	}
	@Test
	public void testDequeue_TwentyElementsDequeueOne_ReturnSizeNineteen() {
		CCI_03_04_MyQueue<Integer> list = new CCI_03_04_MyQueue<>();
		for (int i = 1; i < 21; i++) {
			list.enqueue(i);
		}
		assertEquals(Integer.valueOf(1), list.dequeue());
		assertEquals(19, list.size());
	}
	@Test
	public void testDequeue_TwentyOneElementsEnqueueThanDequeueThanEnqueue_ReturnSizeZero() {
		CCI_03_04_MyQueue<Integer> list = new CCI_03_04_MyQueue<>();
		for (int i = 1; i < 21; i++) {
			list.enqueue(i);
		}
		list.enqueue(1);
		list.dequeue();
		for (int i = 1; i < 20; i++) {
			assertEquals(Integer.valueOf(i+1),list.dequeue());
		}
		assertEquals(Integer.valueOf(1), list.dequeue());
		assertEquals(0, list.size());
	}
	@Test
	public void testDequeue_TwentyOneElementsEnqueueThanDequeueThanEnqueueThanDequeue_ReturnSizeZero() {
		CCI_03_04_MyQueue<Integer> list = new CCI_03_04_MyQueue<>();
		for (int i = 0; i < 20; i++) {
			list.enqueue(i);
		}
		list.enqueue(1);
		list.enqueue(2);
		for (int i = 0; i < 20; i++) {
			assertEquals(Integer.valueOf(i),list.dequeue());
		}
		assertEquals(Integer.valueOf(1), list.dequeue());
		assertEquals(Integer.valueOf(2), list.dequeue());
		assertEquals(0, list.size());
	}
	@Test
	public void testDequeue_TwentyOneElementsSuccessiveEnqueueAndDequeue_ReturnSizeZero() {
		CCI_03_04_MyQueue<Integer> list = new CCI_03_04_MyQueue<>();
		for (int i = 0; i < 20; i++) {
			list.enqueue(i);
		}
		assertEquals(Integer.valueOf(0), list.dequeue());
		assertEquals(Integer.valueOf(1), list.dequeue());
		assertEquals(Integer.valueOf(2), list.dequeue());
		assertEquals(Integer.valueOf(3), list.dequeue());
		assertEquals(Integer.valueOf(4), list.dequeue());
		assertEquals(Integer.valueOf(5), list.dequeue());
		list.enqueue(1);
		list.enqueue(1);
		list.enqueue(1);
		list.enqueue(1);
		list.enqueue(2);
		list.enqueue(2);
		for (int i = 5; i < 19; i++) {
			assertEquals(Integer.valueOf(i+1),list.dequeue());
		}
		assertEquals(Integer.valueOf(1), list.dequeue());
		assertEquals(Integer.valueOf(1), list.dequeue());
		assertEquals(4, list.size());
	}
	@Test(expected = NullPointerException.class)
	public void testDequeue_EmptyQueue_NullPointerException() {
		CCI_03_04_MyQueue<Integer> list = new CCI_03_04_MyQueue<>();
		list.dequeue();
	}

	@Test
	public void testIsEmpty_OneElement_ReturnFalse() {
		CCI_03_04_MyQueue<Integer> list = new CCI_03_04_MyQueue<>();
		list.enqueue(1);
		assertEquals(false, list.isEmpty());
	}
	@Test
	public void testIsEmpty_AddingTwoElementDequeueOneElement_ReturnFalse() {
		CCI_03_04_MyQueue<Integer> list = new CCI_03_04_MyQueue<>();
		list.enqueue(1);
		list.enqueue(2);
		list.dequeue();
		assertEquals(false, list.isEmpty());
	}
	@Test
	public void testIsEmpty_EmptyQueue_ReturnTrue() {
		CCI_03_04_MyQueue<Integer> list = new CCI_03_04_MyQueue<>();
		
		assertEquals(true, list.isEmpty());
	}
//
	@Test
	public void testSize_AddingOneElementRemovingOneElement_ReturnZero() {
		CCI_03_04_MyQueue<Integer> list = new CCI_03_04_MyQueue<>();
		list.enqueue(1);
		list.dequeue();
		assertEquals(0, list.size());
	}
	@Test
	public void testSize_AddingTwentyElementRemovingFiveElement_ReturnFifteen() {
		CCI_03_04_MyQueue<Integer> list = new CCI_03_04_MyQueue<>();
		for (int i = 1; i < 21; i++) {
			list.enqueue(i);
		}
		for (int i = 0; i <5; i++) {
			list.dequeue();
		}
		assertEquals(15, list.size());
	}
	@Test
	public void testSize_EmptyQueue_ReturnZero() {
		CCI_03_04_MyQueue<Integer> list = new CCI_03_04_MyQueue<>();
		assertEquals(0, list.size());
	}
	
	@Test
	public void testAddFiveElements_RemoveThree_AddNineElements_SizeShouldBeEleven() {
		CCI_03_04_MyQueue<Integer> list = new CCI_03_04_MyQueue<>();
		for (int i = 0; i < 5; i++) {
			list.enqueue(i);
		}
		for (int i = 0; i < 3; i++) {
			list.dequeue();
		}
		for (int i = 0; i < 9; i++) {
			list.enqueue(i);
		}
		assertEquals(11, list.size());
	}

}
