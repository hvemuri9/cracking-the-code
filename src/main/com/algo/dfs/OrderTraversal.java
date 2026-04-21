package com.algo.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrderTraversal {


    static void main() {
        Node node = new Node(1, new Node(2, new Node(4), new Node(5)), new Node(3, new Node(6), new Node(7)));
        List<Integer> orders = new ArrayList<>();
        preOrderTraversal(node, orders);
        System.out.println(Arrays.toString(orders.toArray()));
        orders = new ArrayList<>();
        inOrderTraversal(node, orders);
        System.out.println(Arrays.toString(orders.toArray()));
        orders = new ArrayList<>();
        postOrderTraversal(node, orders);
        System.out.println(Arrays.toString(orders.toArray()));
    }


    private static void preOrderTraversal(Node root, List<Integer> order) {
        if (root == null) return;

        order.add(root.val);

        preOrderTraversal(root.left, order);
        preOrderTraversal(root.right, order);
    }


    private static void inOrderTraversal(Node root, List<Integer> order) {
        if (root == null) return;

        inOrderTraversal(root.left, order);
        order.add(root.val);
        inOrderTraversal(root.right, order);
    }

    private static void postOrderTraversal(Node root, List<Integer> order) {
        if (root == null) return;

        postOrderTraversal(root.left, order);
        postOrderTraversal(root.right, order);
        order.add(root.val);
    }
}
