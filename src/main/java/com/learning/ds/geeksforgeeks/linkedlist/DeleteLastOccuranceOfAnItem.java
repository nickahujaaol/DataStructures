package com.learning.ds.geeksforgeeks.linkedlist;
import com.learning.ds.LinkedList;

// https://www.geeksforgeeks.org/delete-last-occurrence-of-an-item-from-linked-list/
public class DeleteLastOccuranceOfAnItem {


  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();
    linkedList.add(1);
    linkedList.add(2);
    linkedList.add(3);
    linkedList.add(4);
    linkedList.add(5);
    linkedList.add(6);
    linkedList.add(7);
    linkedList.add(3);
    linkedList.add(2);
    linkedList.add(9);
    linkedList.print();
    linkedList.print();

  }
}
