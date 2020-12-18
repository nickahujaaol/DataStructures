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
            int low = i + 1;
            int high = nums.length - 1;
            while (low < high) {
                int tempSum = nums[i] + nums[low] + nums[high];
                if(tempSum < 0) {
                    low++;
                } else if(tempSum > 0) {
                    high--;
                } else {
                    System.out.println(nums[i] + ", " + nums[low] + ", " + nums[high]);
                    break;
                }
            }
        }
    }
}
