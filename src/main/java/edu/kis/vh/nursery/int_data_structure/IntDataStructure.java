package edu.kis.vh.nursery.int_data_structure;

public interface IntDataStructure {
    public static final int ERROR_VALUE = 0;

    public int pop();
    public int top();
    public boolean isEmpty();
    public boolean isFull();
    public void push(int i);
    public int getTotal();
}
