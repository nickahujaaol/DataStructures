package com.practice.ds.geeksforgeeks.graph.traversal;

import com.learning.ds.GraphNode;

import java.util.List;

public class DFSRecursive {
    public static void main(String[] args) {
        dfs(GraphNode.createGraph());
    }

    private static void dfs(GraphNode<Integer> node) {
        if (!node.visited) {
            node.visited = true;
            System.out.print(" " + node.value);
        }

        List<GraphNode<Integer>> neighbours = node.getNeighbours();
        for (int i = 0; i < neighbours.size(); i++) {
            if (!neighbours.get(i).visited) {
                dfs(neighbours.get(i));
            }
        }
    }
}
