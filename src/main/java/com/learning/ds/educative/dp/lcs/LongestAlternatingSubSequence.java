package com.learning.ds.educative.dp.lcs;

public class LongestAlternatingSubSequence {
    public static void main(String[] args) {
        int[] inSeq = {3, 2, 1, 4};

        int las = findLAS(inSeq, 0, -1, true);
        System.out.println("LAS is: " + las);
    }

    private static int findLAS(int[] inSeq, int currIndex, int prevIndex, boolean isAsc) {
        if (currIndex == inSeq.length)
            return 0;

        int matchCount = 0;
        if (isAsc) {
            if (prevIndex == -1 || inSeq[currIndex] > inSeq[prevIndex]) {
                int including = 1 + findLAS(inSeq, currIndex + 1, currIndex, !isAsc);
                int excluding = findLAS(inSeq, currIndex + 1, currIndex, !isAsc);
                matchCount = Math.max(including, excluding);
            }
        } else {
            if (prevIndex == -1 || inSeq[currIndex] < inSeq[prevIndex]) {
                int including = 1 + findLAS(inSeq, currIndex + 1, currIndex, !isAsc);
                int excluding = findLAS(inSeq, currIndex + 1, currIndex, !isAsc);
                matchCount = Math.max(including, excluding);
            }
        }

        int noMatchCount = findLAS(inSeq, currIndex + 1, prevIndex, isAsc);
        return Math.max(matchCount, noMatchCount);
    }
}
