package com.learning.ds.educative.dp.lcs_2;

public class P9_LongestAlternatingSubSequence {
    public static void main(String[] args) {
        int[] inSeq = {3, 2, 1, 4};

        int las = findLAS(inSeq, 0, -1, true);
        System.out.println("LAS is: " + las);
    }

    private static int findLAS(int[] inSeq, int currIndex, int prevIndex, boolean isAsc) {
        if(currIndex >= inSeq.length)
            return 0;

        if(prevIndex == -1 || inSeq[currIndex] > inSeq[prevIndex] && isAsc) {
            int including = 1 + findLAS(inSeq, currIndex + 1, currIndex, !isAsc);
            int excluding = findLAS(inSeq, currIndex + 1, prevIndex, !isAsc);
            return Math.max(including, excluding);
        }

        if(prevIndex == -1 || inSeq[currIndex] < inSeq[prevIndex] && !isAsc) {
            int including = 1 + findLAS(inSeq, currIndex + 1, currIndex, !isAsc);
            int excluding = findLAS(inSeq, currIndex + 1, prevIndex, !isAsc);
            return Math.max(including, excluding);
        }

        return findLAS(inSeq, currIndex + 1, prevIndex, isAsc);
    }
}
