package com.practice.ds.techiedelight.dfs;

import com.learning.ds.GraphNode;

import java.util.LinkedList;
import java.util.List;

//https://www.techiedelight.com/find-path-between-vertices-directed-graph/
public class PathsBetweenGivenVertices {

    public static void main(String[] args) {
        boolean[] visited = new boolean[8];
        findPaths(createGraph(), 7, new LinkedList<Integer>());
    }

    private static void findPaths(GraphNode<Integer> node, int endVertex, LinkedList<Integer> pathsList) {
        if(node.visited)
            return;

        pathsList.add(node.value);
        if(node.value == endVertex) {
            System.out.println("Path Exists..." + pathsList.toString());
            return;
        }

        node.visited = true;
        List<GraphNode<Integer>> neighbours = node.getNeighbours();
        for(int i = 0; i < neighbours.size(); i++) {
            findPaths(neighbours.get(i), endVertex, pathsList);
        }
        pathsList.removeLast();
    }

    private static GraphNode<Integer> createGraph() {
        GraphNode<Integer> node0 = new GraphNode<>(0);
        GraphNode<Integer> node1 = new GraphNode<>(1);
        GraphNode<Integer> node2 = new GraphNode<>(2);
        GraphNode<Integer> node3 = new GraphNode<>(3);
        GraphNode<Integer> node4 = new GraphNode<>(4);
        GraphNode<Integer> node5 = new GraphNode<>(5);
        GraphNode<Integer> node6 = new GraphNode<>(6);
        GraphNode<Integer> node7 = new GraphNode<>(7);

        node0.addNeighbours(node3);
        node1.addNeighbours(node0);
        node1.addNeighbours(node2);
        node1.addNeighbours(node4);
        node2.addNeighbours(node7);
        node3.addNeighbours(node4);
        node3.addNeighbours(node5);
        node4.addNeighbours(node3);
        node4.addNeighbours(node6);
        node5.addNeighbours(node6);
        node6.addNeighbours(node7);


        return node0;
    }
}
