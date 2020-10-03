package com.practice.ds.geeksforgeeks.graph.traversal;

import com.learning.ds.GraphNode;

import java.util.List;

public class DFSRecursive {
    public static void main(String[] args) {
        dfs(GraphNode.createGraph());
    }

    private static void dfs(GraphNode<Integer> node) {
        if(node == null)
            return;

        System.out.print(" " + node.value);
        node.visited = true;
        List<GraphNode<Integer>> neighbours = node.getNeighbours();

        for(GraphNode<Integer> neighborNode : neighbours) {
            if(!neighborNode.visited)
                dfs(neighborNode);
        }
    }
}
