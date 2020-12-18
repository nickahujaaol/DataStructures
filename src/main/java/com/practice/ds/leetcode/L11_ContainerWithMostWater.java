package com.practice.ds.leetcode;

public class L11_ContainerWithMostWater {
    public static void main(String[] args) {
        int heights[] = {1,8,6,2,5,4,8,3,7};
        int maxCapacity = maxCapacity(heights);
        System.out.println(maxCapacity);
    }

    private static int maxCapacity(int[] heights) {
        int fwdCounter = 0;
        int backCounter = heights.length - 1;
        int max = 0;
        while (fwdCounter <= backCounter) {
            int capacity = Math.min(heights[fwdCounter], heights[backCounter]) * (backCounter - fwdCounter);
            max = Math.max(max, capacity);
            if(heights[fwdCounter] < heights[backCounter])
                fwdCounter++;
            else
                backCounter--;
        }
        return max;
    }
}
