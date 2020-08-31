package com.learning.ds.udacity.recursion;

public class SumOfIntegers {
    public static void main(String[] args) {
        int sum = findSum(5);
        System.out.println("Ans: " + sum);
    }

    public static int findSum(int number) {
        if (number <= 0) return 0;
        else return number + findSum(number - 1);
    }
}
