package com.learning.ds.leetcode;

import com.learning.ds.DoublyLinkedListNode;

import java.util.HashMap;

public class L146_LRUCache {
    DoublyLinkedListNode<Integer> head;
    DoublyLinkedListNode<Integer> tail;
    private HashMap<Integer, DoublyLinkedListNode<Integer>> keyToNodeMap = new HashMap<>();
    private int capacity = 3;
    private int size = 0;

    public L146_LRUCache() {
        DoublyLinkedListNode<Integer> head = new DoublyLinkedListNode<>();
        DoublyLinkedListNode<Integer> tail = new DoublyLinkedListNode<>();
        head.next = tail;
        tail.prev = head;
    }

    private void removedNode(DoublyLinkedListNode<Integer> node) {
        DoublyLinkedListNode<Integer> prevNode = node.prev;
        prevNode.next = node.next;
    }

    private void removeFromTail() {

    }

    private void addNodeToHead(DoublyLinkedListNode<Integer> node) {

    }

    public int get(int key) {
        if(keyToNodeMap.get(key) == null)
            return -1;

        int value = keyToNodeMap.get(key).value;
        removedNode(keyToNodeMap.get(key));
        addNodeToHead(keyToNodeMap.get(key));
        return value;
    }

    public void put(int key, int value) {
        DoublyLinkedListNode<Integer> node = keyToNodeMap.get(key);
        if(node != null) {
            node.value = value;
            removedNode(node);
            addNodeToHead(node);
        } else {
            DoublyLinkedListNode<Integer> newNode = new DoublyLinkedListNode<>();
            if(size == capacity) {
                removeFromTail();
            }
            newNode.value = value;
            keyToNodeMap.put(key, newNode);
            addNodeToHead(newNode);
            size++;
        }
    }
}
