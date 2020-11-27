package com.learning.ds.educative.dp.archived_2.fibonacci;

public class MinJumpsToReachEnd {
    public static void main(String[] args) {
        int[] jumps = {1, 1, 3, 6, 9, 3, 0, 1, 3};
        int minJumps = findMin(jumps, 0);
        System.out.println("Min Jumps: " + minJumps);
    }

    private static int findMin(int jumps[], int index) {
        if (index >= jumps.length - 1)
            return 0;

        if (jumps[index] == 0)
            return Integer.MAX_VALUE;

        int minJumps = Integer.MAX_VALUE;
        int start = index;
        int end = index + jumps[index];
        for (int i = start; i < end; i++) {
            int tempJumps = findMin(jumps, i + 1);
            if (tempJumps != Integer.MAX_VALUE) {
                minJumps = Math.min(minJumps, tempJumps + 1);
            }
        }

        return minJumps;
    }
}
