package com.practice.ds.leetcode;

import java.util.Arrays;

public class L26_RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0,1,1,1,2,2,3,3,4,4};
        removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void removeDuplicates(int nums[]) {
        int counter = 0;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]) {
                nums[++counter] = nums[i];
            }
        }
        System.out.println(counter);
    }
}
