package testmyqueue;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Test;

import myqueue.RandomizedQueue;

public class TestRandomizedQueue {

	@Test
	public void testAdd_AddOneElement_ReturnSizeOne() {
		RandomizedQueue<Integer> queue = new RandomizedQueue<>();
		queue.add(10);
		assertEquals(1, queue.size());
	}

	@Test
	public void testAdd_TenElements_ReturnSizeTen() {
		RandomizedQueue<Integer> queue = new RandomizedQueue<>();
		for (int i = 1; i < 11; i++) {
			queue.add(i);
		}
		assertEquals(10, queue.size());
	}


	@Test
	public void testIsEmpty_EmptyQueue_ReturnTrue() {
		RandomizedQueue<Integer> queue = new RandomizedQueue<Integer>();
		assertEquals(true, queue.isEmpty());
	}

	@Test
	public void testIsEmpty_OneElement_ReturnFalse() {
		RandomizedQueue<Integer> queue = new RandomizedQueue<Integer>();
		queue.add(10);
		assertEquals(false, queue.isEmpty());
	}
	@Test (expected = NoSuchElementException.class)
	public void testRemove_EmptyQueue_ReturnNoSuchElementException() {
		RandomizedQueue<Integer> queue = new RandomizedQueue<Integer>();
		queue.remove();
	}


	@Test
	public void testRemove_AddOneElemenetRemvoIt_ReturnSizeZero() {
		RandomizedQueue<Integer> queue = new RandomizedQueue<Integer>();
		queue.add(1);
		queue.remove();
		assertEquals(0,queue.size());
	}
	@Test
	public void testRemove_AddTeneElemenetRemvoOne_ReturnSizeNine() {
		RandomizedQueue<Integer> queue = new RandomizedQueue<Integer>();
		for (int i = 0; i < 10; i++) {
			queue.add(i);
		}
		queue.remove();
		assertEquals(9,queue.size());
	}

}
