package com.finalprep.recursion;

public class L91_DecodeWays {
    public static void main(String[] args) {
        String inString = "226";
        StringBuilder stringBuilder = new StringBuilder();
        decodeWays(inString, 0, stringBuilder);
        System.out.println(stringBuilder);
    }

    private static void decodeWays(String inString, int index, StringBuilder stringSoFar) {

    }

    private static void addChar(String workingString, StringBuilder stringSoFar) {
        if(workingString.length() > 0) {
            int tempInt = Integer.parseInt(workingString);
            if(tempInt <= 26) {
                char tempChar = (char)(65 + tempInt - 1);
                stringSoFar.append(tempChar);
            }
        }
    }

}
