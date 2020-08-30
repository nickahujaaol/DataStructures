package com.learning.ds.geeksforgeeks.arrays.arrangement;

import java.util.Arrays;

//https://www.geeksforgeeks.org/move-ve-elements-end-order-extra-space-allowed/
//VERY IMPORTANT - SEE HOW lastIndex BEHAVES.
// If we do not do this then we get into infinite loop. See also if there are consecutive -ve numbers.
public class MoveAllNegativeNumsToEnd {
    public static void move(int data[]) {

    }

    public static void main(String[] args) {
        int data[] = {1, -1, 3, 2, -7, -5, 11, 6 };
        move(data);
        System.out.println(Arrays.toString(data));
    }
}
