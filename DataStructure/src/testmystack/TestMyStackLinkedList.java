package testmystack;
import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Test;

import mystak.MyStackLinkedList;

public class TestMyStackLinkedList {

	@Test
	public void testPush_PushOneElement_ReturnSizeOne() {
		MyStackLinkedList<Integer> stack = new MyStackLinkedList<>();
		stack.push(1);
		assertEquals(1, stack.size());
	}

	@Test
	public void testPush_PushTwoElement_ReturnSizeTwo() {
		MyStackLinkedList<Integer> stack = new MyStackLinkedList<>();
		stack.push(1);
		stack.push(2);
		assertEquals(2, stack.size());
	}

	@Test
	public void testPush_PushTwentyOneElement_ReturnSizeTwentyOne() {
		MyStackLinkedList<Integer> stack = new MyStackLinkedList<>();
		for (int i = 1; i < 22; i++) {
			stack.push(i);
		}
		assertEquals(21, stack.size());
	}

	@Test
	public void testPop_PushTwoElementPopOneElement_ReturnTwo() {
		MyStackLinkedList<Integer> stack = new MyStackLinkedList<>();
		stack.push(1);
		stack.push(2);
		assertEquals(Integer.valueOf(2), stack.pop());
	}

	@Test
	public void testPop_PushTwoElementPopTwoElement_ReturnTwoThenOne() {
		MyStackLinkedList<Integer> stack = new MyStackLinkedList<>();
		stack.push(1);
		stack.push(2);
		assertEquals(Integer.valueOf(2), stack.pop());
		assertEquals(Integer.valueOf(1), stack.pop());
	}

	@Test
	public void testPop_PushTwentyOneElementPopFiveElementPushFiveElement_ReturnSizeTwentyOne() {
		MyStackLinkedList<Integer> stack = new MyStackLinkedList<>();
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
		MyStackLinkedList<Integer> stack = new MyStackLinkedList<>();
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
		MyStackLinkedList<Integer> stack = new MyStackLinkedList<>();
		assertEquals(0, stack.size());
	}

	@Test
	public void testSize_PushOneElementPopOneElement_ReturnZero() {
		MyStackLinkedList<Integer> stack = new MyStackLinkedList<>();
		stack.push(1);
		stack.pop();
		assertEquals(0, stack.size());
	}

	@Test
	public void testSize_PushTwentyOnePopOneElement_ReturnSizeTwenty() {
		MyStackLinkedList<Integer> stack = new MyStackLinkedList<>();
		for (int i = 1; i < 22; i++) {
			stack.push(i);
		}
		assertEquals(Integer.valueOf(21), stack.pop());
		assertEquals(20, stack.size());
	}

	@Test
	public void testSize_PushTwentyTwoPopOneElement_ReturnSizeTwentyOne() {
		MyStackLinkedList<Integer> stack = new MyStackLinkedList<>();
		for (int i = 1; i < 22; i++) {
			stack.push(i);
		}
		stack.push(9);
		assertEquals(Integer.valueOf(9), stack.pop());
		assertEquals(21, stack.size());
	}

	@Test
	public void testSize_PushElevenElementsPopOneElement_ReturnSizeTen() {
		MyStackLinkedList<Integer> stack = new MyStackLinkedList<>();
		for (int i = 1; i < 12; i++) {
			stack.push(i);
		}
		assertEquals(Integer.valueOf(11), stack.pop());
		assertEquals(10, stack.size());
	}

	@Test
	public void testisEmpty_PushElevenElementsPopOneElement_ReturnFalse() {
		MyStackLinkedList<Integer> stack = new MyStackLinkedList<>();
		for (int i = 1; i < 12; i++) {
			stack.push(i);
		}
		assertEquals(Integer.valueOf(11), stack.pop());
		assertEquals(10, stack.size());
		assertEquals(false, stack.isEmpty());
	}

	@Test
	public void testisEmpty_EmptyStack_ReturnTrue() {
		MyStackLinkedList<Integer> stack = new MyStackLinkedList<>();
		assertEquals(true, stack.isEmpty());
	}

	@Test
	public void testisEmpty_PushElevenElementsPopAAll_ReturnTrue() {
		MyStackLinkedList<Integer> stack = new MyStackLinkedList<>();
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
		MyStackLinkedList<Integer> stack = new MyStackLinkedList<>();
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
		MyStackLinkedList<Integer> stack = new MyStackLinkedList<>();
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
		MyStackLinkedList<Integer> stack = new MyStackLinkedList<>();
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
		MyStackLinkedList<Integer> list = new MyStackLinkedList<>();
		list.push(1);
		MyStackLinkedList<Integer>.MyIterator itrIterator = list.iterator();
		while (itrIterator.hasNext()) {
			System.out.println(itrIterator.next());
		}
		assertEquals(list.size(), 1);
	}

	@Test
	public void Itreator_TwoElement_Two() {
		MyStackLinkedList<Integer> list = new MyStackLinkedList<>();
		list.push(1);
		list.push(2);
		MyStackLinkedList<Integer>.MyIterator itrIterator = list.iterator();
		while (itrIterator.hasNext()) {
			System.out.println(itrIterator.next());
		}
		assertEquals(list.size(), 2);
	}
	@Test
	public void Itreator_ThreeElement_Three() {
		MyStackLinkedList<Integer> list = new MyStackLinkedList<>();
		list.push(1);
		list.push(2);
		list.push(3);
		MyStackLinkedList<Integer>.MyIterator itrIterator = list.iterator();
		while (itrIterator.hasNext()) {
			System.out.println(itrIterator.next());
		}
		assertEquals(list.size(), 3);
	}
	@Test
	public void Itreator_TenElement_Ten() {
		MyStackLinkedList<Integer> list = new MyStackLinkedList<>();
		for (int i = 1; i < 11; i++) {
			list.push(i);
		}
		
		MyStackLinkedList<Integer>.MyIterator itrIterator = list.iterator();
		while (itrIterator.hasNext()) {
			System.out.println(itrIterator.next());
		}
		assertEquals(list.size(), 10);
	}
	@Test
	public void ItreatorHasNext_HasNextElement_False() {
		MyStackLinkedList<Integer> list = new MyStackLinkedList<>();
		
		
		MyStackLinkedList<Integer>.MyIterator itrIterator = list.iterator();
		
		assertEquals(itrIterator.hasNext(), false);
	}
	@Test(expected = NoSuchElementException.class)
	public void Itreator_EmptyList_NoSuchElementException() {
		MyStackLinkedList<Integer> list = new MyStackLinkedList<>();
		MyStackLinkedList<Integer>.MyIterator itrIterator = list.iterator();
		itrIterator.next();
		
	}


}
