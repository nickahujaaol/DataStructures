package com.learning.ds.educative.dp.fibonacci;

public class MinJumpsWithFee {
    public static void main(String[] args) {
        int[] fees = {1, 2, 5, 2, 1, 2};
        int minFee = getMinFee(fees, 0);
        System.out.println("Min Fees: " + minFee);
    }

    private static int getMinFee(int[] fees, int index) {
        if (index >= fees.length)
            return 0;

        int step1 = fees[index] + getMinFee(fees, index + 1);
        int step2 = fees[index] + getMinFee(fees, index + 2);
        int step3 = fees[index] + getMinFee(fees, index + 3);

        return Math.min(Math.min(step1, step2), step3);
    }
}
