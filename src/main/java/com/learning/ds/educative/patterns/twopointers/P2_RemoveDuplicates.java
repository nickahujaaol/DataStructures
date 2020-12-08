package com.learning.ds.educative.patterns.twopointers;

import java.util.Arrays;

public class P2_RemoveDuplicates {
    public static void main(String[] args) {
        int[] inArray = {2,3,3,3,6,9,9};
        int length = remove(inArray);
        System.out.println("Length is: " + length);
    }

    private static int remove(int[] inArray) {
        int currPointer = 0;

        for(int i = 1; i < inArray.length; i++) {
            if(inArray[currPointer] != inArray[i]){
                inArray[++currPointer] = inArray[i];
            }
        }
        System.out.println(Arrays.toString(inArray));
        return currPointer;
    }
}
