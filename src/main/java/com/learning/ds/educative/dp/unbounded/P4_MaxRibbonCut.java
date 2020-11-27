package com.learning.ds.educative.dp.unbounded;

public class P4_MaxRibbonCut {
    public static void main(String[] args) {
        int[] lengths = {3,2};
        int length = 7;
        int maxNum = findMax(lengths, length, lengths.length - 1);
        System.out.println("Max Num: " + maxNum);
    }

    private static int findMax(int[] lengths, int targetLength, int index) {
        if(index < 0)
            return Integer.MIN_VALUE;
        if(targetLength == 0)
            return 0;

        if(targetLength - lengths[index] >= 0) {
            int leftCount = findMax(lengths, targetLength - lengths[index], index);
            if(leftCount != Integer.MIN_VALUE)
                leftCount = leftCount + 1;
            int rightCount = findMax(lengths, targetLength, index - 1);
            return Math.max(leftCount, rightCount);
        } else {
            return findMax(lengths, targetLength, index - 1);
        }
    }
}
