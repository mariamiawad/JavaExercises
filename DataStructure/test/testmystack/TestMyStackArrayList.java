package testmystack;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;
import java.util.NoSuchElementException;

import org.junit.Test;

import arraylistlinkedlist.MyArrayList;
import mystak.MyStackArrayList;

public class TestMyStackArrayList {

	@Test
	public void testPush_PushOneElement_ReturnSizeOne() {
		MyStackArrayList<Integer> stack = new MyStackArrayList<>();
		stack.push(1);
		assertEquals(1, stack.size());
	}

	@Test
	public void testPush_PushTwoElement_ReturnSizeTwo() {
		MyStackArrayList<Integer> stack = new MyStackArrayList<>();
		stack.push(1);
		stack.push(2);
		assertEquals(2, stack.size());
	}

	@Test
	public void testPush_PushTwentyOneElement_ReturnSizeTwentyOne() {
		MyStackArrayList<Integer> stack = new MyStackArrayList<>();
		for (int i = 1; i < 22; i++) {
			stack.push(i);
		}
		assertEquals(21, stack.size());
	}

	@Test
	public void testPop_PushTwoElementPopOneElement_ReturnTwo() {
		MyStackArrayList<Integer> stack = new MyStackArrayList<>();
		stack.push(1);
		stack.push(2);
		assertEquals(Integer.valueOf(2), stack.pop());
	}

	@Test
	public void testPop_PushTwoElementPopTwoElement_ReturnTwoThenOne() {
		MyStackArrayList<Integer> stack = new MyStackArrayList<>();
		stack.push(1);
		stack.push(2);
		assertEquals(Integer.valueOf(2), stack.pop());
		assertEquals(Integer.valueOf(1), stack.pop());
	}

	@Test
	public void testPop_PushTwentyOneElementPopFiveElementPushFiveElement_ReturnSizeTwentyOne() {
		MyStackArrayList<Integer> stack = new MyStackArrayList<>();
		for (int i = 1; i < 22; i++) {
			stack.push(i);
		}
		assertEquals(Integer.valueOf(21), stack.pop());
		assertEquals(Integer.valueOf(20), stack.pop());
		assertEquals(Integer.valueOf(19), stack.pop());
		assertEquals(Integer.valueOf(18), stack.pop());
		assertEquals(Integer.valueOf(17), stack.pop());
		for (int i = 22; i < 27; i++) {
			stack.push(i);
		}

		assertEquals(21, stack.size());
	}

	@Test
	public void testPop_PushTwentyOneElementPopFiveElementPushFiveElementPopFiveElement_ReturnSizeSixteen() {
		MyStackArrayList<Integer> stack = new MyStackArrayList<>();
		for (int i = 1; i < 22; i++) {
			stack.push(i);
		}
		assertEquals(Integer.valueOf(21), stack.pop());
		assertEquals(Integer.valueOf(20), stack.pop());
		assertEquals(Integer.valueOf(19), stack.pop());
		assertEquals(Integer.valueOf(18), stack.pop());
		assertEquals(Integer.valueOf(17), stack.pop());
		for (int i = 22; i < 27; i++) {
			stack.push(i);
		}

		assertEquals(Integer.valueOf(26), stack.pop());
		assertEquals(Integer.valueOf(25), stack.pop());
		assertEquals(Integer.valueOf(24), stack.pop());
		assertEquals(Integer.valueOf(23), stack.pop());
		assertEquals(Integer.valueOf(22), stack.pop());
		assertEquals(16, stack.size());
	}

	@Test
	public void testSize_EmptyStack_ReturnZero() {
		MyStackArrayList<Integer> stack = new MyStackArrayList<>();
		assertEquals(0, stack.size());
	}

	@Test
	public void testSize_PushOneElementPopOneElement_ReturnZero() {
		MyStackArrayList<Integer> stack = new MyStackArrayList<>();
		stack.push(1);
		stack.pop();
		assertEquals(0, stack.size());
	}

	@Test
	public void testSize_PushTwentyOnePopOneElement_ReturnSizeTwenty() {
		MyStackArrayList<Integer> stack = new MyStackArrayList<>();
		for (int i = 1; i < 22; i++) {
			stack.push(i);
		}
		assertEquals(Integer.valueOf(21), stack.pop());
		assertEquals(20, stack.size());
	}

	@Test
	public void testSize_PushTwentyTwoPopOneElement_ReturnSizeTwentyOne() {
		MyStackArrayList<Integer> stack = new MyStackArrayList<>();
		for (int i = 1; i < 22; i++) {
			stack.push(i);
		}
		stack.push(9);
		assertEquals(Integer.valueOf(9), stack.pop());
		assertEquals(21, stack.size());
	}

