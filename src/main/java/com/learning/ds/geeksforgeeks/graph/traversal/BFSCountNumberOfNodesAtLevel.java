package com.learning.ds.geeksforgeeks.graph.traversal;

import com.learning.ds.GraphNode;

import java.util.HashMap;
import java.util.LinkedList;
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

        HashMap<Integer, Integer> levelMap = new HashMap<>();
        int lastLevel = 1;
        levelMap.put(1, 1);
        node.visited = true;

        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            int levelCount = 0;
            for (int i = 0; i < queueSize; i++) {
                GraphNode<Integer> removedNode = queue.remove();

                for (int j = 0; j < removedNode.getNeighbours().size(); j++) {
                    GraphNode<Integer> tempNode = removedNode.getNeighbours().get(j);
                    if (!tempNode.visited) {
                        tempNode.visited = true;
                        queue.add(removedNode.getNeighbours().get(j));
                        levelCount++;
                    }
                }
            }
            if (levelCount > 0)
                levelMap.put(++lastLevel, levelCount);
        }

        System.out.println(levelMap);
    }
}
