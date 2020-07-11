package com.learning.ds.geeksforgeeks.tree.misc;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

//https://www.geeksforgeeks.org/kth-ancestor-node-binary-tree-set-2/
// SEE THE EXPLANATION ALSO :-)
public class KthAncestor {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = BinaryTree.create();
        binaryTree.root.right.right.right.right = new TreeNode(15);
        binaryTree.root.right.right.right.right.right = new TreeNode(16);

        findAncestor(binaryTree.root, 15, 3);
    }

    private static int findAncestor(TreeNode<Integer> node, int nodeValue, int kthAncestor) {
        if(node == null) return -1;
        if(node.value == nodeValue) {
            return 0;
        }

        int leftFound = findAncestor(node.left, nodeValue, kthAncestor);
        int rightFound = findAncestor(node.right, nodeValue, kthAncestor);
        int value = leftFound != -1 ? leftFound : rightFound != -1 ? rightFound : -1;
        if(value != -1 && value < kthAncestor) {
            if(++value == kthAncestor) {
                System.out.println("Kth Ancestor is: " + node.value);
            }
        }

        return value;
    }
}
