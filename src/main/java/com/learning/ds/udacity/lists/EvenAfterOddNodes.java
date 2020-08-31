package com.learning.ds.udacity.lists;

import com.learning.ds.LinkedList;
import com.learning.ds.Node;

public class EvenAfterOddNodes {
    public static void main(String[] args) {
        LinkedList<Integer> inList = LinkedList.create(new int[]{12, 1, 2, 3, 4, 5, 6, 7, 8, 9});
        rearrange(inList);
        inList.print();
    }

    private static void rearrange(LinkedList<Integer> inList) {
        Node<Integer> workingNode = inList.head;
        Node<Integer> previousNode = null;

        for (int i = 0; i < inList.size; i++) {
            System.out.println("Current Node: " + workingNode.value);
            if (workingNode.value % 2 == 0) {
                if (i == 0) {
                    inList.head = workingNode.next;
                } else {
                    previousNode.next = workingNode.next;
                }

                inList.tail.next = workingNode;
                workingNode.next = null;
                inList.tail = workingNode;

                // Consider the first node/head is even
                workingNode = previousNode == null ? inList.head : previousNode.next;
            } else {
                previousNode = workingNode;
                workingNode = previousNode.next;
            }
        }
    }
}
