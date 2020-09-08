package com.learning.ds.techiedelight.arrays;

import java.util.Arrays;

//https://www.techiedelight.com/sort-binary-array-linear-time/
// READ ARTICLE ALSO.
public class SortBinaryArray_4 {
    public static void main(String[] args) {
        int[] data = {1,0,1,0,1,0,0,1};
        sort(data);
        System.out.println(Arrays.toString(data));
    }

    private static void sort(int[] data) {
        int low = 0;
        int high = data.length - 1;

        while (low < high) {
            if(data[low] == 0)
                low++;
            if(data[high] == 1)
                high--;

            if(data[low] == 1 && data[high] == 0 && low < high) {
                int temp = data[low];
                data[low] = data[high];
                data[high] = temp;
            }
        }
    }
}
