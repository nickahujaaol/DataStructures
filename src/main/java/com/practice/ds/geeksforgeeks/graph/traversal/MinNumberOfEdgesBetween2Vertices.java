package com.practice.ds.geeksforgeeks.graph.traversal;

import com.learning.ds.Graph;
import com.learning.ds.GraphNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// https://www.geeksforgeeks.org/minimum-number-of-edges-between-two-vertices-of-a-graph/
public class MinNumberOfEdgesBetween2Vertices {
    public static void main(String[] args) {
        boolean[] visited = new boolean[9];
        int[] distance = new int[9];
        int edgesRequired = minNumOfEdges(createGraph(), 0, 5, distance);
        System.out.println(edgesRequired);
    }

    private static int minNumOfEdges(GraphNode<Integer> node, int startVertex, int endVertex, int[] distance) {
        if(node == null)
            return 0;

        Queue<GraphNode<Integer>> queue = new LinkedList<>();
        queue.add(node);
        node.visited = true;
        distance[0] = 0;
        int level = 0;

        while (!queue.isEmpty()) {
            GraphNode<Integer> tempNode = queue.poll();
            List<GraphNode<Integer>> neighbors = tempNode.neighbours;
            for(GraphNode<Integer> neighborNode : neighbors) {
                if(!neighborNode.visited) {
                    queue.add(neighborNode);
                    neighborNode.visited = true;
                    distance[neighborNode.value] = distance[tempNode.value] + 1;
                }
            }
        }
        return distance[endVertex];
    }



    private static GraphNode<Integer> createGraph() {
        GraphNode<Integer> node0 = new GraphNode(0);
        GraphNode<Integer> node1 = new GraphNode(1);
        GraphNode<Integer> node2 = new GraphNode(2);
        GraphNode<Integer> node4 = new GraphNode(4);
        GraphNode<Integer> node3 = new GraphNode(3);
        GraphNode<Integer> node5 = new GraphNode(5);
        GraphNode<Integer> node6 = new GraphNode(6);


        node0.addNeighbours(node1);
        node0.addNeighbours(node2);
        node0.addNeighbours(node4);
        node4.addNeighbours(node3);
        node4.addNeighbours(node5);
        node4.addNeighbours(node6);
        node2.addNeighbours(node5);

        return node0;
    }
}
