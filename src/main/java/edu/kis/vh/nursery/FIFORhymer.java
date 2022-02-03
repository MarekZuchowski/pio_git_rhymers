package edu.kis.vh.nursery;

import edu.kis.vh.nursery.int_data_structure.IntArrayStack;

public class FIFORhymer extends DefaultCountingOutRhymer {
    private final IntArrayStack temp = new IntArrayStack();

    public FIFORhymer() {
        super();
    }

    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }
}
