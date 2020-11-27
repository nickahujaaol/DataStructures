package com.learning.ds.educative.dp.fibonacci;

public class P3_NumberFactors {
    public static void main(String[] args) {
        int numOfWays = getWays(4);
        System.out.println("Number of Ways: " + numOfWays);
    }

    private static int getWays(int num) {
        if(num == 0)
            return 1;
        if(num == 1)
            return 1;
        if(num == 2)
            return 1;
        if(num == 3)
            return 2;

        return getWays(num - 1) +
                getWays(num - 3) +
                getWays(num - 4);
    }
}
