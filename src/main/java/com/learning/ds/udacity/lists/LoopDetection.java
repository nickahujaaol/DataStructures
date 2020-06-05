package com.learning.ds.udacity.lists;

import com.learning.ds.LinkedList;
import com.learning.ds.Node;

public class LoopDetection {
	public static void main(String[] args) {
		LinkedList linkedList = LinkedList.create();
		linkedList.tail.next = linkedList.head;
		detectLoop(linkedList);

		LinkedList anotherList = new LinkedList();
		anotherList.add(1);
		anotherList.add(2);
		anotherList.tail.next = anotherList.head;
		detectLoop(anotherList);

	}

	private static void detectLoop(LinkedList origList) {
		Node slowPointer = origList.head;
		Node fastPointer = origList.head != null && origList.head.next != null ? origList.head.next.next : null;
		boolean loopDetected = false;

		while (slowPointer != null && fastPointer != null) {
			if(slowPointer.value == fastPointer.value) {
				loopDetected = true;
				break;
			}
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next != null ? fastPointer.next.next : fastPointer.next;
		}

		System.out.println("Loop: " + loopDetected);
	}
}
