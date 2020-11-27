package com.learning.ds.educative.dp.archived_2.lcs;

// https://www.youtube.com/watch?v=AuYujVj646Q&t=616s
public class EditDistance {
    public static void main(String[] args) {
        String s1 = "but";
        String s2 = "bat";
        int distance = getDistance(s1, s2, 0, 0);
        System.out.println("Distance is: " + distance);
    }

    private static int getDistance(String s1, String s2, int s1Index, int s2Index) {
        if (s1Index == s1.length())
            return s2.length() - s2Index;
        if (s2Index == s2.length())
            return s1.length() - s1Index;

        if (s1.charAt(s1Index) == s2.charAt(s2Index))
            return getDistance(s1, s2, s1Index + 1, s2Index + 1);

        int insertCount = 1 + getDistance(s1, s2, s1Index + 1, s2Index);
        int deleteCount = 1 + getDistance(s1, s2, s1Index, s2Index + 1);
        int replaceCount = 1 + getDistance(s1, s2, s1Index + 1, s2Index + 1);

        return Math.min(insertCount, Math.min(deleteCount, replaceCount));
    }
}
