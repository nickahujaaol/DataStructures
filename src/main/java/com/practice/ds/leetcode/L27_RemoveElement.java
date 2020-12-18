package com.practice.ds.leetcode;

import java.util.Arrays;

public class L27_RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        removeElements(nums, 2);
        System.out.println(Arrays.toString(nums));
    }

    private static void removeElements(int[] nums, int target) {
        int counter = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != target) {
                nums[counter++] = nums[i];
            }
        }

        System.out.println(counter);
    }
}
