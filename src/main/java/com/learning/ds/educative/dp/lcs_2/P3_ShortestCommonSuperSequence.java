package com.learning.ds.educative.dp.lcs_2;

public class P3_ShortestCommonSuperSequence {
    public static void main(String[] args) {
        String str1 = "geek";
        String str2 = "eke";
        int length = findShortestCommonSuperSequence(str1, str2, str1.length() - 1, str2.length() - 1);
        System.out.println("Length is: " + length);
    }

    private static int findShortestCommonSuperSequence(String str1, String str2, int index1, int index2) {
        if(index1 == 0 && index2 == 0)
            return 0;
        if(index1 == 0 || index2 == 0)
            return Math.abs(index1 - index2) + 1;

        if(str1.charAt(index1) == str2.charAt(index2)){
            return 1 + findShortestCommonSuperSequence(str1, str2, index1 - 1, index2 - 1);
        }

        int leftCount = 1 + findShortestCommonSuperSequence(str1, str2, index1 - 1, index2);
        int rightCount = 1 + findShortestCommonSuperSequence(str1, str2, index1, index2 - 1);
        return Math.min(leftCount, rightCount);
    }
}
