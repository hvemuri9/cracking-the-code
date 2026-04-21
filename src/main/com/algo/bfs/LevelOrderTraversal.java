package com.algo.bfs;

import java.util.*;

public class LevelOrderTraversal {

    public static void main(String[] args) {
        Node node = new Node(1, new Node(2, new Node(4), new Node(5)), new Node(3));
        levelOrderTraversal(node).stream().map(list -> Arrays.toString(list.toArray())).forEach(System.out::print);
    }

    private static List<List<Integer>> levelOrderTraversal(Node root) {
        if (root == null) return null;

        List<List<Integer>> result = new ArrayList<>();

        Deque<Node> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            for (int i = 0; i < size; i++) {

                Node node = queue.pop();
                currentLevel.add(node.val);

                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            result.add(currentLevel);
        }
        return result;
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
