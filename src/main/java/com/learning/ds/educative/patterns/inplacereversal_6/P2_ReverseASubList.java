package com.learning.ds.educative.patterns.inplacereversal_6;

import com.learning.ds.LinkedList;
import com.learning.ds.Node;

public class P2_ReverseASubList {
    public static void main(String[] args) {
        LinkedList linkedList = LinkedList.create();
        reverse(linkedList, 2, 4);
        linkedList.print();
    }

    private static void reverse(LinkedList<Integer> list, int start, int end) {
        Node<Integer> prevNode = null;
        Node<Integer> workingNode = list.head;
        Node<Integer> lastNodeOfFirstHalf = null;
        Node<Integer> nextNodeOfSecondHalf = null;
        Node<Integer> firstNodeOfSubList = null;

        while (workingNode != null) {
            if(workingNode.value == start) {
                lastNodeOfFirstHalf = prevNode;
                prevNode = null;
                break;
            } else {
                prevNode = workingNode;
                workingNode = workingNode.next;
            }
        }

        firstNodeOfSubList = workingNode;
        while (workingNode != null) {
            if(workingNode.value == end) {
                nextNodeOfSecondHalf = workingNode.next;
                workingNode.next = prevNode;
                break;
            }
            Node<Integer> nextNode = workingNode.next;
            workingNode.next = prevNode;
            prevNode = workingNode;
            workingNode = nextNode;
        }

        lastNodeOfFirstHalf.next = workingNode;
        firstNodeOfSubList.next = nextNodeOfSecondHalf;
    }


}
