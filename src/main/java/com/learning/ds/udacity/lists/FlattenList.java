package com.learning.ds.udacity.lists;

import com.learning.ds.LinkedList;
import com.learning.ds.Node;

public class FlattenList {
	public static void main(String[] args) {
		LinkedList<Integer> list1 = LinkedList.create(new int[]{1,3,5});
		LinkedList<Integer> list2 = LinkedList.create(new int[]{2,4,6,10});
		LinkedList<Integer> list3 = LinkedList.create(new int[]{7,8,9});

		LinkedList<Node<LinkedList<Integer>>> parentList = new LinkedList();
		parentList.add(new Node<LinkedList<Integer>>(list1));
		parentList.add(new Node<LinkedList<Integer>>(list2));
		parentList.add(new Node<LinkedList<Integer>>(list3));

		flatten(parentList);
	}

	private static void flatten(LinkedList<Node<LinkedList<Integer>>> parentList) {
		LinkedList<Integer> mergedList = parentList.head.value.value;
		Node<Node<LinkedList<Integer>>> workingNode = parentList.head.next;
		while (workingNode != null) {
			mergedList = merge(mergedList, workingNode.value.value);
			workingNode = workingNode.next;
			System.out.println();
		}

		mergedList.print();
	}

	private static LinkedList merge(LinkedList<Integer> list1, LinkedList<Integer> list2) {
		Node<Integer> list1Node = list1.head;
		Node<Integer> list2Node = list2.head;
		LinkedList<Integer> mergedList = new LinkedList();

		while (list1Node != null || list2Node != null) {
			if(list1Node != null && list2Node != null) {
				if((Integer)list1Node.value <= (Integer) list2Node.value) {
					mergedList.add((Integer)list1Node.value);
					list1Node = list1Node.next;
				} else {
					mergedList.add((Integer)list2Node.value);
					list2Node = list2Node.next;
				}
			} else if(list1Node == null && list2Node != null) {
				mergedList.add((Integer)list2Node.value);
				list2Node = list2Node.next;
			} else {
				mergedList.add((Integer)list1Node.value);
				list1Node = list1Node.next;
			}
		}
		return mergedList;
	}
}
