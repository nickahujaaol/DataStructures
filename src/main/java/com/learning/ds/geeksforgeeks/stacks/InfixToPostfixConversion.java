package com.learning.ds.geeksforgeeks.stacks;

//https://www.geeksforgeeks.org/stack-set-2-infix-to-postfix/
//https://www.youtube.com/watch?v=vq-nUF0G4fI
public class InfixToPostfixConversion {
    public static void convert(String expression) {

    }

    public static void main(String[] args) {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        //String exp = "a+b*c-d*e";
        convert(exp);
    }

    private static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }
}
