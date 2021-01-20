package com.practice.ds.leetcode;

import com.learning.ds.LinkedList;
import com.learning.ds.Node;


// Another Solution
// https://www.programcreek.com/2013/12/in-place-reorder-a-singly-linked-list-in-java/
public class L143_ReorderList {
    public static void main(String[] args) {
        LinkedList<Integer> list = LinkedList.create(new int[]{1,2,3,4});
        reorder(list.head, list.head);
        list.print();

        System.out.println();

        list = LinkedList.create(new int[]{1,2,3,4,5});
        reorder(list.head, list.head);
        list.print();
    }

    private static Node<Integer> reorder(Node<Integer> nodeFwd, Node<Integer> nodeBack) {

        return null;
    }
}
