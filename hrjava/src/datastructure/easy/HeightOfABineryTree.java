package datastructure.easy;

public class HeightOfABineryTree {

    class Node {

        int data;
        Node left;
        Node right;
    }

    static int height(Node root) {
        if(root == null)
            return 0;

        if(root.left == null && root.right == null)
            return 0;

        return 1 + Math.max(height(root.left), height(root.right));
    }
}
