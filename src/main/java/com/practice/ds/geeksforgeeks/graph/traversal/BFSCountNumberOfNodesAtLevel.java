package com.practice.ds.geeksforgeeks.graph.traversal;

import com.learning.ds.GraphNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
        Queue<GraphNode<Integer>> queue = new LinkedList<>();
        queue.add(node);

        //HashMap<Integer, Integer> levelMap = new HashMap<>();

        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            for(int i = 0; i < queueSize; i++) {
                GraphNode<Integer> tempNode = queue.poll();
                System.out.print(" " + tempNode.value);
                List<GraphNode<Integer>> neighbors = tempNode.neighbours;
                for(GraphNode<Integer> neighborNode : neighbors) {
                    if(!neighborNode.visited) {
                        queue.add(neighborNode);
                        neighborNode.visited = true;
                    }
                }
            }
            System.out.println();
        }
    }
}
