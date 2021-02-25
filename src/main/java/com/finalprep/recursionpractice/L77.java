package com.finalprep.recursionpractice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;

public class L77 {
    public static void main(String[] args) {
        findCombinations(4, 2, 0, new LinkedList<Integer>());
    }

    private static void findCombinations(int n, int k, int index, LinkedList<Integer> workingList) {
        if(workingList.size() == k) {
            System.out.println(workingList);
            return;
        }

        for(int i = index; i < n; i++) {
            workingList.add(i + 1);
            findCombinations(n, k, i + 1, workingList);
            workingList.removeLast();
        }
    }
}
