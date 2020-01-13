package testtree;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;

import org.junit.Test;

import tree.BST;

public class TestBST {
	@Test
	public void testInsert_AllInRightSide_InOrder() {
		BST<Integer> tree = new BST<Integer>();
		tree.insert(15);
		tree.insert(16);
		tree.insert(17);
		tree.insert(18);
		tree.insert(19);
		tree.insert(20);
		Iterable<Integer> it = tree.inorder();
		Iterator<Integer> iterator = it.iterator();
		Integer i = 15;
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			assertEquals(i, integer);
			i++;
		}
	}

	@Test
	public void testInsert_AllInLeft_InOrder() {
		BST<Integer> tree = new BST<Integer>();
		tree.insert(20);
		tree.insert(19);
		tree.insert(18);
		tree.insert(17);
		tree.insert(16);
		tree.insert(15);
		Iterable<Integer> it = tree.inorder();
		Iterator<Integer> iterator = it.iterator();
		Integer i = 15;
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			assertEquals(i, integer);
			i++;
		}
	}

	@Test
	public void testInsert_LeftAndRight_InOrder() {
		BST<Integer> tree = new BST<Integer>();
		tree.insert(50);
		tree.insert(30);
		tree.insert(60);
		tree.insert(20);
		tree.insert(40);
		tree.insert(100);
		tree.insert(1);
		Iterable<Integer> it = tree.inorder();
		Iterator<Integer> iterator = it.iterator();
		Integer i = 1;
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			assertEquals(i <= integer, true);
			i++;
		}
	}

	@Test
	public void testDelete_AllInRightSide_DeleteTheEndOfBST_InOrder() {
		BST<Integer> tree = new BST<Integer>();
		tree.insert(15);
		tree.insert(16);
		tree.insert(17);
		tree.insert(18);
		tree.insert(19);
		tree.insert(20);
		tree.delete(20);
		Iterable<Integer> it = tree.inorder();
		Iterator<Integer> iterator = it.iterator();
		Integer i = 15;
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			assertEquals(i, integer);
			i++;
		}
	}

	@Test
	public void testDelete_AllInRightSide_DeleteRoot_InOrder() {
		BST<Integer> tree = new BST<Integer>();
		tree.insert(15);
		tree.insert(16);
		tree.insert(17);
		tree.insert(18);
		tree.insert(19);
		tree.insert(20);
		tree.delete(15);
		Iterable<Integer> it = tree.inorder();
		Iterator<Integer> iterator = it.iterator();
		Integer i = 16;
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			assertEquals(i, integer);
			i++;
		}
	}

	@Test
	public void testDelete_AllInRightSide_DeleteMiddleNode_InOrder() {
		BST<Integer> tree = new BST<Integer>();
		tree.insert(15);
		tree.insert(16);
		tree.insert(17);
		tree.insert(18);
		tree.insert(19);
		tree.insert(20);
		tree.delete(17);
		Iterable<Integer> it = tree.inorder();
		Iterator<Integer> iterator = it.iterator();
		Integer i = 15;
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			assertEquals(i, integer);
			i++;
			if (i == 17) {
				i++;
			}
		}
	}

	@Test
	public void testDelete_AllInLeftDeleteEnd_InOrder() {
		BST<Integer> tree = new BST<Integer>();
		tree.insert(15);
		tree.insert(16);
		tree.insert(17);
		tree.insert(18);
		tree.insert(19);
		tree.insert(20);
		tree.delete(15);
		Iterable<Integer> it = tree.inorder();
		Iterator<Integer> iterator = it.iterator();
		Integer i = 16;
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			assertEquals(i, integer);
			i++;
		}
	}

	@Test
	public void testDelete_LeftAndRightDeleteRandom_InOrder() {
		BST<Integer> tree = new BST<Integer>();
		tree.insert(50);
		tree.insert(30);
		tree.insert(60);
		tree.insert(20);
		tree.insert(40);
		tree.insert(100);
		tree.insert(1);
		tree.delete(20);
		Iterable<Integer> it = tree.inorder();
		Iterator<Integer> iterator = it.iterator();
		Integer i = 1;
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			assertEquals(i <= integer, true);
			i++;
		}
	}

	@Test
	public void testPostOrder_AllInRight_ReturnPostOrder() {
		BST<Integer> tree = new BST<Integer>();
		tree.insert(15);
		tree.insert(16);
		tree.insert(17);
		tree.insert(18);
		tree.insert(19);
		tree.insert(20);
		Iterable<Integer> it = tree.postorder();
		Iterator<Integer> iterator = it.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.print(integer + " ");

		}
	}

	@Test
	public void testInsert_AllInLeft_PostOrder() {
		BST<Integer> tree = new BST<Integer>();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(15);
		tree.insert(13);
		tree.insert(12);
		tree.insert(1);
		Iterable<Integer> it = tree.postorder();
		Iterator<Integer> iterator = it.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.print(integer + " ");

		}
	}

	@Test
	public void testInsert_LeftAndRight_PostOrder() {
		BST<Integer> tree = new BST<Integer>();
		tree.insert(50);
		tree.insert(30);
		tree.insert(60);
		tree.insert(20);
		tree.insert(40);
		tree.insert(100);
		tree.insert(1);
		Iterable<Integer> it = tree.postorder();
		Iterator<Integer> iterator = it.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.print(integer + " ");

		}
	}
	@Test
	public void testPostOrder_AllInRight_ReturnPreOrder() {
		BST<Integer> tree = new BST<Integer>();
		tree.insert(15);
		tree.insert(16);
		tree.insert(17);
		tree.insert(18);
		tree.insert(19);
		tree.insert(20);
		Iterable<Integer> it = tree.preorder();
		Iterator<Integer> iterator = it.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.print(integer + " ");

		}
	}

	@Test
	public void testInsert_AllInLeft_PreOrder() {
		BST<Integer> tree = new BST<Integer>();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(15);
		tree.insert(13);
		tree.insert(12);
		tree.insert(1);
		Iterable<Integer> it = tree.preorder();
		Iterator<Integer> iterator = it.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.print(integer + " ");

		}
	}

	@Test
	public void testInsert_LeftAndRight_PreOrder() {
		BST<Integer> tree = new BST<Integer>();
		tree.insert(50);
		tree.insert(30);
		tree.insert(60);
		tree.insert(20);
		tree.insert(40);
		tree.insert(100);
		tree.insert(1);
		Iterable<Integer> it = tree.preorder();
		Iterator<Integer> iterator = it.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.print(integer + " ");

		}
	}
	@Test
	public void testInsert_LeftAndRight_PreOrder_PostOrder_Inorder() {
		BST<Integer> tree = new BST<Integer>();
		tree.insert(50);
		tree.insert(30);
		tree.insert(60);
		tree.insert(20);
		tree.insert(40);
		tree.insert(100);
		tree.insert(1);
		Iterable<Integer> it = tree.preorder();
		Iterator<Integer> iterator = it.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.print(integer + " ");

		}
		System.out.println();
		it = tree.postorder();
		iterator = it.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.print(integer + " ");

		}
		System.out.println();
		it = tree.inorder();
		iterator = it.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.print(integer + " ");

		}
	}
	@Test
	public void testInsert_EmptyBST_PreOrder_PostOrder_InOrder() {
		BST<Integer> tree = new BST<Integer>();
		Iterable<Integer> it = tree.preorder();
		Iterator<Integer> iterator = it.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.print(integer + " ");

		}
		System.out.println();
		it = tree.postorder();
		iterator = it.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.print(integer + " ");

		}
		System.out.println();
		it = tree.inorder();
		iterator = it.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.print(integer + " ");

		}
	}


}
