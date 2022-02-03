package edu.kis.vh.nursery.int_data_structure;

public class IntArrayStack implements IntDataStructure {
    private static final int CAPACITY = 12;
    private final int[] numbers = new int[CAPACITY];
    private int total = -1;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == -1;
    }

    @Override
    public boolean isFull() {
        return total == CAPACITY - 1;
    }


    public int peekaboo() {
        if (callCheck())
            return ERROR_VALUE;
        return numbers[total];
    }


    public int countOut() {
        if (callCheck())
            return ERROR_VALUE;
        return numbers[total--];
    }

    @Override
    public int pop() {
        return countOut();
    }

    @Override
    public int top() {
        return peekaboo();
    }

    @Override
    public void push(int in) {
        countIn(in);
    }

    @Override
    public boolean isEmpty() {
        return callCheck();
    }
}
