package com.learning.ds.educative.patterns.cyclicsort;

import java.util.Arrays;

public class P1_CyclicSort {
    public static void main(String[] args) {
        int[] inData = {3,1,5,4,2};
        sort(inData);
        System.out.println(Arrays.toString(inData));
    }

    private static void sort(int[] inData) {
        int counter = 0;

        while (counter < inData.length) {
            if(counter == inData[counter] - 1){
                counter++;
            } else {
                int temp = inData[counter];
                inData[counter] = inData[temp- 1];
                inData[temp - 1] = temp;
            }
        }
    }
}
