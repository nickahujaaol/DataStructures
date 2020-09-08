package com.learning.ds.techiedelight.arrays;

import java.util.HashSet;

// https://www.techiedelight.com/check-subarray-with-0-sum-exists-not/
public class CheckIfSubarrayWith0SumExists_2 {
    public static void main (String[] args) {
        int[] A = { 11, 4, -6, 3, -1, 4, 2, 7 };

        if (zeroSumSubarray(A)) {
            System.out.println("Subarray exists");
        } else {
            System.out.println("Subarray do not exist");
        }
    }

    private static boolean zeroSumSubarray(int[] data) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        set.add(sum);

        for(int i = 0; i < data.length; i++) {
            sum += data[i];
            if(set.contains(sum))
                return true;
            set.add(sum);
        }

        return false;
    }
}
