package com.learning.ds.educative.dp.lcs_2;


public class P1_LongestCommonSubsequence {
    public static void main(String[] args) {
        String str1 = "abdca";
        String str2 = "cbda";
        int lcs = findLCS(str1, str2, str1.length() - 1, str2.length() - 1);
        System.out.println("LCS is: " + lcs);
    }

    private static int findLCS(String str1, String str2, int length1, int length2) {
        if(length1 < 0 || length2 < 0)
            return 0;

        if(str1.charAt(length1) == str2.charAt(length2)) {
            return 1 + findLCS(str1, str2, length1 - 1, length2 - 1);
        } else {
            return Math.max(findLCS(str1, str2, length1 - 1, length2),
                    findLCS(str1, str2, length1, length2 - 1));
        }
    }
}
