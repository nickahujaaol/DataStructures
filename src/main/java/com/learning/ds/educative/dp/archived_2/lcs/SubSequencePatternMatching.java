package com.learning.ds.educative.dp.archived_2.lcs;

public class SubSequencePatternMatching {
    public static void main(String[] args) {
        System.out.println(findSPMCount("baxmx", "ax", 0, 0));
        System.out.println(findSPMCount("tomorrow", "tor", 0, 0));
    }

    private static int findSPMCount(String inString, String pattern, int strIndex, int patIndex) {
        // If we have reached here that means we have found a subsequence that is equal to given pattern.
        // The question is to find out how many times the pattern can be found in a given string.
        // The below IF condition says that we have found a FULL pattern so increment the count.
        if (patIndex == pattern.length())
            return 1;
        if (strIndex == inString.length())
            return 0;

        if (inString.charAt(strIndex) == pattern.charAt(patIndex)) {
            // We are not doing +1 here as in LCS because question is to find the number of sequences
            // i.e the whole pattern has to be there in the String multiple times
            int including = findSPMCount(inString, pattern, strIndex + 1, patIndex + 1);
            int excluding = findSPMCount(inString, pattern, strIndex + 1, patIndex);
            return including + excluding;
        }

        return findSPMCount(inString, pattern, strIndex + 1, patIndex);
    }
}
