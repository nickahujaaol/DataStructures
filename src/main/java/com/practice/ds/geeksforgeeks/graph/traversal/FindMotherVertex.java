package com.practice.ds.geeksforgeeks.graph.traversal;

import com.learning.ds.Graph;

// https://www.geeksforgeeks.org/find-a-mother-vertex-in-a-graph/
public class FindMotherVertex {
    public static void main(String[] args) {
        boolean[] visited = new boolean[7];
        Graph graph = createGraph();
        findMother(graph, visited);
    }

    private static void findMother(Graph graph, boolean[] visited) {

    }

    private static void dfs(Graph graph, int vertex, boolean[] visited) {

    }

    private static Graph createGraph() {
        Graph graph = new Graph(7);
        graph.addEdge(0,1);
        //graph.addEdge(0,2);
        graph.addEdge(1,3);
        //graph.addEdge(2,1);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(2,5);
        graph.addEdge(3,4);
        graph.addEdge(4,6);
        graph.addEdge(5,6);
        return graph;
    }
}
