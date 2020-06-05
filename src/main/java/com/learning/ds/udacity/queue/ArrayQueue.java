package com.learning.ds.udacity.queue;

import java.util.Arrays;

public class ArrayQueue {
	private int[] queue = null;
	private int frontIndex = 0;
	private int nextIndex = 0;
	private int size = 0;

	public ArrayQueue(int capacity) {
		queue = new int[capacity];
	}

	public void enqueue(int value) {
		if(!isFull()) {
			queue[nextIndex++] = value;
			if(nextIndex == queue.length) {
				nextIndex = 0;
			}

			size++;
		} else {
			System.out.println("Queue is full...");
		}
	}

	public int dequeue() {
		if(!isEmpty()) {
			int retValue = queue[frontIndex++];
			if(frontIndex == queue.length) {
				frontIndex = 0;
			}
			size--;
			return retValue;
		}
		return -1;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0 ? true : false;
	}

	public boolean isFull() {
		return size == queue.length ? true : false;
	}

	public String toString() {
		return Arrays.toString(queue);
	}

	public static void main(String[] args) {
		ArrayQueue q = new ArrayQueue(10);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(7);
		q.enqueue(8);
		q.enqueue(9);
		q.enqueue(10);

		System.out.println(q);
	}
}
