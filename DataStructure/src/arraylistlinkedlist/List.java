package arraylistlinkedlist;

public interface List<E> {

	// Appends the specified element to the end of this list
	void add(E e);

	// Inserts the specified element at the specified position in this list
	void add(int index, E element);

	// Returns true if this list contains the specified element.
	boolean contains(Object o);

	// Returns the element at the specified position in this list.
	E get(int index);

	// Returns the index of the first occurrence of the specified element in this
	// list, or -1 if this list does not contain the element.
	int indexOf(Object o);

	// Returns true if this list contains no elements.
	boolean isEmpty();

	// Removes the element at the specified position in this list
	E remove(int index);

	// Removes the first occurrence of the specified element from this list, if it is present
	boolean remove(Object o);

	// Replaces the element at the specified position in this list with the specified element
	E set(int index, E element);

	// Returns the number of elements in this list.
	int size();

}
