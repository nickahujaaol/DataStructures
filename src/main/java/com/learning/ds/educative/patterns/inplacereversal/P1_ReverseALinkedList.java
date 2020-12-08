package com.learning.ds.educative.patterns.inplacereversal;

import com.learning.ds.LinkedList;
import com.learning.ds.Node;

public class P1_ReverseALinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = LinkedList.create();
        reverseInPlace(linkedList);
        linkedList.print();
    }

    private static void reverseInPlace(LinkedList<Integer> list) {
        Node<Integer> prevNode = null;
        Node<Integer> workingNode = list.head;

        while (workingNode != null) {
            Node<Integer> nextNode = workingNode.next;
            workingNode.next = prevNode;
            prevNode = workingNode;
            workingNode = nextNode;
        }

        list.head = prevNode;
    }
}
