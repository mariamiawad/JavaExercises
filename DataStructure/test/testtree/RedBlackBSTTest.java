package testtree;

import static org.junit.Assert.*;

import org.junit.Test;

import tree.RedBlackBST;

public class RedBlackBSTTest {

	@Test
	public void testSearch_Found() {
		RedBlackBST<String> tree = new RedBlackBST<>();
		tree.insert("A");
		assertNotEquals(null, tree.search("A"));
	}
	@Test
	public void testSearch_NotFound() {
		RedBlackBST<String> tree = new RedBlackBST<>();
		tree.insert("A");
		assertEquals(null, tree.search("B"));
	}
	@Test
	public void testInsert_ReturnFound() {
		RedBlackBST<Character> tree = new RedBlackBST<Character>();
		tree.insert('c');
		tree.insert('i');
		tree.insert('v');
		tree.insert('m');
	}

}
