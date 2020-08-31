package com.learning.ds.educative.dp.archived.lcs;

public class SubsequencePatternMatching {
    public static void main(String[] args) {
        SubsequencePatternMatching spm = new SubsequencePatternMatching();
        System.out.println(spm.findSPMCount("baxmx", "ax"));
        System.out.println(spm.findSPMCount("tomorrow", "tor"));
    }

    public int findSPMCount(String str, String pat) {
        return findSPMCountRecursive(str, pat, 0, 0);
    }

    private int findSPMCountRecursive(String str, String pat, int strIndex, int patIndex) {

        // if we have reached the end of the pattern
        if (patIndex == pat.length())
            return 1;

        // if we have reached the end of the string but pattern has still some characters left
        if (strIndex == str.length())
            return 0;

        if (str.charAt(strIndex) == pat.charAt(patIndex)) {
            int including = findSPMCountRecursive(str, pat, strIndex + 1, patIndex + 1);
            int excluding = findSPMCountRecursive(str, pat, strIndex + 1, patIndex);
            return including + excluding;
        } else {
            return findSPMCountRecursive(str, pat, strIndex + 1, patIndex);
        }
    }
}
