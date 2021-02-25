package com.practice.ds.leetcode;

public class L1_TwoSum {
    public static void main(String[] args) {
        int[] nums = {0, 2,3,4,5,6,8,7,9,11,12,13,14,15};
        int target = 9;
        find(nums, target);
    }

    private static void find(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int tempSum = nums[start] + nums[end];
            if(tempSum == target){
                System.out.println(nums[start] + ", " + nums[end]);
                break;
            } else {
                if(tempSum > target)
                    end--;
                else
                    start++;
            }
        }
    }
}
