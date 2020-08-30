package com.template.ds.geeksforgeeks.linkedlist;


import com.learning.ds.LinkedList;

//https://www.geeksforgeeks.org/delete-a-linked-list-node-at-a-given-position/
public class DeleteNodeAtGivenPosition {
  public static void deleteNode(LinkedList list, int position) {

  }

  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();
    linkedList.add(1);
    linkedList.add(2);
    linkedList.add(3);
    linkedList.add(4);
    linkedList.add(5);
    linkedList.add(6);
    linkedList.add(7);
    linkedList.print();
    deleteNode(linkedList, 2);
    linkedList.print();

  }
}
