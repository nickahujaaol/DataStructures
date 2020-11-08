package com.learning.ds.leetcode;

import com.learning.ds.LinkedList;
import com.learning.ds.Node;

public class L82_RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = LinkedList.create(new int[]{1,2,3,3,3,3,3,4,4,5});
        removeDuplicates(list);
        list.print();
    }

    private static void removeDuplicates(LinkedList<Integer> list) {
        Node<Integer> prevNode = list.head;
        Node<Integer> currNode = list.head;

        while (currNode != null) {
            boolean duplicateFound = false;
            while (currNode.next != null  && currNode.value == currNode.next.value) {
                currNode = currNode.next;
                duplicateFound = true;
            }

            if(!duplicateFound) {
                if(currNode == list.head) {
                    prevNode = list.head;
                } else {
                    prevNode.next = currNode;
                    prevNode = prevNode.next;
                }
            }
            currNode = currNode.next;
        }
    }
}
