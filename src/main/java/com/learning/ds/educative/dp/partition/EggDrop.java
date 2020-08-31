package com.learning.ds.educative.dp.partition;

public class EggDrop {
    public static void main(String[] args) {
        int floors = 10;
        int eggs = 2;
        int minAttempts = findMin(floors, eggs);
        System.out.println("Min Attempts: " + minAttempts);
    }

    private static int findMin(int floors, int eggs) {
        if (floors == 0 || floors == 1)
            return floors;

        if (eggs == 1)
            return floors;

        int minAttempts = Integer.MAX_VALUE;
        for (int k = 1; k <= floors; k++) {
            int tempMin = 1 + Math.max(findMin(k - 1, eggs - 1),
                    findMin(floors - k, eggs));
            minAttempts = Math.min(minAttempts, tempMin);
        }

        return minAttempts;
    }
}
