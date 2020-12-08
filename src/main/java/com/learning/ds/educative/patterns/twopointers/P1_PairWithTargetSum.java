package com.learning.ds.educative.patterns.twopointers;

public class P1_PairWithTargetSum {
    public static void main(String[] args) {
        int[] inArray = {1,2,3,4,6};
        int targetSum = 6;
        findIndexes(inArray, targetSum);
    }

    private static void findIndexes(int[] inArray, int targetSum) {
        int fwdPointer = 0;
        int backPointer = inArray.length - 1;

        while (fwdPointer < backPointer) {
            if(inArray[fwdPointer] + inArray[backPointer] == targetSum){
                System.out.println(fwdPointer + ", " + backPointer);
                break;
            } else if(inArray[fwdPointer] + inArray[backPointer] < targetSum) {
                fwdPointer++;
            } else {
                backPointer--;
            }
        }
    }
}
