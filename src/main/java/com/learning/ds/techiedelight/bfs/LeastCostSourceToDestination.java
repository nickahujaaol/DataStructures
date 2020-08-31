package com.learning.ds.techiedelight.bfs;

import com.learning.ds.GraphNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// https://www.techiedelight.com/least-cost-path-digraph-source-destination-m-edges/
// Too much work, read the description
public class LeastCostSourceToDestination {
    public static void main(String[] args) {
        findShortestPath(createGraph(), 3);
    }

    private static void findShortestPath(GraphNode<Integer> node, int targetValue) {
        int minCostToReachNode[] = new int[8];
        Arrays.fill(minCostToReachNode, Integer.MAX_VALUE);
        minCostToReachNode[0] = 0; // we are starting from node 0
        Queue<GraphNode<Integer>> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            GraphNode<Integer> removedNode = queue.remove();

            List<GraphNode<Integer>> neighbours = removedNode.neighbours;
            for (int i = 0; i < neighbours.size(); i++) {
                GraphNode<Integer> tempNode = neighbours.get(i);
                minCostToReachNode[tempNode.value] =
                        Math.min(minCostToReachNode[tempNode.value],
                                minCostToReachNode[removedNode.value] + removedNode.weightedAdjNodes.get(tempNode));
                queue.add(neighbours.get(i));
            }
        }

        System.out.println("Shortest Path is : " + minCostToReachNode[targetValue]);
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

        node0.addWeightedAdjNode(node1, 5);
        node0.addWeightedAdjNode(node6, -1);

        node1.addWeightedAdjNode(node2, 7);
        node1.addWeightedAdjNode(node5, 5);
        node1.addWeightedAdjNode(node6, 3);

        node2.addWeightedAdjNode(node3, 8);

        node3.addWeightedAdjNode(node4, 10);

        node5.addWeightedAdjNode(node2, -1);
        node5.addWeightedAdjNode(node3, 9);
        node5.addWeightedAdjNode(node4, 1);

        node6.addWeightedAdjNode(node5, 2);

        node7.addWeightedAdjNode(node1, 6);
        node7.addWeightedAdjNode(node6, 9);

        return node0;
    }
}
