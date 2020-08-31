package com.learning.ds.udacity.recursion;

public class Power {
    public static void main(String[] args) {
        int power = pow(5);
        System.out.println("Ans: " + power);
    }

    public static int pow(int power) {
        if (power == 0) return 1;
        else {
            return 2 * pow(power - 1);
        }
    }
}
