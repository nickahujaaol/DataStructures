package com.learning.ds.educative.dp.lcs;

public class MaxSunIncreasingSubSequence {
    public static void main(String[] args) {
        int[] inArray = {4, 1, 2, 6, 10, 1, 12};
        int maxSeq = findIncSubSeq(inArray, 0, -1);
        System.out.println("Max LIS is: " + maxSeq);
    }

    private static int findIncSubSeq(int[] inArray, int currIndex, int prevIndex) {
        if (currIndex >= inArray.length)
            return 0;

        if (prevIndex == -1 || inArray[currIndex] > inArray[prevIndex]) {
            int includingCurr = inArray[currIndex] + findIncSubSeq(inArray, currIndex + 1, currIndex);
            int excludingCurr = findIncSubSeq(inArray, currIndex + 1, prevIndex);
            return Math.max(includingCurr, excludingCurr);
        }
        return findIncSubSeq(inArray, currIndex + 1, prevIndex);
    }
}
