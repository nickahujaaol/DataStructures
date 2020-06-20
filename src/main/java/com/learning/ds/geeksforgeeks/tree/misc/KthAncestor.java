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

        findAncestor(binaryTree.root, 16, 4);
    }

    private static int findAncestor(TreeNode<Integer> node, int nodeValue, int kthAncestor) {
        if(node == null)
            return -1;

        if(node.value == nodeValue) {
            return 1;
        }

        int leftFound = findAncestor(node.left, nodeValue, kthAncestor);
        if(leftFound > 0) {
            if((leftFound + 1) == kthAncestor) {
                System.out.println("Value is " + node.value);
            }
            return leftFound + 1;
        }
        int rightFound = findAncestor(node.right, nodeValue, kthAncestor);
        if(rightFound > 0) {
            if((rightFound + 1) == kthAncestor) {
                System.out.println("Value is " + node.value);
            }
            return rightFound + 1;
        }
        return -1;
    }
}
