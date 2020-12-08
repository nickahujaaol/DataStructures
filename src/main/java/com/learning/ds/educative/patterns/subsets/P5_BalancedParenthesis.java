package com.learning.ds.educative.patterns.subsets;

/**
 * Use DP recursion logic here.
 */
public class P5_BalancedParenthesis {
    public static void main(String[] args) {
        generate("", 3, 0, 0);
    }

    private static void generate(String resultsStr, int number, int openCounter, int closedCounter) {
        if(openCounter == number && closedCounter == number) {
            System.out.println(resultsStr);
            return;
        }

        if(openCounter < number)
            generate(resultsStr + '(', number, openCounter + 1, closedCounter);

        if(openCounter - closedCounter > 0) // Add the "C" bracket only if there is an open bracket.
            generate(resultsStr + ')', number, openCounter, closedCounter + 1);
    }
}
