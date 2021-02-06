package com.finalprep.recursion;

import java.util.Arrays;

public class L46_Permutations {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        permutate(nums, 0);
    }

    private static void permutate(int[] nums, int index) {
        if(index >= nums.length) {
            System.out.println(Arrays.toString(nums));
            return;
        }

        for(int i = index; i < nums.length; i++) {
            swap(nums, i, index);
            permutate(nums, index + 1);
            swap(nums, i, index);
        }
    }

    private static void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}
