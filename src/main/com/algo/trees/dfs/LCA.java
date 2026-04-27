package com.algo.trees.dfs;

public class LCA {

    /**
     * For BT
     *
     * @param root
     * @param p
     * @param q
     * @return
     */
    private Node lowestCommonAncestor(Node root, Node p, Node q) {

        if (root == null || root.val == p.val || root.val == q.val) {
            return root;
        }

        Node leftNode = lowestCommonAncestor(root.left, p, q);
        Node rightNode = lowestCommonAncestor(root.right, p, q);

        if (leftNode != null && rightNode != null) {
            return root;
        }

        return leftNode != null ? leftNode : rightNode;
    }


    /**
     * For BST
     *
     * @param root
     * @param p
     * @param q
     * @return
     */
    private Node lowestCommonAncestor(Node root, int p, int q) {
        if (root == null) return root;

        Node current = root;

        while (current != null) {
            if (p < current.val && q < current.val) {
                current = current.left;
            } else if (p > current.val && q > current.val) {
                current = current.right;
            } else {
                return current;
            }
        }
        return current;
    }

}
