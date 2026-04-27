package com.algo.trees.dfs;

public class InvertTree {

    static void main() {
        Node p = new Node(1, new Node(2, new Node(4), new Node(5)), new Node(3, new Node(6), new Node(7)));
        invertTree(p);
        preOrderTraversal(p);
    }

    private static void invertTree(Node node) {
        if (node == null) {
            return;
        }

        Node temp = node.left;
        node.left = node.right;
        node.right = temp;
        invertTree(node.left);
        invertTree(node.right);
    }

    private static void preOrderTraversal(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.val);
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }


}
