package com.finalprep.recursionpractice;

import java.util.Arrays;

public class L46 {
    public static void main(String[] args) {
        int[] inArray = {1,2,3};
        findCombinations(inArray, 0);
    }

    private static void findCombinations(int[] inArray, int index) {
        if(index > inArray.length)
            return;

        if(index == inArray.length)
            System.out.println(Arrays.toString(inArray));

        for(int i = index; i < inArray.length; i++) {
            swap(inArray, i, index);
            findCombinations(inArray, index + 1);
            swap(inArray, i, index);
        }
    }

    private static void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}
