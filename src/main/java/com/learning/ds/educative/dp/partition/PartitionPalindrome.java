package com.learning.ds.educative.dp.partition;

public class PartitionPalindrome {
    public static void main(String[] args) {
        String inString = "abcbd";
        int partitions = findPartitions(inString, 0, inString.length() - 1);
        System.out.println("Min Partitions: " + partitions);
    }

    private static int findPartitions(String inString, int start, int end) {
        if (start >= end)
            return 0;

        if (isPalindrome(inString, start, end))
            return 0;

        int minPartitions = Integer.MAX_VALUE;
        for (int k = start; k <= end - 1; k++) {
            int tempPartitions = 1 + findPartitions(inString, start, k) +
                    findPartitions(inString, k + 1, end);
            minPartitions = Math.min(minPartitions, tempPartitions);
        }

        return minPartitions;
    }

    private static boolean isPalindrome(String st, int x, int y) {
        while (x < y) {
            if (st.charAt(x++) != st.charAt(y--))
                return false;
        }
        return true;
    }
}
