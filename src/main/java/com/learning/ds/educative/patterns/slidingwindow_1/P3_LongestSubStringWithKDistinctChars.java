package com.learning.ds.educative.patterns.slidingwindow_1;

public class P3_LongestSubStringWithKDistinctChars {
    public static void main(String[] args) {
        String inString = "araaci";
        int length = getMaxLength(inString, 2);
        System.out.println("Max length is: " + length);
    }

    private static int getMaxLength(String inString, int maxChars) {
        StringBuilder builder = new StringBuilder();
        int workingLength = 0;
        int maxLength = Integer.MIN_VALUE;
        int distinctChars = 0;

        for(int i = 0; i < inString.length(); i++) {
            if(builder.toString().indexOf(inString.charAt(i)) == -1)
                distinctChars++;
            builder.append(inString.charAt(i));
            workingLength++;

            if(distinctChars <= maxChars) {
                maxLength = Math.max(maxLength, workingLength);
            }

            while (distinctChars > maxChars) {
                char toDelChar = builder.charAt(0);
                builder.deleteCharAt(0);
                workingLength--;
                if(builder.toString().indexOf(toDelChar) == -1)
                    distinctChars--;
            }
        }

        return maxLength;
    }
}
