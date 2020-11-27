package com.learning.ds.educative.dp.lcs_2;

public class P8_LongestBitonicSubSequence {
    public static void main(String[] args) {
        int[] inArray = {4, 2, 5, 9, 7, 6, 10, 3, 1};
        int max = 0;
        for (int i = 0; i < inArray.length; i++) {
            int fwdCount = findLISFwd(inArray, i, -1);
            int backCount = findLISBack(inArray, inArray.length - i - 1, -1);
            System.out.println(String.format("%d, %d", fwdCount, backCount));
            max = Math.max(max, backCount + fwdCount - 1);
        }
        System.out.println("Max is: " + max);
    }

    private static int findLISFwd(int[] inArray, int currIndex, int prevIndex) {
        if(currIndex >= inArray.length)
            return 0;

        if(prevIndex == -1 || inArray[currIndex] > inArray[prevIndex]) {
            int including  = 1 + findLISFwd(inArray, currIndex + 1, currIndex);
            int excluding = findLISFwd(inArray, currIndex + 1, prevIndex);
            return Math.max(including, excluding);
        }

        return findLISFwd(inArray, currIndex + 1, prevIndex);
    }

    private static int findLISBack(int[] inArray, int currIndex, int prevIndex) {
        if(currIndex < 0)
            return 0;

        if(prevIndex == -1 || inArray[currIndex] > inArray[prevIndex]) {
            int including  = 1 + findLISBack(inArray, currIndex - 1, currIndex);
            int excluding = findLISBack(inArray, currIndex - 1, prevIndex);
            return Math.max(including, excluding);
        }

        return findLISBack(inArray, currIndex - 1, prevIndex);
    }
}
