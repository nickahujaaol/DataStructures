package com.learning.ds.educative.dp.fibonacci;

public class P4_MinJumpsToReachEnd {
    public static void main(String[] args) {
        int[] jumps = {1,1,3,6,9,3,0,1,3};
        int numOfJumps = getMinJumps(jumps, 0);
        System.out.println("Min Jumps: " + numOfJumps);
    }

    private static int getMinJumps(int[] jumpsArray, int currIndex) {
        if(currIndex >= jumpsArray.length - 1)
            return 0;

        if (jumpsArray[currIndex] == 0)
            return Integer.MAX_VALUE;

        int minJumps = Integer.MAX_VALUE;
        int endIndex = Math.min(currIndex + jumpsArray[currIndex], jumpsArray.length);
        for (int i = currIndex; i < endIndex; i++) {
            int tempMin = getMinJumps(jumpsArray, i + 1);
            if (tempMin != Integer.MAX_VALUE) {
                minJumps = Math.min(minJumps, tempMin + 1);
            }
        }

        return minJumps;
    }
}
