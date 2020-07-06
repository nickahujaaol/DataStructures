package com.learning.ds.techiedelight.dfs;

import com.learning.ds.Graph;

import java.util.LinkedList;

//https://www.techiedelight.com/arrival-departure-time-vertices-dfs/
public class ArrivalAndDepartureTimes {
    public static void main(String[] args) {
        Graph graph = createGraph();
        boolean[] visited = new boolean[8];
        int[] arrivalTimes = new int[8];
        int[] departureTimes = new int[8];

        int time = -1;
        for(int i = 0; i < 8; i++) {
            if(!visited[i]) {
                time = findTimes(graph, i, arrivalTimes, departureTimes, visited, time);
            }
        }

        for(int i = 0; i < 8; i++) {
            System.out.println("" + i + " : (" + arrivalTimes[i]+", "+ departureTimes[i]+")");
        }
    }

    private static int findTimes(Graph graph, int vertex,
                                  int[] arrivalTimes, int[] departureTimes, boolean[] visited, int time) {
        visited[vertex] = true;
        arrivalTimes[vertex] = ++time;

        LinkedList<Integer> neighbors = graph.adjacencyList[vertex];
        for(int i = 0; i < neighbors.size(); i++) {
            int tempVertex = neighbors.get(i);
            if(!visited[tempVertex]) {
                time = findTimes(graph, tempVertex, arrivalTimes, departureTimes, visited, time);
            }
        }

        departureTimes[vertex] = ++time;
        return time;
    }

    private static Graph createGraph() {
        Graph g = new Graph(8);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(2,3);
        g.addEdge(2,4);
        g.addEdge(3,1);
        g.addEdge(3,5);
        g.addEdge(4,5);
        g.addEdge(6,7);

        return g;
    }
}