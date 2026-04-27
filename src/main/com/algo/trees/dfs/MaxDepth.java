package com.algo.trees.dfs;

public class MaxDepth {


    static void main(String[] args) {

        Node node = new Node(1, new Node(2), new Node(3, new Node(4), null));

        System.out.println("MaxDepth is: " + maxDepth(node));
    }


    private static int maxDepth(Node root) {
        if (root == null) return 0;

        int leftVal = 1 + maxDepth(root.left);
        int rightVal = 1 + maxDepth(root.right);

        return Math.max(leftVal, rightVal);
    }
}
