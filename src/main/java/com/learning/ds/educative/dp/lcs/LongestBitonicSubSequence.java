package com.learning.ds.educative.dp.lcs;

public class LongestBitonicSubSequence {
    public static void main(String[] args) {
        int[] inArray = {4, 2, 5, 9, 7, 6, 10, 3, 1};
        int max = 0;
        for (int i = 0; i < inArray.length; i++) {
            int backCount = findLISBackward(inArray, i, -1);
            int fwdCount = findLISForward(inArray, i, -1);
            System.out.println(String.format("%d, %d", backCount, fwdCount));
            max = Math.max(max, backCount + fwdCount - 1);
        }
        System.out.println("Max is: " + max);
    }

    private static int findLISBackward(int[] inArray, int currIndex, int prevIndex) {
        if (currIndex < 0)
            return 0;

        if (prevIndex == -1 || inArray[currIndex] < inArray[prevIndex]) {
            int includingCount = 1 + findLISBackward(inArray, currIndex - 1, currIndex);
            int excludingCount = findLISBackward(inArray, currIndex - 1, prevIndex);
            return Math.max(includingCount, excludingCount);
        }
        return findLISBackward(inArray, currIndex - 1, prevIndex);
    }

    private static int findLISForward(int[] inArray, int currIndex, int prevIndex) {
        if (currIndex == inArray.length)
            return 0;

        if (prevIndex == -1 || inArray[currIndex] < inArray[prevIndex]) {
            int includingCount = 1 + findLISForward(inArray, currIndex + 1, currIndex);
            int excludingCount = findLISForward(inArray, currIndex + 1, prevIndex);
            return Math.max(includingCount, excludingCount);
        }
        return findLISForward(inArray, currIndex + 1, prevIndex);
    }
}
