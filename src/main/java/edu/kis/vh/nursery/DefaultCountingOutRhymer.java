package edu.kis.vh.nursery;

import edu.kis.vh.nursery.int_data_structure.IntArrayStack;
import edu.kis.vh.nursery.int_data_structure.IntDataStructure;

public class DefaultCountingOutRhymer {
    IntDataStructure intArrayStack = null;

    public DefaultCountingOutRhymer() {
        intArrayStack = new IntArrayStack();
    }

    public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
        this.intArrayStack = intArrayStack;
    }

    public int getTotal() {
        return intArrayStack.getTotal();
    }

    public void countIn(int in) {
        intArrayStack.push(in);
    }

    public boolean callCheck() {
        return intArrayStack.isEmpty();
    }

    public boolean isFull() {
        return intArrayStack.isFull();
    }

    public int peekaboo() {
        return intArrayStack.top();
    }

    public int countOut() {
        return intArrayStack.pop();
    }
}
