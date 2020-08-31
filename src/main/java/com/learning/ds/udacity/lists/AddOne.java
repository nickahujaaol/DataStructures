package com.learning.ds.udacity.lists;

import com.learning.ds.LinkedList;
import com.learning.ds.Node;

public class AddOne {
    public static void main(String[] args) {
        LinkedList<Integer> inList = LinkedList.create(new int[]{9, 9, 9});
        addOne(inList);
        inList.print();
    }

    private static void addOne(LinkedList<Integer> inList) {
        int numberToAdd = 1;
        Node<Integer> workingNode = inList.head;
        while (workingNode != null) {
            int sum = workingNode.value + numberToAdd;
            workingNode.value = sum % 10;
            numberToAdd = sum / 10;
            workingNode = workingNode.next;
        }

        if (numberToAdd > 0) {
            inList.add(numberToAdd);
        }
    }
}
