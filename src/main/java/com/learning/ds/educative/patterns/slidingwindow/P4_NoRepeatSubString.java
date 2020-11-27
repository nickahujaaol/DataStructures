package com.learning.ds.educative.patterns.slidingwindow;

public class P4_NoRepeatSubString {
    public static void main(String[] args) {
        String inString = "abccde";
        int length = getMaxLength(inString);
        System.out.println("Max length is: " + length);
    }

    private static int getMaxLength(String inString) {
        StringBuilder builder = new StringBuilder();
        int maxLength = Integer.MIN_VALUE;
        int workingLength = 0;
        for(int i = 0; i < inString.length(); i++) {
            if(builder.toString().indexOf(inString.charAt(i)) == -1) {
                builder.append(inString.charAt(i));
                workingLength++;
                maxLength = Math.max(maxLength, workingLength);
            } else {
                int indexOfFoundChar = builder.toString().indexOf(inString.charAt(i));
                builder.delete(0, indexOfFoundChar);
                workingLength = 0;
            }
        }

        return maxLength;
    }
}
