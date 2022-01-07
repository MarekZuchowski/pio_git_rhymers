package edu.kis.vh.nursery.list;

/**
 * The IntLinkedList class implements a linked list of integers
 */
public class IntLinkedList {

	private Node last;
	private int i;

	/**
	 * Pushes an element onto the list
	 * @param i value to be pushed
	 */
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	/**
	 * Returns true if the list contains no element
	 */
	public boolean isEmpty() {
		return last == null;
	}

	/**
	 * Returns true if the list is full
	 */
	public boolean isFull() {
		return false;
	}

	/**
	 * Returns the value of the element at the end of the list
	 */
	public int top() {
		if (isEmpty())
			return -1;
		return last.getValue();
	}

	/**
	 * Pops  the last element off the list
	 */
	public int pop() {
		if (isEmpty())
			return -1;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

}
