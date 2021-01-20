package com.finalprep.recursion;

import java.util.ArrayList;

public class L90_SubSets {
    public static void main(String[] args) {
        int[] inData = {1,2,2};
        findSubSets(inData, 0, new ArrayList<Integer>());
    }

    private static void findSubSets(int[] inData, int index, ArrayList<Integer> list) {
        if(index > inData.length)
            return;

        System.out.println(list.toString());

        for(int i = index; i < inData.length; i++) {
            list.add(inData[index]);
            findSubSets(inData, i + 1, list);
            if(list.size() > 0)
                list.remove(list.size() - 1);
        }
    }
}
