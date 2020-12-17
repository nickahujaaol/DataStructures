package com.template.ds.leetcode;
import java.util.Arrays;

public class L31_NextPermutation {
    public static void main(String[] args) {
        int nums[] = {4, 5, 6, 3, 2, 1};
        findNextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void findNextPermutation(int[] nums) {

    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
