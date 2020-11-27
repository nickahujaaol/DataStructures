package com.learning.ds.educative.dp.archived_2.lcs;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String str1 = "abdca";
        String str2 = "cbda";
        int lcs = findLCS(str1, str2, str1.length() - 1, str2.length() - 1);
        System.out.println("LCS is: " + lcs);
    }

    private static int findLCS(String str1, String str2, int index1, int index2) {
        if (index1 < 0 || index2 < 0)
            return 0;

        if (str1.charAt(index1) == str2.charAt(index2)) {
            return 1 + findLCS(str1, str2, index1 - 1, index2 - 1);
        } else {
            return Math.max(findLCS(str1, str2, index1 - 1, index2),
                    findLCS(str1, str2, index1, index2 - 1));
        }
    }
}
