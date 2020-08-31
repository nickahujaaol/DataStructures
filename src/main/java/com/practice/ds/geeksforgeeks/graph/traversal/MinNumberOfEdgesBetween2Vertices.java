package com.practice.ds.geeksforgeeks.graph.traversal;

import com.learning.ds.Graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// https://www.geeksforgeeks.org/minimum-number-of-edges-between-two-vertices-of-a-graph/
public class MinNumberOfEdgesBetween2Vertices {
    public static void main(String[] args) {
        Graph graph = createGraph();
        boolean[] visited = new boolean[9];
        int[] distance = new int[9];
        Arrays.fill(distance, Integer.MAX_VALUE);
        int edgesRequired = minNumOfEdges(graph, 0, 5, visited, distance);
        System.out.println(edgesRequired);
    }

    private static int minNumOfEdges(Graph graph, int startVertex, int endVertex, boolean[] visited, int[] distance) {
        distance[startVertex] = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startVertex);
        visited[startVertex] = true;

        while (!queue.isEmpty()) {
            int removedNode = queue.poll();
            visited[removedNode] = true;

            LinkedList<Integer> neighbors = graph.adjacencyList[removedNode];
            for (int i = 0; i < neighbors.size(); i++) {
                int tempNode = neighbors.get(i);
                if (!visited[tempNode]) {
                    queue.add(tempNode);
                    distance[tempNode] = Math.min(distance[removedNode] + 1, distance[tempNode]);
                }
            }
        }
        return distance[endVertex];
    }

    private static Graph createGraph() {
        Graph graph = new Graph(9);

        graph.addEdge(0, 1);
        graph.addEdge(0, 7);
        graph.addEdge(1, 7);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 5);
        graph.addEdge(2, 8);
        graph.addEdge(3, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);
        graph.addEdge(5, 6);
        graph.addEdge(6, 7);
        graph.addEdge(7, 8);
        return graph;
    }
}
