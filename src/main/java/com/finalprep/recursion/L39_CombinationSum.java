package com.finalprep.recursion;

import java.util.ArrayList;
import java.util.List;

public class L39_CombinationSum {
    public static void main(String[] args) {
        int[] inArray = {12,1,61,5,9,2,12,10};
        findSubSets(inArray, 0, 0, new ArrayList(), 24);
    }

    private static void findSubSets(int[] inArray, int index, int sumSoFar, List resultsList, int target) {
        if(sumSoFar == target) {
            System.out.println(resultsList);
        }
        if(index >= inArray.length)
            return;

        resultsList.add(inArray[index]);
        findSubSets(inArray, index + 1, sumSoFar + inArray[index], resultsList, target);
        if(resultsList.size() > 0)
            resultsList.remove(resultsList.size() - 1);
        findSubSets(inArray, index + 1, sumSoFar, resultsList, target);
    }
}
