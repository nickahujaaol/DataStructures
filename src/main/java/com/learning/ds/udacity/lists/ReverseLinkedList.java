package com.learning.ds.udacity.lists;

import com.learning.ds.LinkedList;
import com.learning.ds.Node;

public class ReverseLinkedList {
	public static void main(String[] args) {
		reverseInPlace(LinkedList.create());
		System.out.println("\n");
		reverseNewNode(LinkedList.create());
		System.out.println("\n");
		LinkedList recursionList = LinkedList.create();
		reverseRecursion(recursionList, null, recursionList.head);
		recursionList.print();
	}

	private static void reverseNewNode(LinkedList origList) {
		LinkedList reversedList = new LinkedList();
		Node rWorkingNode = null;
		Node rPrevNode = null;
		Node workingNode = origList.head;

		while (workingNode != null) {
			rWorkingNode = new Node(workingNode.value);
			rWorkingNode.next = rPrevNode;
			rPrevNode = rWorkingNode;
			workingNode = workingNode.next;
		}
		reversedList.head = rWorkingNode;
		reversedList.print();
	}

	private static void reverseInPlace(LinkedList origList) {
		Node nextNode = null;
		Node prevNode = null;
		Node workingNode = origList.head;

		while (workingNode != null) {
			nextNode = workingNode.next;
			workingNode.next = prevNode;
			prevNode = workingNode;
			workingNode = nextNode;
		}
		origList.head = prevNode;
		origList.print();
	}

	public static void reverseRecursion(LinkedList origList, Node prevNode, Node currentNode) {
		if(currentNode == null) {
			return;
		}

		reverseRecursion(origList, currentNode, currentNode.next);

		if(currentNode.next == null) {
			origList.head = currentNode;
		}
		currentNode.next = prevNode;
	}
}
