package com.learning.ds.educative.patterns.twopointers;

import java.util.Arrays;

public class P3_SquaringASortedArray {
    public static void main(String[] args) {
        int[] inArray = {-2,-1,1,2,3};
        int[] squares = squareAndSort(inArray);
        System.out.println(Arrays.toString(squares));
    }

    private static int[] squareAndSort(int[] inArray) {
        int largestIndex = inArray.length - 1;
        int left = 0;
        int right = inArray.length - 1;
        int[] squares = new int[inArray.length];

        while (left <= right) {
            int leftSquare = inArray[left] * inArray[left];
            int rightSquare = inArray[right] * inArray[right];
            if(leftSquare <= rightSquare) {
                squares[largestIndex--] = rightSquare;
                right--;
            } else {
                squares[largestIndex--] = leftSquare;
                left++;
            }
        }

        return squares;
    }
}
