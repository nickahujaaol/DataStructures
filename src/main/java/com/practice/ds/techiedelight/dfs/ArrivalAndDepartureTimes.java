package com.practice.ds.techiedelight.dfs;

import com.learning.ds.GraphNode;
import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.List;

//https://www.techiedelight.com/arrival-departure-time-vertices-dfs/
public class ArrivalAndDepartureTimes {
    public static void main(String[] args) {
        List<GraphNode<Integer>> nodesList = new ArrayList<>();
        int startTime = 0;
        GraphNode<Integer> startNode = createGraph(nodesList);
        findTimes(startNode, 0);
    }

    private static int findTimes(GraphNode<Integer> node, int time) {
        if(node == null)
            return time;

        node.visited = true;
        List<GraphNode<Integer>> neighbors = node.neighbours;
        int startTime = time;
        int endTime = time;
        for(GraphNode<Integer> neighborNode : neighbors) {
            if(!neighborNode.visited) {
                endTime = findTimes(neighborNode, endTime + 1);
            }
        }
        System.out.println("Node: " + node.value + "(" + startTime + ", " + (endTime + 1) + ")");
        return endTime + 1;
    }


    private static GraphNode<Integer> createGraph(List<GraphNode<Integer>> nodesList) {
        GraphNode<Integer> node0 = new GraphNode<>(0);
        GraphNode<Integer> node1 = new GraphNode<>(1);
        GraphNode<Integer> node2 = new GraphNode<>(2);
        GraphNode<Integer> node3 = new GraphNode<>(3);
        GraphNode<Integer> node4 = new GraphNode<>(4);
        GraphNode<Integer> node5 = new GraphNode<>(5);
        GraphNode<Integer> node6 = new GraphNode<>(6);
        GraphNode<Integer> node7 = new GraphNode<>(7);

        node0.addNeighbours(node1);
        node0.addNeighbours(node2);
        node2.addNeighbours(node3);
        node2.addNeighbours(node4);
        node3.addNeighbours(node1);
        node3.addNeighbours(node5);
        node4.addNeighbours(node5);

        node6.addNeighbours(node7);

        nodesList.add(node0);
        nodesList.add(node1);
        nodesList.add(node2);
        nodesList.add(node3);
        nodesList.add(node4);
        nodesList.add(node5);
        nodesList.add(node6);
        nodesList.add(node7);

        return node0;
    }
}
