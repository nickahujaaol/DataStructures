package com.finalprep.recursionpractice;

public class L22 {
    public static void main(String[] args) {
        generate(3,3, "");
    }

    private static void generate(int openCounter, int closeCounter, String workingString) {
        if(openCounter < 0 || closeCounter < 0)
            return;

        if(closeCounter < openCounter)
            return;

        if(openCounter == 0 && closeCounter == 0) {
            System.out.println(workingString);
            return;
        }
        generate(openCounter - 1, closeCounter, workingString + "(");
        generate(openCounter, closeCounter - 1, workingString + ")");
    }
}
