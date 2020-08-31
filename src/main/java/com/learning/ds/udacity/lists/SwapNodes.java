package com.learning.ds.udacity.lists;

import com.learning.ds.LinkedList;
import com.learning.ds.Node;

public class SwapNodes {
    public static void main(String[] args) {
        LinkedList<Integer> inList = LinkedList.create(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12});
        swapNodes(inList, 1, 12);
        inList.print();
    }

    private static void swapNodes(LinkedList<Integer> inList, int value1, int value2) {
        Node<Integer> workingNode = inList.head;
        Node<Integer> nextNextNode1 = null;
        Node<Integer> nextNextNode2 = null;
        Node<Integer> nextNode1 = null;
        Node<Integer> nextNode2 = null;
        Node<Integer> prevOfNode1 = null;
        boolean isHead = false;

        if (value1 == value2) return;

        if (workingNode.value == value1) {
            nextNode1 = inList.head;
            isHead = true;
        }

        while (workingNode != null) {
            if (workingNode.next != null) {
                if (workingNode.next.value == value1) {
                    prevOfNode1 = workingNode;
                    nextNode1 = workingNode.next;
                    nextNextNode1 = workingNode.next.next;
                }
                if (workingNode.next.value == value2) {
                    nextNode2 = workingNode.next;
                    nextNextNode2 = workingNode.next.next;
                }

                if (nextNode1 != null && nextNode2 != null) {
                    if (isHead) {
                        nextNode2.next = inList.head.next;
                        inList.head = nextNode2;
                    } else {
                        prevOfNode1.next = nextNode2;
                        nextNode2.next = nextNextNode1;
                    }

                    workingNode.next = nextNode1;
                    nextNode1.next = nextNextNode2;
                    break;
                }
            }

            workingNode = workingNode.next;
        }

    }
}
