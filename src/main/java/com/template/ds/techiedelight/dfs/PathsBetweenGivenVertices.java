package com.template.ds.techiedelight.dfs;

import com.learning.ds.Graph;

//https://www.techiedelight.com/find-path-between-vertices-directed-graph/
public class PathsBetweenGivenVertices {

    public static void main(String[] args) {
        boolean[] visited = new boolean[8];
        findPaths(createGraph(), 0, 7, new StringBuilder(), visited);
    }

    private static void findPaths(Graph graph, int vertex, int endVertex, StringBuilder builder, boolean[] visited) {

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
