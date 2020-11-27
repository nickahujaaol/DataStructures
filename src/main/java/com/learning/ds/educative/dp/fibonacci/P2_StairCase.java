package com.learning.ds.educative.dp.fibonacci;

public class P2_StairCase {
    public static void main(String[] args) {
        int numOfWays = getWays(3);
        System.out.println("NUm of Ways are: " + numOfWays);
    }

    private static int getWays(int numOfStairs) {
        if(numOfStairs == 0)
            return 1;
        if(numOfStairs == 1)
            return 1;
        if(numOfStairs == 2)
            return 2;

        return getWays(numOfStairs - 1) +
                getWays(numOfStairs - 2) +
                getWays(numOfStairs - 3);
    }
}
