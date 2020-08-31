package com.practice.ds.techiedelight.dfs;

import com.learning.ds.Graph;

import java.util.LinkedList;

//https://www.techiedelight.com/arrival-departure-time-vertices-dfs/
public class ArrivalAndDepartureTimes {
    public static void main(String[] args) {
        Graph graph = createGraph();
        boolean[] visited = new boolean[8];

        int time = -1;
        for (int i = 0; i < 8; i++) {
            if (!visited[i]) {
                time = findTimes(graph, i, visited, time + 1);
            }
        }
    }

    private static int findTimes(Graph graph, int vertex, boolean[] visited, int time) {

        visited[vertex] = true;
        int arrivalTime = time;
        LinkedList<Integer> neighbors = graph.adjacencyList[vertex];
        for (int i = 0; i < neighbors.size(); i++) {
            int tempNode = neighbors.get(i);
            if (!visited[tempNode]) {
                time = findTimes(graph, tempNode, visited, time + 1);
            }
        }
        System.out.println("Node: " + vertex + " ( " + arrivalTime + ", " + (time + 1) + ")");
        return time + 1;
    }

    private static Graph createGraph() {
        Graph g = new Graph(8);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(2, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 1);
        g.addEdge(3, 5);
        g.addEdge(4, 5);
        g.addEdge(6, 7);

        return g;
    }
}
