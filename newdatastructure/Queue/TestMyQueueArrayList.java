import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Test;

public class TestMyQueueArrayList {

	@Test
	public void testEnqueue_OneElement_ReturnSizeOne() {
		MyQueueArrayList<Integer> list = new MyQueueArrayList<>();
		list.enqueue(1);
		assertEquals(1, list.size());
	}
	@Test
	public void testEnqueue_TwoElement_ReturnSizeTow() {
		MyQueueArrayList<Integer> list = new MyQueueArrayList<>();
		list.enqueue(1);
		list.enqueue(2);
		assertEquals(2, list.size());
	}
	@Test
	public void testEnqueue_ElevenElement_ReturnSizeEleven() {
		MyQueueArrayList<Integer> list = new MyQueueArrayList<>();
		for (int i = 1; i < 11; i++) {
			list.enqueue(i);
		}
		assertEquals(10, list.size());
	}

	@Test
	public void testDequeue_OneElement_ReturnOne() {
		MyQueueArrayList<Integer> list = new MyQueueArrayList<>();
		list.enqueue(1);
		assertEquals(Integer.valueOf(1), list.dequeue());
	}
	@Test
	public void testDequeue_TwoElement_ReturnOneAndTwo() {
		MyQueueArrayList<Integer> list = new MyQueueArrayList<>();
		list.enqueue(1);
		list.enqueue(2);
		assertEquals(Integer.valueOf(1),list.dequeue());
		assertEquals(Integer.valueOf(2),list.dequeue());
	}
	@Test
	public void testDequeue_TwentyElements_ReturnSizeZero() {
		MyQueueArrayList<Integer> list = new MyQueueArrayList<>();
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
		MyQueueArrayList<Integer> list = new MyQueueArrayList<>();
		for (int i = 1; i < 21; i++) {
			list.enqueue(i);
		}
		assertEquals(Integer.valueOf(1), list.dequeue());
		assertEquals(19, list.size());
	}
	@Test
	public void testDequeue_TwentyOneElementsEnqueueThanDequeueThanEnqueue_ReturnSizeZero() {
		MyQueueArrayList<Integer> list = new MyQueueArrayList<>();
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
		MyQueueArrayList<Integer> list = new MyQueueArrayList<>();
		for (int i = 1; i < 21; i++) {
			list.enqueue(i);
		}
		list.enqueue(1);
		list.dequeue();
		list.enqueue(2);
		for (int i = 1; i < 20; i++) {
			assertEquals(Integer.valueOf(i+1),list.dequeue());
		}
		assertEquals(Integer.valueOf(1), list.dequeue());
		assertEquals(Integer.valueOf(2), list.dequeue());
		assertEquals(0, list.size());
	}
	@Test(expected = NoSuchElementException.class)
	public void testDequeue_EmptyQueue_NoSuchElementException() {
		MyQueueArrayList<Integer> list = new MyQueueArrayList<>();
		list.dequeue();
	}

	@Test
	public void testIsEmpty_OneElement_ReturnFalse() {
		MyQueueArrayList<Integer> list = new MyQueueArrayList<>();
		list.enqueue(1);
		assertEquals(false, list.isEmpty());
	}
	@Test
	public void testIsEmpty_AddingTwoElementDequeueOneElement_ReturnFalse() {
		MyQueueArrayList<Integer> list = new MyQueueArrayList<>();
		list.enqueue(1);
		list.enqueue(2);
		list.dequeue();
		assertEquals(false, list.isEmpty());
	}
	@Test
	public void testIsEmpty_EmptyQueue_ReturnTrue() {
		MyQueueArrayList<Integer> list = new MyQueueArrayList<>();
		
		assertEquals(true, list.isEmpty());
	}
//
	@Test
	public void testSize_AddingOneElementRemovingOneElement_ReturnZero() {
		MyQueueArrayList<Integer> list = new MyQueueArrayList<>();
		list.enqueue(1);
		list.dequeue();
		assertEquals(0, list.size());
	}
	@Test
	public void testSize_AddingTwentyElementRemovingFiveElement_ReturnFifteen() {
		MyQueueArrayList<Integer> list = new MyQueueArrayList<>();
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
		MyQueueArrayList<Integer> list = new MyQueueArrayList<>();
		assertEquals(0, list.size());
	}

}
