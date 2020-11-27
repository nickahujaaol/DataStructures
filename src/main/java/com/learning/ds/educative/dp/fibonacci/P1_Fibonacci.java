package com.learning.ds.educative.dp.fibonacci;

public class P1_Fibonacci {
    public static void main(String[] args) {
        int number = fibonacci(7);
        System.out.println("Number is: " + number);
    }

    private static int fibonacci(int num) {
        if(num < 2)
            return num;
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
