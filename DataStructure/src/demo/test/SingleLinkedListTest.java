package demo.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.Iterator;
import java.util.NoSuchElementException;

import org.junit.Test;

import demo.SingleLinkedList;

public class SingleLinkedListTest {

	@Test
	public void Add_OneElemenet_SizeOne() {
		SingleLinkedList<Integer> list = new SingleLinkedList<>();
		list.add(1);
		assertEquals(list.size(), 1);
	}

	@Test
	public void Add_FourElemenet_SizeFour() {
		SingleLinkedList<Integer> list = new SingleLinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		assertEquals(list.size(), 4);
	}

	@Test
	public void AddatIndex_FourElemenet_SizeFour() {
		SingleLinkedList<Integer> list = new SingleLinkedList<>();
		list.add(0, 1);
		list.add(1, 2);
		list.add(2, 3);
		list.add(3, 4);

		assertEquals(list.size(), 4);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void AddatIndex_OneElemenet_IndexOutOfBoundException() {
		SingleLinkedList<Integer> list = new SingleLinkedList<>();
		list.add(1, 1);
	}

	@Test
	public void AddatIndex_OneElemenet_SizeOne() {
		SingleLinkedList<Integer> list = new SingleLinkedList<>();
		list.add(0, 1);
		assertEquals(list.size(), 1);
	}

	@Test
	public void RemoveatIndex_OneElemenet_ReturnOne() {
		SingleLinkedList<Integer> list = new SingleLinkedList<>();
		list.add(0, 1);
		assertEquals(list.remove(0), Integer.valueOf(1));
	}

	@Test
	public void RemoveatIndex_OneElemenet_ReturnThree() {
		SingleLinkedList<Integer> list = new SingleLinkedList<>();
		for (int i = 0; i < 11; i++) {
			list.add(i);
		}
		assertEquals(Integer.valueOf(3),list.remove(3));
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void RemoveatIndex_IndexOneOfIndexZero_IndexOutOfBoundException() {
		SingleLinkedList<Integer> list = new SingleLinkedList<>();
		list.add(1);
		list.remove(1);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void RemoveatIndex_IndexOneSmallerThanZero_IndexOutOfBoundException() {
		SingleLinkedList<Integer> list = new SingleLinkedList<>();

		list.remove(-1);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void RemoveatIndex_EmptyLinkedList_IndexOutOfBoundException() {
		SingleLinkedList<Integer> list = new SingleLinkedList<>();
		list.remove(0);
	}

	@Test
	public void RemoveObject_ElementFound_True() {
		SingleLinkedList<Integer> list = new SingleLinkedList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}

		assertEquals(list.remove(Integer.valueOf(0)), true);
	}

	@Test
	public void RemoveObject_ElementNotFound_False() {
		SingleLinkedList<Integer> list = new SingleLinkedList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}

		assertEquals(list.remove(Integer.valueOf(11)), false);
	}

	@Test
	public void RemoveObject_ElementFoundDuplicates_True() {
		SingleLinkedList<Integer> list = new SingleLinkedList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		list.add(9);
		assertEquals(list.remove(Integer.valueOf(9)), true);
	}

	@Test
	public void RemoveObject_ElementFoundBeginIndex_True() {
		SingleLinkedList<Integer> list = new SingleLinkedList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		assertEquals(list.remove(Integer.valueOf(0)), true);

	}

	@Test
	public void RemoveObject_ElementFoundEndIndex_True() {
		SingleLinkedList<Integer> list = new SingleLinkedList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		assertEquals(list.remove(Integer.valueOf(9)), true);

	}

	@Test
	public void Set_ElementAtTheEnd_Eleven() {
		SingleLinkedList<Integer> list = new SingleLinkedList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}

		assertEquals(list.set(9, Integer.valueOf(11)), Integer.valueOf(11));

	}

	@Test
	public void Set_ElementAtTheBegin_Eleven() {
		SingleLinkedList<Integer> list = new SingleLinkedList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}

		assertEquals(list.set(0, Integer.valueOf(11)), Integer.valueOf(11));

	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void Set_ElementIndexBiggerThanLastIndex_IndexOutOfBoundsException() {
		SingleLinkedList<Integer> list = new SingleLinkedList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		list.set(10, 1);

	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void Set_ElementIndexSmallerThanZero_IndexOutOfBoundsException() {
		SingleLinkedList<Integer> list = new SingleLinkedList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		list.set(-1, 1);

	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void Set_ElementIndexAtZero_IndexOutOfBoundsException() {
		SingleLinkedList<Integer> list = new SingleLinkedList<>();
		list.set(0, 1);

	}

	@Test
	public void Size_AddTenElement_Ten() {
		SingleLinkedList<Integer> list = new SingleLinkedList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		assertEquals(list.size(), 10);
	}

	@Test
	public void Size_EmptyList_Zero() {
		SingleLinkedList<Integer> list = new SingleLinkedList<>();
		assertEquals(list.size(), 0);
	}

	@Test
	public void IsEmpty_EmptyList_True() {
		SingleLinkedList<Integer> list = new SingleLinkedList<>();
		assertEquals(list.isEmpty(), true);
	}

	@Test
	public void IsEmpty_TenElement_False() {
		SingleLinkedList<Integer> list = new SingleLinkedList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		assertEquals(list.isEmpty(), false);
	}

	@Test
	public void testAddOneElement_CallIndexOfWithNull() {

		SingleLinkedList<Integer> list = new SingleLinkedList<>();
		list.add(1);
		assertEquals(-1, list.indexOf(null));
	}

	@Test
	public void testAddOneElement_CallContainsWithNull() {

		SingleLinkedList<Integer> list = new SingleLinkedList<>();
		list.add(1);
		assertFalse(list.contains(null));
	}
}
