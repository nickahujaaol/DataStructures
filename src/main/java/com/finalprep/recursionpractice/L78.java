package com.finalprep.recursionpractice;


import java.util.ArrayList;
import java.util.LinkedList;

public class L78 {
    public static void main(String[] args) {
        int[] inArray = {1,2,3};
        findSubsets(inArray, 0, new LinkedList<Integer>());
    }

    private static void findSubsets(int[] inArray, int index, LinkedList<Integer> workingList) {
        System.out.println(workingList);

        if(index >= inArray.length)
            return;

        for(int i = index; i < inArray.length; i++) {
            workingList.add(inArray[i]);
            findSubsets(inArray, i + 1, workingList);
            workingList.removeLast();
        }
    }
}
