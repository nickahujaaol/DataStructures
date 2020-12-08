package com.learning.ds.educative.patterns.subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P3_PermutationsOfArray {
    public static void main(String[] args) {
        int set[] = {1,2,3};
        List<String> results = new ArrayList<>();
        permutations(set, 0, results);
        System.out.println(results);
    }

    private static void permutations(int[] set, int index, List<String> results) {
        if(index >= set.length) {
            results.add(Arrays.toString(set.clone()));
            return;
        }

        for(int i = index; i < set.length; i++) {
            swap(set, i, index);
            permutations(set, index + 1, results);
            swap(set, i, index);
        }
    }

    private static void swap(int[] inArray, int i, int j) {
        int temp = inArray[i];
        inArray[i] = inArray[j];
        inArray[j] = temp;
    }
}
