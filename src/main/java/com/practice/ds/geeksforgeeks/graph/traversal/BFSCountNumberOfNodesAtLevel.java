package com.practice.ds.geeksforgeeks.graph.traversal;

import com.learning.ds.GraphNode;

import java.util.*;

// https://www.geeksforgeeks.org/count-number-nodes-given-level-using-bfs/
public class BFSCountNumberOfNodesAtLevel {
    public static void main(String[] args) {
        countNodes(GraphNode.createGraph(), 3);
    }

    /*
        When you increase the level count, mark it as visited so that it is not counted again.
        Consider a neighbour that can be reached from multiple nodes.
     */
    private static void countNodes(GraphNode<Integer> node, int level) {
        Map<GraphNode<Integer>, Integer> nodeToLevelMap = new HashMap();
        Queue<GraphNode<Integer>> queue = new LinkedList<>();
        queue.add(node);
        nodeToLevelMap.putIfAbsent(node, 1);
        int nodesAtGivenLevel = 0;

        while (!queue.isEmpty()) {
            GraphNode<Integer> removedNode = queue.poll();
            int parentLevel = nodeToLevelMap.get(removedNode);
            List<GraphNode<Integer>> neighbors = removedNode.getNeighbours();
            for(int i = 0; i < neighbors.size(); i++) {
                GraphNode<Integer> tempNode = neighbors.get(i);
                if(!tempNode.visited) {
                    if (level == parentLevel + 1) {
                        nodesAtGivenLevel++;
                    }
                    queue.add(tempNode);
                    nodeToLevelMap.put(tempNode, parentLevel + 1);
                    tempNode.visited = true;
                }
            }
        }

        System.out.println("Nodes at given level are: " + nodesAtGivenLevel);

    }
}
