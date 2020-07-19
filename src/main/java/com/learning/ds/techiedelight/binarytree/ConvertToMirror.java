package com.learning.ds.techiedelight.binarytree;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;
import org.omg.CORBA.INTERNAL;

// https://www.techiedelight.com/convert-binary-tree-to-its-mirror/
public class ConvertToMirror {
    public static void main(String[] args) {
        TreeNode<Integer> root = createTree();
        TreeNode<Integer> newRoot = new TreeNode<>(root.value);
        convertNew(root, newRoot);
        print(root);
        System.out.println();
        print(newRoot);

        convertInPlace(root);
        System.out.println();
        print(root);
    }

    private static void convertInPlace(TreeNode<Integer> node) {
        if(node == null) return;

        TreeNode<Integer> tempNode = node.left;
        node.left = node.right;
        node.right = tempNode;
        convertInPlace(node.left);
        convertInPlace(node.right);
    }

    private static void convertNew(TreeNode<Integer> node, TreeNode<Integer> newNode) {
        if(node == null) return;

        if(node.left != null) {
            newNode.right = new TreeNode<>(node.left.value);
            convertNew(node.left, newNode.right);
        }
        if(node.right != null) {
            newNode.left = new TreeNode<>(node.right.value);
            convertNew(node.right, newNode.left);
        }
    }

    private static void print(TreeNode<Integer> node) {
        if(node == null) return;
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
