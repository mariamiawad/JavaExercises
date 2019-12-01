package test;

import static org.junit.Assert.assertEquals;

import java.util.NoSuchElementException;

import org.junit.Test;

import arraylistlinkedlist.MyArrayList;
import arraylistlinkedlist.MyLinkedList;
import arraylistlinkedlist.MyArrayList.MyIterator;

public class TestMyArrayList {
	@Test
	public void size_AddingOneInteger_ExpectedOne() {
		MyArrayList<Integer> arrayList = new MyArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		assertEquals(arrayList.size(), 2);
	}
	@Test
	public void size_AddingTwoInteger_ExpectedTwo() {
		MyArrayList<Integer> arrayList = new MyArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		assertEquals(arrayList.size(), 2);
	}
	@Test
	public void size_AddingTwoIntegerNegative_ExpectedTwo() {
		MyArrayList<Integer> arrayList = new MyArrayList<>();
		arrayList.add(-1);
		arrayList.add(-1);
		assertEquals(arrayList.size(), 2);
	}
	@Test (expected = IndexOutOfBoundsException.class)
	public void addAtIndex_IndexBigerThanSize_OutOfBoundsExeption() {
		MyArrayList<Integer> arrayList = new MyArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3,4);
	}
	@Test (expected = IndexOutOfBoundsException.class)
	public void addAtIndex_IndexBigerThanSmallerThanZero_OutOfBoundsExeption() {
		MyArrayList<Integer> arrayList = new MyArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3,-1);
		
	}
	@Test
	public void Contains_ContainsAnElement_True() {
		MyArrayList<Integer> arrayList = new MyArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		assertEquals(arrayList.contains(2), true);
	}
	@Test
	public void Contains_ContainsAnElementNegative_True() {
		MyArrayList<Integer> arrayList = new MyArrayList<>();
		arrayList.add(1);
		arrayList.add(-2);
		assertEquals(arrayList.contains(-2), true);
	}

	@Test
	public void Contains_ContainsAnElement_False() {
		MyArrayList<Integer> arrayList = new MyArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		assertEquals(arrayList.contains(4), false);
	}
	@Test
	public void Contains_ContainsAnElementNegative_False() {
		MyArrayList<Integer> arrayList = new MyArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		assertEquals(arrayList.contains(-4), false);
	}
	@Test
	public void Get_GetAnElement_Two() {
		MyArrayList<Integer> arrayList = new MyArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		assertEquals(arrayList.get(1), Integer.valueOf(2));
	}
	@Test (expected = IndexOutOfBoundsException.class)
	public void Get_GetIndexSmallerThanZero_IndexOutOfBoundException() {
		MyArrayList<Integer> arrayList = new MyArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.get(-1);
	}

	@Test (expected = IndexOutOfBoundsException.class)
	public void Get_GetIndexSmallerThanSize_IndexOutOfBoundException() {
		MyArrayList<Integer> arrayList = new MyArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.get(2);
	}

	@Test
		public void IndexOf_IndexOfTwo_Two() {
			MyArrayList<Integer> arrayList = new MyArrayList<>();
			arrayList.add(1);
			arrayList.add(2);
			assertEquals(arrayList.indexOf(2), 1);
		}

	@Test
	public void IndexOf_IndexOfObjectNotFound_MinusOne() {
		MyArrayList<Integer> arrayList = new MyArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		assertEquals(arrayList.indexOf(3), -1);
	}

	@Test 
	public void IndexOf_IndexOfElementIsntFound_MinusOne() {
		MyArrayList<Integer> arrayList = new MyArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		assertEquals(arrayList.indexOf(3), -1); 
	}

	@Test
	public void IndexOf_IndexOfElementEound_One() {
		MyArrayList<Integer> arrayList = new MyArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		assertEquals(arrayList.indexOf(2),1); 
	}

	@Test
	public void IsEmpty_ArrayIsEmpty_True() {
		MyArrayList<Integer> arrayList = new MyArrayList<>();
		assertEquals(arrayList.isEmpty(),true); 
	}
	@Test
	public void IsEmpty_ArrayIsEmpty_False() {
		MyArrayList<Integer> arrayList = new MyArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		assertEquals(arrayList.isEmpty(),false); 
	}
	@Test
	public void Remove_ElementFoundNotFound_false() {
		MyArrayList<Integer> arrayList = new MyArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		assertEquals(arrayList.remove(Integer.valueOf(0)),false); 
	}
	@Test
	public void Remove_ElementFound_True() {
		MyArrayList<Integer> arrayList = new MyArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		assertEquals(arrayList.remove(Integer.valueOf(2)),true); 
	}
	
	@Test
	public void Remove_ElementFound_Two() {
		MyArrayList<Integer> arrayList = new MyArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		assertEquals(arrayList.remove(1),Integer.valueOf(2)); 
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void Remove_IndexBiggerThanSize_IndexOutOfBoundException() {
		MyArrayList<Integer> arrayList = new MyArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.remove(2);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void Remove_IndexSmallerThanZero_IndexOutOfBoundException() {
		MyArrayList<Integer> arrayList = new MyArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.remove(-1);
	}
	@Test
	public void Set_SetElementatSpecificLocation_Two() {
		MyArrayList<Integer> arrayList = new MyArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		assertEquals(arrayList.set(1, Integer.valueOf(0)),Integer.valueOf(2)); 
	}
	@Test (expected = IndexOutOfBoundsException.class)
	public void Set_SetElementatSpecificLocationBiggerThanSize_IndexOutOfBoundException() {
		MyArrayList<Integer> arrayList = new MyArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.set(3, Integer.valueOf(0));
	}
	@Test (expected = IndexOutOfBoundsException.class)
	public void Set_SetElementatSpecificLocationSmallerThanZero_IndexOutOfBoundException() {
		MyArrayList<Integer> arrayList = new MyArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.set(-1, Integer.valueOf(0));
	}
	
	@Test
	public void hasNext_ArrayHasNext_True() {
		MyArrayList<Integer> arrayList = new MyArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		MyArrayList<Integer>.MyIterator iterator = arrayList.iterator();
		assertEquals(iterator.hasNext(), true);
	}
	@Test
	public void hasNext_ArrayHasNext_False() {
		MyArrayList<Integer> arrayList = new MyArrayList<>();
		
		MyArrayList<Integer>.MyIterator  i = arrayList.iterator();
		assertEquals(i.hasNext(),false); 
	}
	@Test (expected = NoSuchElementException.class)
	public void hasNext_ArrayNext_NoSuchElementException() {
		MyArrayList<Integer> arrayList = new MyArrayList<>();
		
		MyArrayList<Integer>.MyIterator  i = arrayList.iterator();
		i.next();
	}
	
	
	@Test 
	public void hasNext_ArrayNext_Two() {
		MyArrayList<Integer> arrayList = new MyArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		MyArrayList<Integer>.MyIterator  i = arrayList.iterator();
		assertEquals(i.next(), Integer.valueOf(1));
		assertEquals(i.next(), Integer.valueOf(2));
	}
	@Test 
	public void hasNext_ArrayNext_One() {
		MyArrayList<Integer> arrayList = new MyArrayList<>();
		arrayList.add(1);
		MyArrayList<Integer>.MyIterator  i = arrayList.iterator();
		assertEquals(i.next(), Integer.valueOf(1));
	}
	@Test
	public void Resize_FullArray_ResizeBiggerThanOriginalArrayByTwo() {
		MyArrayList<Integer> arrayList = new MyArrayList<Integer>();
		for (int i = 0; i <11; i++) {
			arrayList.add(i);
		}
		
		assertEquals(arrayList.size(),11);
	}
	@Test
	public void Resize_FullArray_ResizeSmallerThanOriginalArrayDivideByTwo() {
		MyArrayList<Integer> arrayList = new MyArrayList<Integer>();
		for (int i = 0; i <11; i++) {
			arrayList.add(i);
		}
		for (int i = 0; i < 6; i++) {
			arrayList.remove(i);
		}
		
		assertEquals(arrayList.size(),5);
	}
	@Test
	public void Itreator_OverOneElement_One() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		list.add(1);
		MyLinkedList<Integer>.MyIterator itrIterator = list.iterator();
		while (itrIterator.hasNext()) {
			System.out.println(itrIterator.next());
		}
		assertEquals(list.size(), 1);
	}

	@Test
	public void Itreator_TwoElement_Two() {
		MyArrayList<Integer> list = new MyArrayList<>();
		list.add(1);
		list.add(2);
		MyArrayList<Integer>.MyIterator itrIterator = list.iterator();
		while (itrIterator.hasNext()) {
			System.out.println(itrIterator.next());
		}
		assertEquals(list.size(), 2);
	}
	@Test
	public void Itreator_ThreeElement_Three() {
		MyArrayList<Integer> list = new MyArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		MyArrayList<Integer>.MyIterator itrIterator = list.iterator();
		while (itrIterator.hasNext()) {
			System.out.println(itrIterator.next());
		}
		assertEquals(list.size(), 3);
	}
	@Test
	public void Itreator_TenElement_Ten() {
		MyArrayList<Integer> list = new MyArrayList<>();
		for (int i = 1; i < 11; i++) {
			list.add(i);
		}
		
		MyArrayList<Integer>.MyIterator itrIterator = list.iterator();
		while (itrIterator.hasNext()) {
			System.out.println(itrIterator.next());
		}
		assertEquals(list.size(), 10);
	}
	@Test
	public void ItreatorHasNext_HasNextElement_False() {
		MyArrayList<Integer> list = new MyArrayList<>();
		
		
		MyArrayList<Integer>.MyIterator itrIterator = list.iterator();
		
		assertEquals(itrIterator.hasNext(), false);
	}
	@Test(expected = NoSuchElementException.class)
	public void Itreator_EmptyList_NoSuchElementException() {
		MyArrayList<Integer> list = new MyArrayList<>();
		MyArrayList<Integer>.MyIterator itrIterator = list.iterator();
		itrIterator.next();
	}
	@Test 
	public void testResize_AddElevenElements_ReturnSizeEleven() {
		MyArrayList<Integer> list = new MyArrayList<>();
		for (int i = 1; i < 12; i++) {
			list.add(i);
		}
		assertEquals(11, list.size());
	}
	@Test 
	public void testResize_AddElevenElementsRemoveAll_ReturnSizeZero() {
		MyArrayList<Integer> list = new MyArrayList<>();
		for (int i = 1; i < 21; i++) {
			list.add(i);
		}
		for (int i = 0; i < 20; i++) {
			list.remove(0);
		}
		assertEquals(0, list.size());
	}
}
