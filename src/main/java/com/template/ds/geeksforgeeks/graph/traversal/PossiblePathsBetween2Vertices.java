package com.template.ds.geeksforgeeks.graph.traversal;

import com.learning.ds.Graph;

// https://www.geeksforgeeks.org/count-possible-paths-two-vertices/
public class PossiblePathsBetween2Vertices {
    public static void main(String[] args) {
        int minMumOfPaths = findPaths(createGraph(), 0, 1, 0);
        System.out.println(minMumOfPaths);
    }

    private static int findPaths(Graph graph, int startVertex, int endVertex, int numOfPaths) {
        return 0;
    }

    private static Graph createGraph() {
        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(1, 3);
        g.addEdge(2, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 4);
        return g;
    }
}
