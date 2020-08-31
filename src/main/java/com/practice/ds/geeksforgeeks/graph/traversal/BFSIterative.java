package com.practice.ds.geeksforgeeks.graph.traversal;

import com.learning.ds.GraphNode;

import java.util.LinkedList;
import java.util.Queue;

public class BFSIterative {
    public static void main(String[] args) {
        bfs(GraphNode.createGraph());
    }

    private static void bfs(GraphNode<Integer> node) {
        Queue<GraphNode<Integer>> queue = new LinkedList<GraphNode<Integer>>();
        queue.add(node);

        while (!queue.isEmpty()) {
            GraphNode<Integer> removedNode = queue.remove();
            if (removedNode != null && !removedNode.visited) {
                removedNode.visited = true;
                System.out.print(" " + removedNode.value);
            }

            for (int i = 0; i < removedNode.getNeighbours().size(); i++) {
                GraphNode<Integer> tempNode = removedNode.getNeighbours().get(i);
                if (!tempNode.visited) {
                    queue.add(removedNode.getNeighbours().get(i));
                }
            }
        }
    }
}
