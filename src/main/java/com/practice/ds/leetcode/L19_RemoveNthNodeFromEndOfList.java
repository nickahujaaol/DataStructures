package com.practice.ds.leetcode;


import com.learning.ds.LinkedList;

public class L19_RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        removeNode(linkedList, 2);
        linkedList.print();
    }

    private static void removeNode(LinkedList<Integer> list, int removeIndex) {

    }
}
