package com.practice.ds.leetcode;

import com.learning.ds.LinkedList;
import com.learning.ds.Node;

public class L83_RemoveDuplicateFromSortedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = LinkedList.create(new int[]{1,1,2,3,3,4,5});
        removeDuplicates(list);
        list.print();
    }

    private static void removeDuplicates(LinkedList<Integer> list) {
        Node<Integer> node = list.head;

        while (node != null) {
            if(node.next != null && node.value == node.next.value) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
    }
}