	@Test
	public void testSize_PushElevenElementsPopOneElement_ReturnSizeTen() {
		MyStackArrayList<Integer> stack = new MyStackArrayList<>();
		for (int i = 1; i < 12; i++) {
			stack.push(i);
		}
		assertEquals(Integer.valueOf(11), stack.pop());
		assertEquals(10, stack.size());
	}

	@Test
	public void testisEmpty_PushElevenElementsPopOneElement_ReturnFalse() {
		MyStackArrayList<Integer> stack = new MyStackArrayList<>();
		for (int i = 1; i < 12; i++) {
			stack.push(i);
		}
		assertEquals(Integer.valueOf(11), stack.pop());
		assertEquals(10, stack.size());
		assertEquals(false, stack.isEmpty());
	}

	@Test
	public void testisEmpty_EmptyStack_ReturnTrue() {
		MyStackArrayList<Integer> stack = new MyStackArrayList<>();
		assertEquals(true, stack.isEmpty());
	}

	@Test
	public void testisEmpty_PushElevenElementsPopAAll_ReturnTrue() {
		MyStackArrayList<Integer> stack = new MyStackArrayList<>();
		for (int i = 1; i < 12; i++) {
			stack.push(i);
		}
		for (int i = 11; i > 0; i--) {
			assertEquals(Integer.valueOf(i), stack.pop());
		}

		assertEquals(0, stack.size());
		assertEquals(true, stack.isEmpty());
	}

	@Test(expected = NoSuchElementException.class)
	public void testPeek_PushElevenElementsPopAAll_NoSuchElementException() {
		MyStackArrayList<Integer> stack = new MyStackArrayList<>();
		for (int i = 1; i < 12; i++) {
			stack.push(i);
		}
		for (int i = 0; i < 11; i++) {
			stack.pop();
		}
		stack.peek();
	}

	@Test
	public void testPeek_PushElevenElementsPopOne_ReturnTen() {
		MyStackArrayList<Integer> stack = new MyStackArrayList<>();
		for (int i = 1; i < 12; i++) {
			stack.push(i);
		}

		assertEquals(Integer.valueOf(11), stack.peek());
		assertEquals(Integer.valueOf(11), stack.peek());
		assertEquals(Integer.valueOf(11), stack.pop());
		assertEquals(Integer.valueOf(10), stack.peek());

	}

	@Test
	public void testPeek_PushElevenElementsPopOneEnqueueOne_ReturnTwelve() {
		MyStackArrayList<Integer> stack = new MyStackArrayList<>();
		for (int i = 1; i < 12; i++) {
			stack.push(i);
		}

		assertEquals(Integer.valueOf(11), stack.peek());
		assertEquals(Integer.valueOf(11), stack.peek());
		assertEquals(Integer.valueOf(11), stack.pop());
		stack.push(12);
		assertEquals(Integer.valueOf(12), stack.peek());

	}@Test
	public void Itreator_OverOneElement_One() {
		MyStackArrayList<Integer> list = new MyStackArrayList<>();
		list.push(1);
		Iterator<Integer> itrIterator = list.iterator();
		while (itrIterator.hasNext()) {
			System.out.println(itrIterator.next());
		}
		assertEquals(list.size(), 1);
	}

	@Test
	public void Itreator_TwoElement_Two() {
		MyStackArrayList<Integer> list = new MyStackArrayList<>();
		list.push(1);
		list.push(2);
		Iterator<Integer> itrIterator = list.iterator();
		while (itrIterator.hasNext()) {
			System.out.println(itrIterator.next());
		}
		assertEquals(list.size(), 2);
	}
	@Test
	public void Itreator_ThreeElement_Three() {
		MyStackArrayList<Integer> list = new MyStackArrayList<>();
		list.push(1);
		list.push(2);
		list.push(3);
		Iterator<Integer> itrIterator = list.iterator();
		while (itrIterator.hasNext()) {
			System.out.println(itrIterator.next());
		}
		assertEquals(list.size(), 3);
	}
	@Test
	public void Itreator_TenElement_Ten() {
		MyStackArrayList<Integer> list = new MyStackArrayList<>();
		for (int i = 1; i < 11; i++) {
			list.push(i);
		}
		
		Iterator<Integer> itrIterator = list.iterator();
		while (itrIterator.hasNext()) {
			System.out.println(itrIterator.next());
		}
		assertEquals(list.size(), 10);
	}
	@Test
	public void ItreatorHasNext_HasNextElement_False() {
		MyStackArrayList<Integer> list = new MyStackArrayList<>();
		
		
		Iterator<Integer> itrIterator = list.iterator();
		
		assertEquals(itrIterator.hasNext(), false);
	}
	@Test(expected = NoSuchElementException.class)
	public void Itreator_EmptyList_NoSuchElementException() {
		MyStackArrayList<Integer> list = new MyStackArrayList<>();
		Iterator<Integer> itrIterator = list.iterator();
		itrIterator.next();
	}

}
