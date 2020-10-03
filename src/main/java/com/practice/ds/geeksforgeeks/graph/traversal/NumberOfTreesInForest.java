package com.practice.ds.geeksforgeeks.graph.traversal;

import com.learning.ds.Graph;

// https://www.geeksforgeeks.org/count-number-trees-forest/
public class NumberOfTreesInForest {
    public static void main(String[] args) {
        boolean visited[] = new boolean[5];
        int numOfTrees = 0;
        Graph graph = createGraph();
        for(int i = 0; i < graph.numOfVertices; i++) {

        }
    }

    private static void dfs(Graph graph, int vertex, boolean[] visited) {

    }

    private static Graph createGraph() {
        Graph g = new Graph(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(3, 4);
        return g;
    }
}
