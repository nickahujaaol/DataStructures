package com.learning.ds.geeksforgeeks.graph.traversal;

import com.learning.ds.Graph;

import java.util.Arrays;
import java.util.LinkedList;

// https://www.geeksforgeeks.org/find-a-mother-vertex-in-a-graph/
public class FindMotherVertex {
    public static void main(String[] args) {
        boolean[] visited = new boolean[7];
        Graph graph = createGraph();
        findMother(graph, visited);
    }

    private static void findMother(Graph graph, boolean[] visited) {
        int lastRunDfsForVertex = -1;
        for (int i = 0; i < visited.length; i++) {
            if(!visited[i]) {
                dfs(graph, i, visited);
                lastRunDfsForVertex = i;
            }
        }

        // Now check lastRunDfsForVertex indeed is the mother vertex
        // Set the boolean flags to false and call dfs.
        Arrays.fill(visited, false);
        dfs(graph, lastRunDfsForVertex, visited);

        boolean isMotherVertex = true;
        for(int i = 0; i < visited.length; i++) {
            if(!visited[i]) {
                isMotherVertex = false;
            }
        }

        if(isMotherVertex) {
            System.out.println("Found Mother index at: " + lastRunDfsForVertex);
        } else {
            System.out.println("No mother index found...");
        }
    }

    private static void dfs(Graph graph, int vertex, boolean[] visited) {
        visited[vertex] = true;
        LinkedList<Integer> neighbours = graph.adjacencyList[vertex];
        for(int i = 0; i < neighbours.size(); i++) {
            if(!visited[neighbours.get(i)]) {
                dfs(graph, neighbours.get(i), visited);
            }
        }
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
