package com.learning.ds.educative.dp.fibonacci;

public class NumberFactors {
    public static void main(String[] args) {
        int numOfWays = getFactors(4);
        System.out.println("Num Factors: " + numOfWays);
    }

    private static int getFactors(int number) {
        if (number == 0)
            return 1;
        if (number == 1)
            return 1;
        if (number == 2)
            return 1;
        if (number == 3)
            return 2;

        return getFactors(number - 1) +
                getFactors(number - 3) +
                getFactors(number - 4);
    }
}
