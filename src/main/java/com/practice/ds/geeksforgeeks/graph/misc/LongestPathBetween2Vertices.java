package com.practice.ds.geeksforgeeks.graph.misc;

import com.learning.ds.GraphNode;

import java.util.List;

// https://www.geeksforgeeks.org/longest-path-between-any-pair-of-vertices/
// Just read the article
public class LongestPathBetween2Vertices {
    public static void main(String[] args) {
        boolean[] visited = new boolean[6];
        int maxLength = 0;
        // Loop is for illurtation only. Because create graph always return node0 otherwise
        // if we definet eh data structure properly, we should pass each node 1 by 1.
        for(int i = 0; i < 6; i++) {
            int retMaxLength = findLength(createGraph(), visited, 0, 0);
            maxLength = Math.max(retMaxLength, maxLength);
        }
        System.out.println("Max Length: " + maxLength);
    }

    private static int findLength(GraphNode<Integer> node, boolean[] visited, int lengthSoFar, int maxLength) {
        if(visited[node.value] == true) {
            return maxLength;
        }

        List<GraphNode<Integer>> neighbors = node.neighbours;
        for(int i = 0; i < neighbors.size(); i++) {
            GraphNode<Integer> tempNode = neighbors.get(i);
            if(!visited[tempNode.value]) {
                lengthSoFar = node.weightedAdjNodes.get(tempNode) + lengthSoFar;
                maxLength = Math.max(maxLength, lengthSoFar);

                // We ahve to assign the return maxLength because we want to
                //propagate the value returned from lower frame to upper calling frame.
                maxLength = findLength(tempNode, visited, lengthSoFar, maxLength);
                lengthSoFar = lengthSoFar - node.weightedAdjNodes.get(tempNode);
            }
        }

        return maxLength;
     }

    private static GraphNode<Integer> createGraph() {
        GraphNode<Integer> node0 = new GraphNode<>(0);
        GraphNode<Integer> node1 = new GraphNode<>(1);
        GraphNode<Integer> node2 = new GraphNode<>(2);
        GraphNode<Integer> node3 = new GraphNode<>(3);
        GraphNode<Integer> node4 = new GraphNode<>(4);
        GraphNode<Integer> node5 = new GraphNode<>(5);

        node0.addWeightedAdjNode(node1, 3);
        node1.addWeightedAdjNode(node2, 4);
        node1.addWeightedAdjNode(node5, 2);
        node5.addWeightedAdjNode(node3, 6);
        node5.addWeightedAdjNode(node4, 5);

        return node0;
    }
}
