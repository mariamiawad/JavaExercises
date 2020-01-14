package testmyqueue;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;
import java.util.Random;

import org.junit.Test;

import heap.MaxPQ;

public class MaxPQTest {

	@Test
	public void testDelete() {
		MaxPQ<Integer> maxPQ = new MaxPQ<>();
		maxPQ.insert(1);
		maxPQ.insert(2);
		maxPQ.insert(3);
		maxPQ.insert(4);
		maxPQ.insert(5);
		for (int i = 5; i > 0; i--) {
			assertEquals(Integer.valueOf(i), maxPQ.delMax());
		}
		assertEquals(0, maxPQ.size());
	}

	@Test(expected = NoSuchElementException.class)
	public void testDelete_EmptyQueue_ThrowNoSuchElementExeption() {
		MaxPQ<Integer> maxPQ = new MaxPQ<>();
		maxPQ.delMax();
	}

	@Test
	public void testInsert_RandomNumbers_MoreThan20_ReturnEveryElementGreaterThanOther() {
		MaxPQ<Integer> maxPQ = new MaxPQ<>();
		Random random = new Random();
		for (int i = 0; i < 25; i++) {
			maxPQ.insert(random.nextInt());
		}
		while (maxPQ.size() > 1) {
			assert (maxPQ.delMax() > maxPQ.delMax());
		}

	}

	@Test
	public void testInsert_RandomNumbers_Size100_ReturnEveryElementGreaterThanOther() {
		MaxPQ<Integer> maxPQ = new MaxPQ<>();
		Random random = new Random();
		for (int i = 0; i < 100; i++) {
			maxPQ.insert(random.nextInt());
		}
		while (maxPQ.size() > 1) {

			assert (maxPQ.delMax() > maxPQ.delMax());

		}

	}

	@Test
	public void testSize_RandomNumbers_MoreThan20_Return25() {
		MaxPQ<Integer> maxPQ = new MaxPQ<>();
		Random random = new Random();
		for (int i = 0; i < 25; i++) {
			maxPQ.insert(random.nextInt(1000));
		}
		assertEquals(25, maxPQ.size());
	}

	@Test
	public void testisEmpty_RandomNumbers_MoreThan20_ReturnFalse() {
		MaxPQ<Integer> maxPQ = new MaxPQ<>();
		Random random = new Random();
		for (int i = 0; i < 25; i++) {
			maxPQ.insert(random.nextInt(1000));
		}
		assertEquals(false, maxPQ.isEmpty());
	}

	@Test
	public void testisEmpty_EmptyPQ_ReturnTrue() {
		MaxPQ<Integer> maxPQ = new MaxPQ<>();

		assertEquals(true, maxPQ.isEmpty());
	}
}
