package com.practice.ds.leetcode;


import com.learning.ds.LinkedList;
import com.learning.ds.Node;

public class L19_RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);
        linkedList.add(8);
        linkedList.add(9);
        removeNode(linkedList, 2);
        linkedList.print();
    }

    private static void removeNode(LinkedList<Integer> list, int removeIndex) {
        Node<Integer> fastPointer = list.head;
        Node<Integer> slowPointer = list.head;

        for(int i = 0; i < removeIndex; i++) {
            fastPointer = fastPointer.next;
        }

        while (fastPointer.next != null) {
            fastPointer = fastPointer.next;
            slowPointer = slowPointer.next;
        }
        slowPointer.next = slowPointer.next.next;
        System.out.println(slowPointer.value);
    }
}
