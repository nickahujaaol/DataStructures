package com.practice.ds.leetcode;

import java.util.Arrays;

public class L15_3Sum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        find3Sum(nums);
    }

    private static void find3Sum(int[] nums) {
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++) {
            int start = i + 1;
            int end = nums.length - 1;

            while (start < end) {
                int tempSum = nums[start] + nums[end] + nums[i];
                if(tempSum == 0) {
                    System.out.println(nums[start] + ", " + nums[end] + ", " + nums[i]);
                }

                if(tempSum < 0)
                    start++;
                else
                    end--;
            }
        }
    }
}
