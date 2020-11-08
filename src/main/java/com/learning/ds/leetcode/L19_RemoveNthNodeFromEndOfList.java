package com.learning.ds.leetcode;


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
        removeNode(linkedList, 2);
        linkedList.print();
    }

    private static void removeNode(LinkedList<Integer> list, int removeIndex) {
        Node<Integer> slowPointer = list.head;
        Node<Integer> fastPointer = list.head;
        Node<Integer> prevNode = null;

        for(int i = 0; i < removeIndex ; i++) {
            fastPointer = fastPointer.next;
        }
        while (fastPointer != null) {
            fastPointer = fastPointer.next;
            prevNode = slowPointer;
            slowPointer = slowPointer.next;
        }
        prevNode.next = slowPointer.next;
    }
}
