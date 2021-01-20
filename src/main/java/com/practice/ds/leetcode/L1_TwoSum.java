package com.practice.ds.leetcode;

public class L1_TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,8,7,9,11,12,13,14,15};
        int target = 20;
        find(nums, target);
    }

    private static void find(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int tempSum = nums[low] + nums[high];
            if(tempSum == target) {
                System.out.println(low + ", " + high);
                return;
            }

            if(tempSum < target) {
                low++;
            }
            if (tempSum > target)
                high--;
        }
    }
}
