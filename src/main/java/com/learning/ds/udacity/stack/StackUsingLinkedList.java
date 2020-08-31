package com.learning.ds.udacity.stack;

import com.learning.ds.Node;

public class StackUsingLinkedList<T> {
    private Node<T> top;
    private int size = 0;

    public static void main(String[] args) throws Exception {
        StackUsingLinkedList<Integer> stack = new StackUsingLinkedList<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
    }

    public boolean isEmpty() {
        return size == 0 ? true : false;
    }

    public int size() {
        return size;
    }

    public void push(T value) {
        Node<T> newNode = new Node<>(value);
        if (!isEmpty()) {
            newNode.next = top;
        }
        top = newNode;
        size++;
    }

    public T pop() throws Exception {
        if (!isEmpty()) {
            Node<T> topNode = top;
            top = top.next;
            size--;
            return topNode.value;
        } else {
            throw new Exception("Stack is Empty");
        }
    }
}
