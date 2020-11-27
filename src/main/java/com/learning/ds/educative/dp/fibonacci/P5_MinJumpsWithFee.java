package com.learning.ds.educative.dp.fibonacci;

public class P5_MinJumpsWithFee {
    public static void main(String[] args) {
        int[] fees = {1,2,5,2,1,2};
        int minJumps = getMinJumps(0, fees);
        System.out.println("Min Jumps: " + minJumps);
    }

    private static int getMinJumps(int currIndex, int[] fees) {
        if(currIndex >= fees.length)
            return 0;

        int step1 = getMinJumps(currIndex + 1, fees);
        int step2 = getMinJumps(currIndex + 2, fees);
        int step3 = getMinJumps(currIndex + 3, fees);
        return fees[currIndex] + Math.min(step1, Math.min(step2, step3));
    }
}
