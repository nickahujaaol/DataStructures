package com.learning.ds.educative.dp.lcs;

public class LongestRepeatingSubSequence {
    public static void main(String[] args) {
        String str = "aabdbcec";
        int lrs = findLRS(str, str, str.length() - 1, str.length() - 1);
        System.out.println("MRS is :" + lrs);
    }

    private static int findLRS(String str1, String str2, int index1, int index2) {
        if (index1 < 0 || index2 < 0)
            return 0;

        if (index1 != index2 && str1.charAt(index1) == str2.charAt(index2)) {
            return 1 + findLRS(str1, str2, index1 - 1, index2 - 1);
        }

        int leftLrs = findLRS(str1, str2, index1 - 1, index2);
        int rightLrs = findLRS(str1, str2, index1, index2 - 1);
        return Math.max(leftLrs, rightLrs);
    }
}
