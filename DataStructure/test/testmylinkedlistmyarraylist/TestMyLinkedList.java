package testmylinkedlistmyarraylist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.Iterator;
import java.util.NoSuchElementException;

import org.junit.Test;

import arraylistlinkedlist.MyLinkedList;

public class TestMyLinkedList {

	@Test
	public void Add_OneElemenet_SizeOne() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		list.add(1);
		assertEquals(list.size(), 1);
	}

	@Test
	public void Add_FourElemenet_SizeFour() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		assertEquals(list.size(), 4);
	}

	@Test
	public void AddatIndex_FourElemenet_SizeFour() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		list.add(0, 1);
		list.add(1, 2);
		list.add(2, 3);
		list.add(3, 4);

		assertEquals(list.size(), 4);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void AddatIndex_OneElemenet_IndexOutOfBoundException() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		list.add(1, 1);
	}

	@Test
	public void AddatIndex_OneElemenet_SizeOne() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		list.add(0, 1);
		assertEquals(list.size(), 1);
	}

	@Test
	public void RemoveatIndex_OneElemenet_ReturnOne() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		list.add(0, 1);
		assertEquals(list.remove(0), Integer.valueOf(1));
	}

	@Test
	public void RemoveatIndex_OneElemenet_ReturnThree() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		for (int i = 0; i < 11; i++) {
			list.add(i);
		}
		assertEquals(list.remove(3), Integer.valueOf(3));
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void RemoveatIndex_IndexOneOfIndexZero_IndexOutOfBoundException() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		list.add(1);
		list.remove(1);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void RemoveatIndex_IndexOneSmallerThanZero_IndexOutOfBoundException() {
		MyLinkedList<Integer> list = new MyLinkedList<>();

		list.remove(-1);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void RemoveatIndex_EmptyLinkedList_IndexOutOfBoundException() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		list.remove(0);
	}

	@Test
	public void RemoveObject_ElementFound_True() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}

		assertEquals(list.remove(Integer.valueOf(0)), true);
	}

	@Test
	public void RemoveObject_ElementNotFound_False() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}

		assertEquals(list.remove(Integer.valueOf(11)), false);
	}

	@Test
	public void RemoveObject_ElementFoundDuplicates_True() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		list.add(9);
		assertEquals(list.remove(Integer.valueOf(9)), true);
	}

	@Test
	public void RemoveObject_ElementFoundBeginIndex_True() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		assertEquals(list.remove(Integer.valueOf(0)), true);

	}

	@Test
	public void RemoveObject_ElementFoundEndIndex_True() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		assertEquals(list.remove(Integer.valueOf(9)), true);

	}

	@Test
	public void Set_ElementAtTheEnd_Eleven() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}

		assertEquals(list.set(9, Integer.valueOf(11)), Integer.valueOf(11));

	}

	@Test
	public void Set_ElementAtTheBegin_Eleven() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}

		assertEquals(list.set(0, Integer.valueOf(11)), Integer.valueOf(11));

	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void Set_ElementIndexBiggerThanLastIndex_IndexOutOfBoundsException() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		list.set(10, 1);

	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void Set_ElementIndexSmallerThanZero_IndexOutOfBoundsException() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		list.set(-1, 1);

	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void Set_ElementIndexAtZero_IndexOutOfBoundsException() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		list.set(0, 1);

	}

	@Test
	public void Size_AddTenElement_Ten() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		assertEquals(list.size(), 10);
	}

	@Test
	public void Size_EmptyList_Zero() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		assertEquals(list.size(), 0);
	}

	@Test
	public void IsEmpty_EmptyList_True() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		assertEquals(list.isEmpty(), true);
	}

	@Test
	public void IsEmpty_TenElement_False() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		assertEquals(list.isEmpty(), false);
	}

	@Test
	public void AddFirst_Nineteen_SizeEleven() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		list.addFirst(19);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		assertEquals(list.size(), 11);
	}

	@Test
	public void AddFirst_Nineteen_SizeOne() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		list.addFirst(19);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		assertEquals(list.size(), 1);
	}

	@Test
	public void AddLast_Nineteen_SizeEleven() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		list.addLast(19);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		assertEquals(list.size(), 11);
	}

	@Test
	public void AddLast_Nineteen_SizeOne() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		list.addFirst(19);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		assertEquals(list.size(), 1);
	}

	@Test
	public void GetFirst_ElevenElement_Zero() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}

		assertEquals(list.getFirst(), Integer.valueOf(0));
	}

	@Test
	public void GetFirst_OneElement_Nine() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		list.add(9);

		assertEquals(list.getFirst(), Integer.valueOf(9));
	}

	@Test(expected = NoSuchElementException.class)
	public void GetFirst_NoElement_NoSuchElementException() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		list.getFirst();
	}

	@Test
	public void GetLast_ElevenElement_Nine() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}

		assertEquals(list.getLast(), Integer.valueOf(9));
	}

	@Test
	public void GetLast_OneElement_Nine() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		list.add(9);

		assertEquals(list.getLast(), Integer.valueOf(9));
	}

	@Test(expected = NoSuchElementException.class)
	public void GetLast_NoElement_NoSuchElementException() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		list.getLast();
	}

	@Test
	public void RemoveFirst_TenElementList_Zero() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}

		assertEquals(list.removeFirst(), Integer.valueOf(0));

	}

	@Test
	public void RemoveFirst_OneElementList_Nine() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		list.add(9);
		assertEquals(list.removeFirst(), Integer.valueOf(9));

	}

	@Test(expected = NoSuchElementException.class)
	public void RemoveFirst_NoElementList_NoSuchElementException() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		list.removeFirst();

	}

	@Test
	public void RemoveLast_TenElementList_Nine() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}

		assertEquals(list.removeLast(), Integer.valueOf(9));

	}

	@Test
	public void RemoveLast_OneElementList_Nine() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		list.add(9);
		assertEquals(list.removeLast(), Integer.valueOf(9));

	}

	@Test(expected = NoSuchElementException.class)
	public void RemoveFLast_NoElementList_NoSuchElementException() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		list.removeFirst();

	}

	@Test
	public void Itreator_OverOneElement_One() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		list.add(1);
		Iterator<Integer> itrIterator = list.iterator();
		while (itrIterator.hasNext()) {
			System.out.println(itrIterator.next());
		}
		assertEquals(list.size(), 1);
	}

	@Test
	public void Itreator_TwoElement_Two() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		list.add(1);
		list.add(2);
		Iterator<Integer> itrIterator = list.iterator();
		while (itrIterator.hasNext()) {
			System.out.println(itrIterator.next());
		}
		assertEquals(list.size(), 2);
	}
	@Test
	public void Itreator_ThreeElement_Three() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		Iterator<Integer> itrIterator = list.iterator();
		while (itrIterator.hasNext()) {
			System.out.println(itrIterator.next());
		}
		assertEquals(list.size(), 3);
	}
	@Test
	public void Itreator_TenElement_Ten() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		for (int i = 1; i < 11; i++) {
			list.add(i);
		}
		
		Iterator<Integer>itrIterator = list.iterator();
		while (itrIterator.hasNext()) {
			System.out.println(itrIterator.next());
		}
		assertEquals(list.size(), 10);
	}
	@Test
	public void ItreatorHasNext_HasNextElement_False() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		
		
		Iterator<Integer> itrIterator = list.iterator();
		
		assertEquals(itrIterator.hasNext(), false);
	}
	@Test(expected = NoSuchElementException.class)
	public void Itreator_EmptyList_NoSuchElementException() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		Iterator<Integer> itrIterator = list.iterator();
		itrIterator.next();
	}
	
	@Test
	public void testAddOneElement_CallIndexOfWithNull() {
		
		MyLinkedList<Integer> list = new MyLinkedList<>();
		list.add(1);
		assertEquals(-1, list.indexOf(null));
	}
	
	@Test
	public void testAddOneElement_CallContainsWithNull() {
		
		MyLinkedList<Integer> list = new MyLinkedList<>();
		list.add(1);
		assertFalse(list.contains(null));
	}
}
