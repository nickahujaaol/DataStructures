package com.practice.ds.leetcode;

import java.util.Arrays;

public class L66_PlusOne {
    public static void main(String[] args) {
        int nums[] = {1,2,9};
        nums = addOne(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static int[] addOne(int[] nums) {

        int carryOver = 1;
        for(int i = nums.length - 1; i >=0; i--) {
            int tempNum = nums[i] + carryOver;
            nums[i] = tempNum % 10;
            carryOver = tempNum / 10;
        }
        return nums;
    }
}
