package com.learning.ds.educative.dp.lcs_2;

public class P10_EditDistance {
    public static void main(String[] args) {
        String s1 = "but";
        String s2 = "bat";
        int distance = getDistance(s1, s2, 0, 0);
        System.out.println("Distance is: " + distance);
    }

    private static int getDistance(String s1, String s2, int index1, int index2) {
        if (index1 == s1.length())
            return s2.length() - index2;
        if (index2 == s2.length())
            return s1.length() - index1;

        if(s1.charAt(index1) == s2.charAt(index2)) {
            return getDistance(s1, s2, index1 + 1, index2 + 1);
        }

        int insertCount = 1 + getDistance(s1, s2, index1 + 1, index2);
        int deleteCount = 1 + getDistance(s1, s2, index1, index2 + 1);
        int replaceCount = 1 + getDistance(s1, s2, index1 + 1, index2 + 1);
        return Math.min(insertCount, Math.min(deleteCount, replaceCount));
    }
}
