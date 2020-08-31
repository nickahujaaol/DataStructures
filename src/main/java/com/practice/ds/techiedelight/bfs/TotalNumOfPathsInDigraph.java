package com.practice.ds.techiedelight.bfs;

import com.learning.ds.Graph;

import java.util.LinkedList;
import java.util.Queue;

// https://www.techiedelight.com/total-paths-in-digraph-from-source-to-destination-m-edges/
// I am no considering edges here
public class TotalNumOfPathsInDigraph {
    public static void main(String[] args) {
        findMinWithCountingEdges(createGraph(), 3, 4);
    }

    private static void findMinWithCountingEdges(Graph graph, int target, int numOfEdges) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(0, 0));
        int numOfPaths = 0;

        while (!queue.isEmpty()) {
            Node removedNode = queue.poll();
            if (removedNode.vertex == target && removedNode.depth == numOfEdges) {
                numOfPaths++;
            }
            LinkedList<Integer> neighbors = graph.adjacencyList[removedNode.vertex];
            for (int i = 0; i < neighbors.size(); i++) {
                int tempNode = neighbors.get(i);
                queue.add(new Node(tempNode, removedNode.depth + 1));
            }
        }

        System.out.println("Number of Paths are: " + numOfPaths);
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
