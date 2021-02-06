package com.learning.ds.udacity.recursion;

/*
Problem Statement
Suppose there is a staircase that you can climb in either 1 step, 2 steps, or 3 steps.
 In how many possible ways can you climb the staircase if the staircase has n steps? Write a recursive function to solve the problem.

Example:

n == 1 then answer = 1

n == 3 then answer = 4
The output is 4 because there are four ways we can climb the staircase:

1 step + 1 step + 1 step
1 step + 2 steps
2 steps + 1 step
3 steps
n == 5 then answer = 13
 */
public class StairCase {
    public static void main(String[] args) {
        System.out.println(getNumOfWays(4));
    }

    private static int getNumOfWays(int numOfSteps) {
        if (numOfSteps <= 0) return 1;
        if (numOfSteps == 1) return 1;
        if (numOfSteps == 2) return 2;
        if (numOfSteps == 3) return 4;

        else return getNumOfWays(numOfSteps - 1) +
                getNumOfWays(numOfSteps - 2) +
                getNumOfWays(numOfSteps - 3);
    }
}
