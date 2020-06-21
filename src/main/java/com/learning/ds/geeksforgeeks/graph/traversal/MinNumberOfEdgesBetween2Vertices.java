package com.learning.ds.geeksforgeeks.graph.traversal;

import com.learning.ds.Graph;

import java.util.LinkedList;
import java.util.Queue;

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
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startVertex);
        distance[startVertex] = 0;
        visited[startVertex] = true;

        while (!queue.isEmpty()) {
            int currVertex = queue.remove();

            LinkedList<Integer> neighbors = graph.adjacencyList[currVertex];
            for(int i = 0; i < neighbors.size(); i++) {
                int tempVertex = neighbors.get(i);
                if(!visited[tempVertex]) {
                    queue.add(tempVertex);
                    distance[tempVertex] = distance[currVertex] + 1;
                    visited[tempVertex] = true;
                }
            }
        }

        return distance[endVertex];
    }


    private static void minNumOfEdgesUsingLevels(Graph graph, int startVertex, int endVertex, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startVertex);
        int numOfEdges = 0;
        visited[startVertex] = true;
        boolean isFound = false;

        while (!queue.isEmpty()) {
            int verticesAtLevel = queue.size();
            for(int i = 0; i < verticesAtLevel; i++) {
                int currVertex = queue.remove();
                LinkedList<Integer> neighbors = graph.adjacencyList[currVertex];

                for (int j = 0; j < neighbors.size(); j++) {
                    int tempVertex = neighbors.get(j);
                    if (tempVertex == endVertex && !isFound) {
                        System.out.println("--------" + numOfEdges);
                        isFound = true;
                        break;
                    } else {
                        if (!visited[tempVertex]) {
                            visited[tempVertex] = true;
                            queue.add(tempVertex);
                        }
                    }
                }
            }
            numOfEdges++;
        }

    }

    private static void bfs(Graph graph, boolean[] visited) {

    }

    private static Graph createGraph() {
        Graph graph = new Graph(9);

        graph.addEdge(0, 1);
        graph.addEdge( 0, 7);
        graph.addEdge( 1, 7);
        graph.addEdge( 1, 2);
        graph.addEdge( 2, 3);
        graph.addEdge( 2, 5);
        graph.addEdge( 2, 8);
        graph.addEdge( 3, 4);
        graph.addEdge( 3, 5);
        graph.addEdge( 4, 5);
        graph.addEdge( 5, 6);
        graph.addEdge( 6, 7);
        graph.addEdge( 7, 8);
        return graph;
    }
}
