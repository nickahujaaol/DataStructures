package com.learning.ds.educative.patterns.slidingwindow_1;

public class P6_LongestSubArrayWith1sAfterReplacement {
    public static void main(String[] args) {
        int[] inArray = {0,1,1,0,0,0,1,1,0,1,1};
        int maxReplacements = 2;
        int length = getMaxLength(maxReplacements, inArray);
        System.out.println("Max Length is: "+ length);
    }

    private static int getMaxLength(int maxReplacements, int[] inArray) {
        int maxLength = Integer.MIN_VALUE;
        int windowStart = 0;
        int max1sCount = 0;

        for(int windowEnd = 0; windowEnd < inArray.length; windowEnd++) {
            if(inArray[windowEnd] == 1)
                max1sCount++;

            if(windowEnd - windowStart + 1 - max1sCount > maxReplacements) {
                if(inArray[windowStart] == 1)
                    max1sCount--;
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }

        return maxLength;
    }
}
