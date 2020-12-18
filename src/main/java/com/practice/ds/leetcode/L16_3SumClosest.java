package com.practice.ds.leetcode;

//https://www.programcreek.com/2013/02/leetcode-3sum-closest-java/

import java.util.Arrays;

public class L16_3SumClosest {
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        int result = find3SumClosest(nums, 1);
        System.out.println(result);
    }

    private static int find3SumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int minDiff = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++) {
            int low = i + 1;
            int high = nums.length - 1;
            while (low < high) {
                int tempSum = nums[i] + nums[low] + nums[high];
                minDiff = Math.min(minDiff, Math.abs(tempSum - target));
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

        return minDiff;
    }
}
