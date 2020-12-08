package com.learning.ds.educative.patterns.inplacereversal;

import com.learning.ds.LinkedList;
import com.learning.ds.Node;

public class P3_ReverseEveryKElementsSubList {
    public static void main(String[] args) {
        LinkedList linkedList = LinkedList.create();
        reverse(linkedList, 3);
        linkedList.print();
    }

    private static void reverse(LinkedList<Integer> list, int numOfElements) {
        Node<Integer> prevNode = null;
        Node<Integer> workingNode = list.head;
        Node<Integer> blockStartingNode = list.head;
        Node<Integer> prevBlockEndingNode = list.head;
        Node<Integer> firstNodeOfSubList = null;
        int blockCounter = 1;
        boolean firstBlock = true;

        while (workingNode != null) {
            Node<Integer> nextNode = workingNode.next;
            workingNode.next = prevNode;
            prevNode = workingNode;
            workingNode = nextNode;

            if(blockCounter % numOfElements == 0) {

                blockCounter = 1;
                if (firstBlock) {
                    firstBlock = false;
                    list.head = prevNode;
                    //prevBlockEndingNode.next = prevNode;
                }
                prevBlockEndingNode.next = prevNode;
                prevBlockEndingNode = blockStartingNode;
                blockStartingNode = workingNode;
            } else {
                blockCounter++;
            }
        }

        if(blockCounter > 0)
            prevBlockEndingNode.next = prevNode;

        System.out.println("");
    }
}
