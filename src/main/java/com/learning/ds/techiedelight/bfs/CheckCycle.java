package com.learning.ds.techiedelight.bfs;

import com.learning.ds.GraphNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// https://www.techiedelight.com/check-undirected-graph-contains-cycle-not/
public class CheckCycle {
    public static void main(String[] args) {
        GraphNode<Integer> node = createGraph();
        boolean isCyclic = isCyclePresent(node);
        System.out.println("Is Cyclic: " + isCyclic);
    }

    private static boolean isCyclePresent(GraphNode<Integer> node) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(node, null));
        boolean visited[] = new boolean[12];
        visited[0] = true;

        while (!queue.isEmpty()) {
            Node removedNode = queue.poll();
            List<GraphNode<Integer>> neighbors = removedNode.node.getNeighbours();
            for(GraphNode<Integer> neighborNode : neighbors) {
                if(!neighborNode.visited) {
                    neighborNode.visited = true;
                    queue.add(new Node(neighborNode, removedNode.node));
                } else {
                    if(neighborNode != removedNode.parent) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private static class Node {
        public Node(GraphNode<Integer> node, GraphNode<Integer> parent){
            this.node=node;
            this.parent = parent;
        }
        public GraphNode<Integer> node;
        public GraphNode<Integer> parent;
    }


    private static GraphNode<Integer> createGraph() {
        GraphNode<Integer> node1 = new GraphNode<>(1);
        GraphNode<Integer> node2 = new GraphNode<>(2);
        GraphNode<Integer> node3 = new GraphNode<>(3);
        GraphNode<Integer> node4 = new GraphNode<>(4);
        GraphNode<Integer> node5 = new GraphNode<>(5);
        GraphNode<Integer> node6 = new GraphNode<>(6);
        GraphNode<Integer> node7 = new GraphNode<>(7);
        GraphNode<Integer> node8 = new GraphNode<>(8);
        GraphNode<Integer> node9 = new GraphNode<>(9);
        GraphNode<Integer> node10 = new GraphNode<>(10);
        GraphNode<Integer> node11 = new GraphNode<>(11);
        GraphNode<Integer> node12 = new GraphNode<>(12);

        node1.addNeighbours(node2);
        node1.addNeighbours(node3);
        node1.addNeighbours(node4);
        node2.addNeighbours(node5);
        node2.addNeighbours(node6);
        node5.addNeighbours(node9);
        node5.addNeighbours(node10);
        node6.addNeighbours(node10);

        node4.addNeighbours(node7);
        node4.addNeighbours(node8);
        node7.addNeighbours(node11);
        node7.addNeighbours(node12);

        return node1;
    }
}
