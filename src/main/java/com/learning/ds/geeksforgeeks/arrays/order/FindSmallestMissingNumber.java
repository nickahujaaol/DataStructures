package com.learning.ds.geeksforgeeks.arrays.order;

//https://www.geeksforgeeks.org/find-the-first-missing-number/
// USE MODIFIED BINARY SEARCH.

public class FindSmallestMissingNumber {
    public static int find(int data[], int start, int end) {
        if(start > end)
            return end + 1;

        if(data[start] != start)
            return start;

        int mid = (start + end) / 2;
        if(data[mid] == mid)
            return find(data, mid + 1, end);
        return find(data, start, mid);
    }

    public static void main(String[] args) {
        int data[] = {0, 1, 2, 3, 4, 5, 6, 7, 10};
        int missingNumber = find(data, 0, data.length - 1);
        System.out.println("Missing NUmber is: " + missingNumber);
    }
}
