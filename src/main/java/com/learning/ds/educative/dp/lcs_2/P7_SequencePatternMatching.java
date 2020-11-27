package com.learning.ds.educative.dp.lcs_2;

public class P7_SequencePatternMatching {
    public static void main(String[] args) {
        System.out.println(findSPMCount("baxmx", "ax", 0, 0));
        System.out.println(findSPMCount("tomorrow", "tor", 0, 0));
    }

    private static int findSPMCount(String inString, String pattern, int strIndex, int patIndex) {
        if (patIndex == pattern.length())
            return 1;
        if (strIndex == inString.length())
            return 0;

        if(inString.charAt(strIndex) == pattern.charAt(patIndex)) {
            int including = findSPMCount(inString, pattern, strIndex + 1, patIndex + 1);
            int excluding = findSPMCount(inString, pattern, strIndex + 1, patIndex);
            return including + excluding;
        }
        return findSPMCount(inString, pattern, strIndex + 1, patIndex);
    }
}
