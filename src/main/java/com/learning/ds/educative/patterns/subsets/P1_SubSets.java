package com.learning.ds.educative.patterns.subsets;

import java.util.ArrayList;
import java.util.List;

public class P1_SubSets {
    public static void main(String[] args) {
        int[] set = {1,5,3};
        subSets(set, 0, new ArrayList<>());
    }

    private static void subSets(int[] set, int index, List<Integer> list) {
        if(index > set.length)
            return;

        System.out.println(list);

        for(int i = index; i < set.length; i++) {
            list.add(set[i]);
            subSets(set, i + 1, list);
            if(i < set.length)
                //list.remove(new Integer(set[i]));
                list.remove(list.size() - 1); // BOTH WILL WORK
        }
    }
}
