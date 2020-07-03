package com.template.ds.techiedelight.bfs;


import com.learning.ds.GraphNode;

// https://www.techiedelight.com/least-cost-path-weighted-digraph-using-bfs/
public class WeightedLeastCostPath {
    public static void main(String[] args) {
        findLeastCost(createGraph(), 2);
    }

    private static void findLeastCost(GraphNode<Integer> node, int target) {

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
