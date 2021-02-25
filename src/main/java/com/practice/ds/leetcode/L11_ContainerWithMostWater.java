package com.practice.ds.leetcode;

public class L11_ContainerWithMostWater {
    public static void main(String[] args) {
        int heights[] = {1,8,6,2,5,4,8,3,7};
        int maxCapacity = maxCapacity(heights);
        System.out.println(maxCapacity);
    }

    private static int maxCapacity(int[] heights) {
        int start = 0;
        int end = heights.length - 1;
        int maxCapacity = Integer.MIN_VALUE;

        while (start < end) {
            int tempCapacity = Math.min(heights[start], heights[end]) * (end - start);
            if(heights[start] < heights[end]) {
                start++;
            } else
                end--;
            maxCapacity = Math.max(maxCapacity, tempCapacity);
        }
        return maxCapacity;
    }
}
