package com.practice.ds.techiedelight.binarytree;

import com.learning.ds.BinaryTree;
import com.learning.ds.LinkedList;
import com.learning.ds.TreeNode;

import java.util.Stack;

//https://www.techiedelight.com/convert-binary-tree-into-doubly-linked-list/
// READ THE EXPLANATION... IT IS GOOD :-)

public class ConvertToListInSpiralOrder {
    public static void main(String[] args) {
        convert(createTree().root);
    }

    private static void convert(TreeNode<Integer> node) {
        Stack<TreeNode<Integer>> left2RightStack = new Stack<>();
        Stack<TreeNode<Integer>> right2LeftStack = new Stack<>();

        right2LeftStack.push(node);
        boolean flag = false;

        while (!right2LeftStack.isEmpty() || !left2RightStack.isEmpty()) {
            if(flag && !left2RightStack.isEmpty()) {
                TreeNode<Integer> tempNode = left2RightStack.pop();
                System.out.println(" "+ tempNode.value);
                if(tempNode.left != null)
                    right2LeftStack.push(tempNode.left);
                if(tempNode.right != null)
                    right2LeftStack.push(tempNode.right);

                if(left2RightStack.isEmpty())
                    flag = !flag;
            } else {
                TreeNode<Integer> tempNode = right2LeftStack.pop();
                System.out.println(" "+ tempNode.value);
                if(tempNode.left != null)
                    left2RightStack.push(tempNode.right);
                if(tempNode.right != null)
                    left2RightStack.push(tempNode.left);

                if(right2LeftStack.isEmpty())
                    flag = !flag;
            }
        }
    }

    private static BinaryTree<Integer> createTree() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();

        TreeNode<Integer> root = new TreeNode(1);
        binaryTree.root = root;

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        return binaryTree;
    }
}
