package com.practice.ds.leetcode;

import com.learning.ds.LinkedList;
import com.learning.ds.Node;

public class L24_SwapNodes {
    public static void main(String[] args) {
        LinkedList list = LinkedList.create(new int[]{1,2,3,4,5,6});
        swapNodes(list);
        list.print();
    }

    private static void swapNodes(LinkedList list) {
        Node<Integer> prevNode = null;
        Node<Integer> currNode = list.head;
        Node<Integer> nxtNode = list.head.next;
    }
}
