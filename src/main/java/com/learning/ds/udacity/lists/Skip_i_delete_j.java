package com.learning.ds.udacity.lists;

import com.learning.ds.LinkedList;
import com.learning.ds.Node;

public class Skip_i_delete_j {
	public static void main(String[] args) {
		LinkedList<Integer> inList =LinkedList.create(new int[]{1,2,3,4,5,6,7,8,9,10,11,12});
		skip(inList, 2, 3);
		inList.print();
	}

	private static void skip(LinkedList<Integer> inList, int retainNodes, int deleteNodes) {
		Node<Integer> workingNode = inList.head;
		for(int i = 0; i < retainNodes - 1; i++ ) {
			workingNode = workingNode.next;
		}
		Node<Integer> currNode = workingNode;
		for(int i = 0; i <= deleteNodes; i++) {
			workingNode = workingNode.next;
		}
		currNode.next = workingNode;
	}
}
