package com.algo.dfs;

public class MaxPathSum {


    static void main() {
        Node node = new Node(1, new Node(2), new Node(3, new Node(4), new Node(5)));
        System.out.println(maxPathSum(node));

    }


    private static int maxPathSum(Node root) {

        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return root.val;
        }

        int left = maxPathSum(root.left);
        int right = maxPathSum(root.right);

        return Math.max(Math.max(left, right) + root.val, left + root.val + right);

    }


}
