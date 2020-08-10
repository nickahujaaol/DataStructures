package com.learning.ds.educative.dp.archived.fibonacci;

import java.util.Arrays;

// https://www.techiedelight.com/find-minimum-jumps-required-reach-destination/
// https://medium.com/swlh/dynamic-programming-minimum-jumps-from-start-finish-b2943afe4a72
public class MinJumpsToReachEnd {
    public static void main(String[] args) {
        int[] jumpsArray = {2,3,1,1,4};
        int[] minArray = new int[jumpsArray.length];
        int minJumps = getMinRecursive(jumpsArray, 0);
        System.out.println("Min Jumps: " + minJumps);
        minJumps = getMinBottomUp(jumpsArray);
        System.out.println("Min Jumps: " + minJumps);


        jumpsArray = new int[]{1,1,3,6,9,3,0,1,3};
        minJumps = getMinBottomUp(jumpsArray);
        System.out.println("Min Jumps: " + minJumps);
    }

    private static int getMinBottomUp(int[] jumpsArray) {
        int[] dp = new int[jumpsArray.length];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for(int i = 1; i < jumpsArray.length; i++) {
            for(int j = 0; j < i; j++) {
                if((i - j) <= jumpsArray[j]) {
                    if(dp[i] == Integer.MAX_VALUE) {
                        dp[i] = dp[j] + 1;
                    } else {
                        dp[i] = Math.min(dp[i], dp[j] + 1);
                    }
                }
            }
        }

        System.out.println(Arrays.toString(dp));
        return dp[jumpsArray.length - 1];
    }

    private static int getMinRecursive(int[] jumpsArray, int currIndex) {
        if(currIndex == jumpsArray.length - 1)
            return 0;

        if(jumpsArray[currIndex] == 0)
            return Integer.MAX_VALUE;

        int minJumps = Integer.MAX_VALUE;
        int endIndex = Math.min(currIndex + jumpsArray[currIndex], jumpsArray.length);
        for(int i = currIndex; i < endIndex; i++) {
            int tempMin = getMinRecursive(jumpsArray, i + 1);
            if(tempMin != Integer.MAX_VALUE) {
                minJumps = Math.min(minJumps, tempMin + 1);
            }
        }

        return minJumps;
    }
}
