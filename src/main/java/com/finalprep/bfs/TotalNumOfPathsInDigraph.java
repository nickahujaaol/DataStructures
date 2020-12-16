package com.finalprep.bfs;

import com.learning.ds.Graph;

// https://www.techiedelight.com/total-paths-in-digraph-from-source-to-destination-m-edges/
// I am no considering edges here
public class TotalNumOfPathsInDigraph {
    public static void main(String[] args) {
        findMinWithoutCountingEges(createGraph(), 3);
        findMinWithCountingEdges(createGraph(), 3, 4);
    }

    private static void findMinWithCountingEdges(Graph graph, int target, int numOfEdges) {

    }

    private static void findMinWithoutCountingEges(Graph graph, int target) {

    }

    private static Graph createGraph() {
        Graph g = new Graph(8);
        g.addEdge(0, 6);
        g.addEdge(0, 1);
        g.addEdge(1, 6);
        g.addEdge(1, 5);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(5, 2);
        g.addEdge(5, 3);
        g.addEdge(5, 4);
        g.addEdge(6, 5);
        g.addEdge(7, 6);
        g.addEdge(7, 1);

        return g;
    }

    public static class Node {
        int vertex, depth;

        public Node(int vertex, int depth) {
            this.vertex = vertex;
            this.depth = depth;
        }
    }
}
