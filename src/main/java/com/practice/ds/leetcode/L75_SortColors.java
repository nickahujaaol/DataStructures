package com.practice.ds.leetcode;

import java.util.Arrays;

public class L75_SortColors {
    public static void main(String[] args) {
        int[] nums = {1,2,0,2,1,1,0,0,0,1,0,1,2,2};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void sort(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid < high) {
            if(nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if(nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }
    }

    private static void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}
