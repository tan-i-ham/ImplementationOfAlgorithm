package com.hannah.datastructure.tree;

public class BinaryTreeApp {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        TreeNode root = new TreeNode(11);
        root.left = new TreeNode(4);
        root.right = new TreeNode(13);
        root.left.left = new TreeNode(15);
        root.right.right = new TreeNode(8);
        binaryTree.root = root;

        binaryTree.inOrderTraversal();
        if (binaryTree.findParent(11) != null) {
            System.out.println(binaryTree.findParent(11).val);
        } else {
            System.out.println("is root node");
        }
        System.out.println(binaryTree.isCousin(4, 13));
        System.out.println(binaryTree.isCousin(15, 8));
    }
}
