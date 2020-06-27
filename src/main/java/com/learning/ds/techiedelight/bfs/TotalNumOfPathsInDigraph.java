package com.learning.ds.techiedelight.bfs;

import com.learning.ds.Graph;

import java.util.LinkedList;
import java.util.Queue;

// https://www.techiedelight.com/total-paths-in-digraph-from-source-to-destination-m-edges/
// I am no considering edges here
public class TotalNumOfPathsInDigraph {
    public static void main(String[] args) {
        findMinWithoutCountingEges(createGraph(), 3);
        findMinWithCountingEdges(createGraph(), 3, 4);
    }

    private static void findMinWithCountingEdges(Graph graph, int target, int numOfEdges) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(0, 0));
        int minNumberOfPaths = 0;

        while (!queue.isEmpty()) {
            Node removedVertex = queue.remove();
            if(removedVertex.vertex == target && removedVertex.depth == numOfEdges) {
                minNumberOfPaths++;
            }
            LinkedList<Integer> neighbors = graph.adjacencyList[removedVertex.vertex];
            for(int i = 0; i < neighbors.size(); i++) {
                queue.add(new Node(neighbors.get(i), removedVertex.depth + 1));
            }
        }

        System.out.println("Min number of Paths with given edges are: " + minNumberOfPaths);
    }

    private static void findMinWithoutCountingEges(Graph graph, int target) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        int minNumberOfPaths = 0;

        while (!queue.isEmpty()) {
            int removedVertex = queue.remove();
            if(removedVertex == target) {
                minNumberOfPaths++;
            }
            LinkedList<Integer> neighbors = graph.adjacencyList[removedVertex];
            for(int i = 0; i < neighbors.size(); i++) {
                queue.add(neighbors.get(i));
            }
        }

        System.out.println("Min number of Paths are: " + minNumberOfPaths);
    }
    private static Graph createGraph() {
        Graph g = new Graph(8);
        g.addEdge(0,6);
        g.addEdge(0,1);
        g.addEdge(1,6);
        g.addEdge(1,5);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,4);
        g.addEdge(5,2);
        g.addEdge(5,3);
        g.addEdge(5,4);
        g.addEdge(6,5);
        g.addEdge(7,6);
        g.addEdge(7,1);

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
