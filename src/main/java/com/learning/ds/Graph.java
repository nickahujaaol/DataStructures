package com.learning.ds;

import java.util.LinkedList;

public class Graph {
    public int numOfVertices;
    public LinkedList<Integer> adjacencyList[] = null;

    public Graph(int numOfVertices) {
        this.numOfVertices = numOfVertices;
        adjacencyList = new LinkedList[numOfVertices];
        for(int i = 0; i < numOfVertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int vertex, int neighbour) {
        adjacencyList[vertex].add(neighbour);
    }
}
