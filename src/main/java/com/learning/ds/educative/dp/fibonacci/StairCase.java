package com.learning.ds.educative.dp.fibonacci;

public class StairCase {
    public static void main(String[] args) {
        int numOfWays = findWays(4);
        System.out.println("Num of ways: " + numOfWays);
    }

    private static int findWays(int numOfStairs) {
        if (numOfStairs == 0)
            return 1;
        if (numOfStairs == 1)
            return 1;
        if (numOfStairs == 2)
            return 2;

        return findWays(numOfStairs - 1) + findWays(numOfStairs - 2) + findWays(numOfStairs - 3);
    }
}
