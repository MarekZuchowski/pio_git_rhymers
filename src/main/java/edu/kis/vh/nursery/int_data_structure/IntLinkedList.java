package edu.kis.vh.nursery.int_data_structure;

/**
 * The IntLinkedList class implements a linked list of integers
 */
public class IntLinkedList implements IntDataStructure {

	private Node last;
	private int i = 0;

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
		this.i++;
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
	@Override
	public int top() {
		if (isEmpty())
			return ERROR_VALUE;
		return last.getValue();
	}

	/**
	 * Pops  the last element off the list
	 */
	public int pop() {
		if (isEmpty())
			return ERROR_VALUE;
		int ret = last.getValue();
		last = last.getPrev();
		i--;
		return ret;
	}

	@Override
	public int getTotal() {
		return i;
	}

}
