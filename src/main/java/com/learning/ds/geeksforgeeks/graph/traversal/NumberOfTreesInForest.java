package com.learning.ds.geeksforgeeks.graph.traversal;

import com.learning.ds.Graph;

import java.util.LinkedList;

// https://www.geeksforgeeks.org/count-number-trees-forest/
public class NumberOfTreesInForest {
    public static void main(String[] args) {
        boolean visited[] = new boolean[5];
        int numOfTrees = 0;
        for (int i = 0; i < 5; i++) {
            if (!visited[i]) {
                numOfTrees++;
                dfs(createGraph(), i, visited);
            }
        }
        System.out.println("Number of Trees: " + numOfTrees);
    }

    private static void dfs(Graph graph, int vertex, boolean[] visited) {
        visited[vertex] = true;
        LinkedList<Integer> neighbors = graph.adjacencyList[vertex];
        for (int i = 0; i < neighbors.size(); i++) {
            int tempVertex = neighbors.get(i);
            if (!visited[tempVertex]) {
                visited[tempVertex] = true;
                dfs(graph, tempVertex, visited);
            }
        }
    }

    private static Graph createGraph() {
        Graph g = new Graph(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(3, 4);
        return g;
    }
}
