package com.template.ds.geeksforgeeks.graph.traversal;

import com.learning.ds.GraphNode;

// https://www.geeksforgeeks.org/count-number-nodes-given-level-using-bfs/
public class BFSCountNumberOfNodesAtLevel {
    public static void main(String[] args) {
        countNodes(GraphNode.createGraph());
    }

    /*
        When you increase the level count, mark it as visited so that it is not counted again.
        Consider a neighbour that can be reached from multiple nodes.
     */
    private static void countNodes(GraphNode<Integer> node) {

    }
}
