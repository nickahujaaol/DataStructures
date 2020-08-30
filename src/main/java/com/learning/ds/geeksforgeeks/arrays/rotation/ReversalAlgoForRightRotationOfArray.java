package com.learning.ds.geeksforgeeks.arrays.rotation;

import java.util.Arrays;

//https://www.geeksforgeeks.org/reversal-algorithm-right-rotation-array/
public class ReversalAlgoForRightRotationOfArray {
  public static void rightRotate(int data[], int numOfRotations) {

  }

  private static void shiftRight(int data[]) {
    for(int i = data.length - 1; i >= 1; i--) {
      data[i] = data[i - 1];
    }
    data[0] = 0;
  }

  public static void main(String[] args) {
    int[] data = {1,2,3,4,5,6,7,8,9};
    rightRotate(data, 3);
    System.out.println(Arrays.toString(data));
  }
}
