package com.practice.ds.geeksforgeeks.graph.traversal;

import com.learning.ds.GraphNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DFSIterative {
    public static void main(String[] args) {
        dfs(GraphNode.createGraph());
    }

    private static void dfs(GraphNode<Integer> node) {
        if(node == null)
            return;
        Queue<GraphNode<Integer>> queue = new LinkedList<GraphNode<Integer>>();
        queue.add(node);
        node.visited = true;

        while (!queue.isEmpty()) {
            GraphNode<Integer> tempNode = queue.poll();
            System.out.print(" " + tempNode.value);

            List<GraphNode<Integer>> neighbors = tempNode.getNeighbours();
            for(GraphNode<Integer> neighBorNode : neighbors) {
                if(!neighBorNode.visited) {
                    queue.add(neighBorNode);
                    neighBorNode.visited = true;
                }
            }
        }
    }
}
