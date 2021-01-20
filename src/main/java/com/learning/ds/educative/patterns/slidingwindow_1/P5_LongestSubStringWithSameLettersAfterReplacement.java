package com.learning.ds.educative.patterns.slidingwindow_1;

import java.util.HashMap;

public class P5_LongestSubStringWithSameLettersAfterReplacement {
    public static void main(String[] args) {
        String inString = "aabccbb";
        int maxReplacements = 2;
        int maxLength = getMaxLength(inString, maxReplacements);
        System.out.println("Max Length is: " + maxLength);
    }

    private static int getMaxLength(String inString, int maxReplacements) {
        HashMap<Character, Integer> countMap = new HashMap<>();
        int maxRepeatLetterCount = Integer.MIN_VALUE;
        int maxLength = Integer.MIN_VALUE;
        int windowStart = 0;

        for(int windowEnd = 0; windowEnd < inString.length(); windowEnd++) {
            countMap.putIfAbsent(inString.charAt(windowEnd), 0);
            countMap.put(inString.charAt(windowEnd), countMap.get(inString.charAt(windowEnd)).intValue() + 1);
            maxRepeatLetterCount = Math.max(maxRepeatLetterCount, countMap.get(inString.charAt(windowEnd)));

            if(windowEnd - windowStart + 1 - maxRepeatLetterCount > maxReplacements) {
                char leftChar = inString.charAt(windowStart);
                countMap.put(leftChar, countMap.get(leftChar).intValue() - 1);
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }

        return maxLength;
    }
}
