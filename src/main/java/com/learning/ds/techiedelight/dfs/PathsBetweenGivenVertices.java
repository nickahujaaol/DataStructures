package com.learning.ds.techiedelight.dfs;

import com.learning.ds.Graph;

import java.util.LinkedList;
import java.util.List;

//https://www.techiedelight.com/find-path-between-vertices-directed-graph/
public class PathsBetweenGivenVertices {

    public static void main(String[] args) {
        boolean[] visited = new boolean[8];
        findPaths(createGraph(), 0, 7, new LinkedList<Integer>(), visited);
    }

    private static void findPaths(Graph graph, int vertex, int endVertex, LinkedList<Integer> pathsList, boolean[] visited) {
        pathsList.add(vertex);
        if(vertex == endVertex) {
            System.out.println(pathsList.toString());
            return;
        }
        List<Integer> neighbors = graph.adjacencyList[vertex];
        for(int i = 0; i < neighbors.size(); i++) {
            int tempNode = neighbors.get(i);
            findPaths(graph, tempNode, endVertex, pathsList, visited);
            pathsList.removeLast();
        }
    }

    private static Graph createGraph() {
        Graph g = new Graph(8);
        g.addEdge(0, 3);
        g.addEdge(1, 0);
        g.addEdge(1, 4);
        g.addEdge(2, 7);
        g.addEdge(3, 4);
        g.addEdge(3, 5);
        //g.addEdge(4, 3);
        g.addEdge(4, 6);
        g.addEdge(5, 6);
        g.addEdge(6, 7);

        return g;
    }
}
