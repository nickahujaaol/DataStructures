package com.learning.ds.geeksforgeeks.graph.misc;

import com.learning.ds.Graph;

import java.util.LinkedList;

// https://www.geeksforgeeks.org/detect-cycle-in-a-graph/
public class CycleDetection {
    public static void main(String[] args) {
        boolean[] visited = new boolean[4];

        for(int i = 0; i < 4; i++) {
            // Select a vertex and keep a track of all the nodes visited from his vertex.
            // If we encounter that there was a node already visited then we have a cycle.
            boolean[] currentDfsStack = new boolean[4];
            if(!visited[i]) {
                detectCycle(createGraph(), 0, visited, currentDfsStack);
            }
        }

    }

    private static void detectCycle(Graph graph, int vertex, boolean[] visited, boolean[] currentDfsStack) {
        if(currentDfsStack[vertex]) {
            System.out.println("Cycle is detected for vertex: " + vertex);
            return;
        }

        visited[vertex] = true;
        currentDfsStack[vertex] = true;

        LinkedList<Integer> neighbors = graph.adjacencyList[vertex];
        for(int i = 0; i < neighbors.size(); i++) {
            int tempVertex = neighbors.get(i);
            detectCycle(graph, tempVertex, visited, currentDfsStack);
        }
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
