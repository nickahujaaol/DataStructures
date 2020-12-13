package com.practice.ds.techiedelight.binarytree;

import apple.laf.JRSUIUtils;
import com.learning.ds.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

// https://www.techiedelight.com/convert-binary-tree-to-its-mirror/
public class ConvertToMirror {
    public static void main(String[] args) {
        TreeNode<Integer> root = createTree();
        print(root);
        System.out.println();

        convertInPlace(root);
        System.out.println();
        print(root);
    }

    private static void convertInPlace(TreeNode<Integer> node) {
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            int qSize = queue.size();

            for(int i = 0; i < qSize; i++) {
                TreeNode<Integer> removedNOde = queue.poll();
                if (removedNOde.left != null || removedNOde.right != null) {
                    TreeNode<Integer> tempNode = removedNOde.left;
                    removedNOde.left = removedNOde.right;
                    removedNOde.right = tempNode;
                }

                if (removedNOde.left != null)
                    queue.add(removedNOde.left);

                if (removedNOde.right != null)
                    queue.add(removedNOde.right);
            }
        }
    }


    private static void print(TreeNode<Integer> node) {
        if (node == null) return;
        System.out.print(" " + node.value);
        print(node.left);
        print(node.right);
    }

    private static TreeNode<Integer> createTree() {
        TreeNode<Integer> root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        return root;
    }
}
