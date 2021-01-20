package com.finalprep.recursion;

public class L55_JumpGame {
    static int minJumps = Integer.MAX_VALUE;

    public static void main(String[] args) {
        int[] data = {2,1,3,1,4};
        findJumps(data, 0, 0);
        System.out.println(minJumps);
    }

    private static void findJumps(int[] data, int index, int jumpsSoFar) {
        if(index >= data.length - 1) {
            minJumps = Math.min(minJumps, jumpsSoFar);
            return;
        }

        if (data[index] == 0) {
            minJumps = Integer.MAX_VALUE;
            return;
        }

        int endIndex = Math.min(index + data[index], data.length);
        for(int i = index; i < endIndex; i++) {
            findJumps(data, i + 1, jumpsSoFar + 1);
        }
    }
}
