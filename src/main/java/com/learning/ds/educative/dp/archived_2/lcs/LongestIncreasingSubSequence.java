package com.learning.ds.educative.dp.archived_2.lcs;

public class LongestIncreasingSubSequence {
    public static void main(String[] args) {
        int[] inArray = {4, 2, 3, 6, 10, 1, 12};
        int maxSeq = findLISRecursive(inArray, 0, -1);
        System.out.println("Max LIS is: " + maxSeq);
    }

    private static int findLISRecursive(int[] inArray, int currentIndex, int prevIndex) {
        if (currentIndex >= inArray.length)
            return 0;

        if (prevIndex == -1 || inArray[currentIndex] > inArray[prevIndex]) {
            int includingCurrent = 1 + findLISRecursive(inArray, currentIndex + 1, currentIndex);
            int excludingCurrent = findLISRecursive(inArray, currentIndex + 1, prevIndex);
            return Math.max(includingCurrent, excludingCurrent);
        }
        return findLISRecursive(inArray, currentIndex + 1, prevIndex);
    }
}
