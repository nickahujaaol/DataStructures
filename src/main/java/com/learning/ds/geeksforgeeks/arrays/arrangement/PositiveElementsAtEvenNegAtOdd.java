package com.learning.ds.geeksforgeeks.arrays.arrangement;

import java.util.Arrays;

//https://www.geeksforgeeks.org/positive-elements-even-negative-odd-positions/
// Answer - {3, -1, 6, -5, 3, -7, 6, -4, 10, -9}
public class PositiveElementsAtEvenNegAtOdd {
    public static void arrange(int[] data) {
        int shouldNotBePositiveIndex = -1;
        int shouldNotBeNegativeIndex = -1;

        for (int i = 0; i < data.length; i++) {
            if (shouldNotBePositiveIndex == -1 && i % 2 == 1 && data[i] > 0) {
                shouldNotBePositiveIndex = i;
            }

            if (shouldNotBeNegativeIndex == -1 && i % 2 == 0 && data[i] < 0) {
                shouldNotBeNegativeIndex = i;
            }

            if (shouldNotBePositiveIndex != -1 && shouldNotBeNegativeIndex != -1) {
                int temp = data[shouldNotBePositiveIndex];
                data[shouldNotBePositiveIndex] = data[shouldNotBeNegativeIndex];
                data[shouldNotBeNegativeIndex] = temp;
                shouldNotBePositiveIndex = -1;
                shouldNotBeNegativeIndex = -1;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {-1, 3, -5, 6, 3, 6, -7, -4, -9, 10};
        arrange(arr);
        System.out.println(Arrays.toString(arr));
    }
}
