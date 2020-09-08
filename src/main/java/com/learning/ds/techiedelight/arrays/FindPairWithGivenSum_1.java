package com.learning.ds.techiedelight.arrays;

import java.util.Arrays;
import java.util.HashMap;

// https://www.techiedelight.com/find-pair-with-given-sum-array/
public class FindPairWithGivenSum_1 {
    public static void main(String[] args) {
        int[] data = {8,7,2,5,3,1};
        findPair_Method1(data, 10);
        findPair_Method2(data, 10);
    }

    private static void findPair_Method1(int[] data, int sum) {
        Arrays.sort(data);
        int low = 0;
        int high = data.length - 1;

        while (low < high) {
            if(data[low] + data[high] == sum) {
                System.out.println(data[low] + " " + data[high]);
                low++;high--;
            } else if(data[low] + data[high] > sum) {
                high--;
            } else {
                low++;
            }
        }
    }

    private static void findPair_Method2(int[] data, int sum) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < data.length; i++) {
            if(!map.containsKey(sum - data[i]))
                map.put(data[i], sum - data[i]);
            else {
                System.out.println(data[i] + " " + (sum - data[i]));
            }
        }
    }
}
