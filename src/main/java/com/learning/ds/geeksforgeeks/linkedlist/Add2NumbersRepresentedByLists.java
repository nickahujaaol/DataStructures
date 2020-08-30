package com.learning.ds.geeksforgeeks.linkedlist;

import com.learning.ds.LinkedList;

//https://www.geeksforgeeks.org/add-two-numbers-represented-by-linked-lists/
public class Add2NumbersRepresentedByLists {

  public static void add(LinkedList<Integer> l1, LinkedList<Integer> l2) {

  }

  public static void main(String[] args) {
    //365
    LinkedList<Integer> l1 = new LinkedList<Integer>();
    l1.add(5);
    l1.add(6);
    l1.add(3);

    //248
    LinkedList<Integer> l2 = new LinkedList<Integer>();
    l2.add(8);
    l2.add(4);
    l2.add(9);

    add(l1, l2);
  }
}
