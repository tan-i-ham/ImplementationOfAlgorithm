package com.hannah.datastructure.tree;

import com.hannah.datastructure.common.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BinaryTree {
    TreeNode root;

    public List<Integer> preOrderTraversal() {
        List<Integer> traversalResult = new ArrayList<>();
        preOrderHelper(root, traversalResult);
        System.out.println(traversalResult);
        return traversalResult;
    }

    // recursive
    public void preOrderHelper(TreeNode node, List<Integer> traversalResult) {

        if (node == null) {
            return;
        }
        traversalResult.add(node.val);
        preOrderHelper(node.left, traversalResult);
        preOrderHelper(node.right, traversalResult);
    }

    public List<Integer> inOrderTraversal() {
        List<Integer> traversalResult = new ArrayList<>();
        inOrderHelper(root, traversalResult);
        System.out.println(traversalResult);
        return traversalResult;
    }

    // recursive
    public void inOrderHelper(TreeNode node, List<Integer> traversalResult) {
        if (node == null) {
            return;
        }
        inOrderHelper(node.left, traversalResult);
        traversalResult.add(node.val);
        inOrderHelper(node.right, traversalResult);
    }

    public List<Integer> postOrderTraversal() {
        List<Integer> traversalResult = new ArrayList<>();
        postOrderHelper(root, traversalResult);
        System.out.println(traversalResult);
        return traversalResult;
    }

    // recursive
    public void postOrderHelper(TreeNode node, List<Integer> traversalResult) {
        if (node == null) {
            return;
        }
        postOrderHelper(node.left, traversalResult);
        postOrderHelper(node.right, traversalResult);
        traversalResult.add(node.val);
    }

    public TreeNode findParent(int value) {
        Map<Integer, TreeNode> parentMap = new HashMap<>();
        dfs(root, null, parentMap);

        return parentMap.get(value);
    }

    public void dfs(TreeNode node, TreeNode parentNode, Map<Integer, TreeNode> parentMap) {
        if (node != null) {
            parentMap.put(node.val, parentNode);
            dfs(node.left, node, parentMap);
            dfs(node.right, node, parentMap);
        }
    }

    public boolean isCousin(int x, int y) {
        Map<Integer, TreeNode> parentMap = new HashMap<>();
        Map<Integer, Integer> depthMap = new HashMap<>();

        dfs2(root, null, parentMap, depthMap);

        return depthMap.get(x) == depthMap.get(y) && parentMap.get(x) != parentMap.get(y);
    }

    public void dfs2(TreeNode node, TreeNode parentNode, Map<Integer, TreeNode> parentMap, Map<Integer, Integer> depthMap) {
        if (node != null) {
            depthMap.put(node.val, parentNode != null ? 1 + depthMap.get(parentNode.val) : 0);
            parentMap.put(node.val, parentNode);
            dfs2(node.left, node, parentMap, depthMap);
            dfs2(node.right, node, parentMap, depthMap);
        }
    }

    public boolean isSibling(int x, int y) {
        return false;
    }
}