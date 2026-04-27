package com.algo.trees.dfs;

public class DiameterBT {

    static void main() {

    }

    private static int diameter(Node root) {
        if (root == null) return 0;

        int leftD = diameter(root.left);
        int rightD = diameter(root.right);

        return 1 + Math.max(leftD, rightD);
    }
}
