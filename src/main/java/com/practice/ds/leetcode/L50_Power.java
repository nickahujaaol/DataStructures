package com.practice.ds.leetcode;

public class L50_Power {
    public static void main(String[] args) {
        double power = pow(2, -2);
        System.out.println(power);
    }

    private static double pow(int number, int power) {
        if(power == 0)
            return 1;

        if(power < 0) {
            return 1 / pow(number, -power);
        } else {
            return number * pow(number, power - 1);
        }
    }
}
