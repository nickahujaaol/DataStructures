package com.finalprep.recursionpractice;

public class L55 {
    public static void main(String[] args) {
        int[] jumps = {3,2,1,0,4};
        boolean canReach = canReach(jumps, 0);
        System.out.println(canReach);
    }

    private static boolean canReach(int[] jumps, int index) {
        if(index >= jumps.length)
            return true;

        if(jumps[index] == 0)
            return false;

        int end = index + jumps[index] <= jumps.length ? index + jumps[index] : jumps.length;
        for(int i = index; i < end; i++) {
            return canReach(jumps, i + 1);
        }

        return false;
    }
}
