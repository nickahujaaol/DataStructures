package com.practice.ds.geeksforgeeks.graph.traversal;

import com.learning.ds.Graph;

import java.util.Arrays;

// https://www.geeksforgeeks.org/transitive-closure-of-a-graph-using-dfs/
public class TransitiveClosure {
    public static void main(String[] args) {
        int[][] transClosure = new int[4][4];
        transitiveClosure(createGraph(), transClosure);

        for(int i = 0; i < transClosure.length; i++) {
            System.out.println(Arrays.toString(transClosure[i]));
        }
    }

    private static void transitiveClosure(Graph graph, int[][] transClosure) {

    }

    private static void dfs(Graph graph, int currVertex, int workingVertex, int[][] transClosure) {

    }

    private static Graph createGraph() {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        return g;
    }
}
