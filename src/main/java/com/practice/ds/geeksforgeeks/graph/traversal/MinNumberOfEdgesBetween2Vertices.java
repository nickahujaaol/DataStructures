package com.practice.ds.geeksforgeeks.graph.traversal;

import com.learning.ds.Graph;

// https://www.geeksforgeeks.org/minimum-number-of-edges-between-two-vertices-of-a-graph/
public class MinNumberOfEdgesBetween2Vertices {
    public static void main(String[] args) {
        Graph graph = createGraph();
        boolean[] visited = new boolean[9];
        int[] distance = new int[9];
        int edgesRequired = minNumOfEdges(graph, 0, 5, visited, distance);
        System.out.println(edgesRequired);
    }

    private static int minNumOfEdges(Graph graph, int startVertex, int endVertex, boolean[] visited, int[] distance) {
        return 0;
    }


    private static void minNumOfEdgesUsingLevels(Graph graph, int startVertex, int endVertex, boolean[] visited) {

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
