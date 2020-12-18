package com.practice.ds.leetcode;

import java.util.Arrays;

public class L46_Permutations {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        permutate(nums, 0);
    }

    private static void permutate(int[] nums, int index) {
        if(index == nums.length - 1)
            System.out.println(Arrays.toString(nums));
        for(int i = index; i < nums.length; i++) {
            swap(nums, i, index);
            permutate(nums, index + 1);
            swap(nums, i, index);
        }

    }

    private static void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
