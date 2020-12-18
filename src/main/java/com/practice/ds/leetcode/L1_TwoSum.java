package com.practice.ds.leetcode;

public class L1_TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,8,7,9,11,12,13,14,15};
        int target = 9;

        for(int i = 0; i< nums.length; i++) {
            int numToFind = target - nums[i];
            int foundNum = find(nums, i, nums.length - 1, numToFind);
            if(foundNum != -1)
                System.out.println(foundNum);
        }
    }

    private static int find(int[] nums, int low, int high, int target) {
        if(low > high)
            return -1;

        int mid = (low + high) / 2;
        if(nums[mid] == target)
            return nums[mid];
        if(nums[mid] < target) {
            return find(nums, low, mid - 1, target);
        } else {
            return find(nums, mid + 1, high, target);
        }
    }
}
