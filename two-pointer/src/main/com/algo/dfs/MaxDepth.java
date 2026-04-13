package com.algo.dfs;

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


    private static class Node {

        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }
}
