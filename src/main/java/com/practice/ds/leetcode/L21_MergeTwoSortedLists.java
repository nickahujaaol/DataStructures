package com.practice.ds.leetcode;

import com.learning.ds.LinkedList;
import com.learning.ds.Node;

public class L21_MergeTwoSortedLists {
    public static void main(String[] args) {
        LinkedList list1 = LinkedList.create(new int[]{1,2,4});
        LinkedList list2 = LinkedList.create(new int[]{1,3,4,5});
        LinkedList<Integer> mergedList = merge(list1.head, list2.head);
        mergedList.print();
    }

    private static LinkedList<Integer> merge(Node<Integer> list1, Node<Integer> list2) {
        LinkedList<Integer> mergedList = new LinkedList<>();

        return mergedList;
    }
}
