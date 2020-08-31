package com.practice.ds.techiedelight.bfs;


import com.learning.ds.GraphNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// https://www.techiedelight.com/least-cost-path-weighted-digraph-using-bfs/
public class WeightedLeastCostPath {
    public static void main(String[] args) {
        findLeastCost(createGraph(), 3);
    }

    private static void findLeastCost(GraphNode<Integer> node, int target) {
        int leastCost[] = new int[5];
        Arrays.fill(leastCost, Integer.MAX_VALUE);
        leastCost[node.value] = 0;

        Queue<GraphNode<Integer>> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            GraphNode<Integer> removedNode = queue.poll();

            List<GraphNode<Integer>> neighbors = removedNode.neighbours;
            for (int i = 0; i < neighbors.size(); i++) {
                GraphNode<Integer> tempNode = neighbors.get(i);
                leastCost[tempNode.value] = Math.min(leastCost[removedNode.value] + removedNode.weightedAdjNodes.get(tempNode),
                        leastCost[tempNode.value]);
                queue.add(tempNode);
            }
        }

        System.out.println("Least Cost psth is: " + leastCost[target]);
    }


    private static GraphNode<Integer> createGraph() {
        GraphNode<Integer> node0 = new GraphNode<>(0);
        GraphNode<Integer> node1 = new GraphNode<>(1);
        GraphNode<Integer> node2 = new GraphNode<>(2);
        GraphNode<Integer> node3 = new GraphNode<>(3);
        GraphNode<Integer> node4 = new GraphNode<>(4);

        node0.addWeightedAdjNode(node1, 3);
        node0.addWeightedAdjNode(node4, 1);

        node1.addWeightedAdjNode(node4, 1);
        node1.addWeightedAdjNode(node3, 3);
        node1.addWeightedAdjNode(node2, 1);

        node4.addWeightedAdjNode(node2, 2);
        node4.addWeightedAdjNode(node3, 1);

        return node0;
    }
}
