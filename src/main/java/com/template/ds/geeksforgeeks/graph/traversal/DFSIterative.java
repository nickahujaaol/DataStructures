package com.template.ds.geeksforgeeks.graph.traversal;

import com.learning.ds.GraphNode;

import java.util.Stack;

public class DFSIterative {
    public static void main(String[] args) {
        dfs(GraphNode.createGraph());
    }

    private static void dfs(GraphNode<Integer> node) {
        Stack<GraphNode<Integer>> stack = new Stack<>();
        stack.push(node);

        while (!stack.isEmpty()) {
            GraphNode<Integer> removedNode = stack.pop();
            if(removedNode != null && !removedNode.visited) {
                removedNode.visited = true;
                System.out.print(" " + removedNode.value);
            }

            for(int i = 0; i < removedNode.getNeighbours().size(); i++) {
                GraphNode<Integer> tempNode = removedNode.getNeighbours().get(i);
                if(!tempNode.visited) {
                    stack.push(removedNode.getNeighbours().get(i));
                }
            }
        }
    }
}
