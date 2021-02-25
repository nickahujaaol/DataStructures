package com.finalprep.recursionpractice;

import java.util.LinkedList;

public class L39 {
    public static void main(String[] args) {
        int[] inArray = {10,1,2,7,6,1,5};
        int target = 8;

        findCombinations(inArray, target, 0, new LinkedList<Integer>(), 0);
    }

    private static void findCombinations(int[] inArray, int target, int index, LinkedList<Integer> holderList, int sumSoFar) {
        if(index >= inArray.length || sumSoFar > target)
            return;

        if(sumSoFar == target) {
            System.out.println(holderList);
            return;
        }

        holderList.add(inArray[index]);
        findCombinations(inArray, target, index + 1, holderList, sumSoFar + inArray[index]);
        holderList.removeLast();

        findCombinations(inArray, target, index + 1, holderList, sumSoFar);
    }
}
