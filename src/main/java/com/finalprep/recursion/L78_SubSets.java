package com.finalprep.recursion;

import java.util.ArrayList;

public class L78_SubSets {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        findSubsets(nums, 0, new ArrayList<Integer>());
    }

    private static void findSubsets(int[] nums, int index, ArrayList<Integer> list) {
        System.out.println(list);

        if(index >= nums.length)
            return;

        for(int i = index; i < nums.length; i++) {
            list.add(nums[i]);
            findSubsets(nums, i + 1, list);
            list.remove(list.size() - 1);
        }
    }
}
