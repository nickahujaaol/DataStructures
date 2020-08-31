package com.learning.ds.educative.dp.unbounded;

public class MaxRibbonCut {
    public static void main(String[] args) {
        int[] lengths = {2, 3};
        int length = 7;
        int maxNum = findMax(lengths, length, lengths.length - 1);
        System.out.println("Max Num: " + maxNum);
    }

    private static int findMax(int[] lengths, int length, int index) {
        if (length == 0)
            return 0;
        if (index < 0)
            return Integer.MIN_VALUE;

        if (lengths[index] <= length) {
            int tempLength = Integer.MIN_VALUE;
            int includingLength = findMax(lengths, length - lengths[index], index);
            if (includingLength != Integer.MIN_VALUE)
                tempLength = 1 + includingLength;

            int excludingLength = findMax(lengths, length, index - 1);

            return Math.max(tempLength, excludingLength);
        } else {
            return findMax(lengths, length, index - 1);
        }
    }
}
