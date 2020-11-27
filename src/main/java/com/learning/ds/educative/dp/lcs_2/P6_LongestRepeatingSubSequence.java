package com.learning.ds.educative.dp.lcs_2;

public class P6_LongestRepeatingSubSequence {
    public static void main(String[] args) {
        String str = "aabdbcec";
        int lrs = findLRS(str, str, str.length() - 1, str.length() - 1);
        System.out.println("MRS is :" + lrs);
    }

    private static int findLRS(String str1, String str2, int length1, int length2) {
        if(length1 < 0 || length2 < 0)
            return 0;

        if(str1.charAt(length1) == str2.charAt(length2) && length1 != length2) {
            return 1 + findLRS(str1, str2, length1 - 1, length2 - 1);
        } else {
            return Math.max(findLRS(str1, str2, length1 - 1, length2),
                    findLRS(str1, str2, length1, length2 - 1));
        }
    }
}
