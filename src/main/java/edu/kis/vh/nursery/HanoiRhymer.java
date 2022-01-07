package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {
    private static final int zero = 0;
    int totalRejected = zero;

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
