package com.practice.ds.leetcode;

import java.util.Arrays;

public class L15_3Sum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        find3Sum(nums);
    }

    private static void find3Sum(int[] nums) {
        Arrays.sort(nums);
    }
}
