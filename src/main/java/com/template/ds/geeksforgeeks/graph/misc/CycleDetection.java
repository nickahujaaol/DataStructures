package com.template.ds.geeksforgeeks.graph.misc;

import com.learning.ds.Graph;

// https://www.geeksforgeeks.org/detect-cycle-in-a-graph/

/**
 * Use DFS(Depth-First Search) to detect the back edge
 *
 * Do the DFS from each vertex
 * For DFS from each vertex, keep track of visiting vertices in a recursion stack (array).
 * If you encounter a vertex which already present in recursion stack then we have found a cycle.
 * Use visited[] for DFS to keep track of already visited vertices.
 * How different is recursion stack[] from visitied [].
 *
 * Visited[] is used to keep track of already visited vertices during the DFS is never gets
 * Recursion stack[] is used from keep track of visiting vertices during DFS from particular vertex and
 * gets reset once cycle is not found from that vertex and will try DFS from other vertices.
 */
public class CycleDetection {
    public static void main(String[] args) {
        boolean[] visited = new boolean[4];


    }

    private static boolean detectCycle(Graph graph, int vertex, boolean[] visited, boolean[] currentDfsStack) {

        return false;
    }

    private static Graph createGraph() {
        Graph graph = new Graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        return graph;
    }
}
