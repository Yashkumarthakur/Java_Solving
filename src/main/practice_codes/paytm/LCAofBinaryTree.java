package practice_codes.paytm;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.*;

/**
 * Given a binary tree (not a binary search tree) and two values say n1 and n2.
 * write a program to find the least common ancestor.
 */


// A Binary Tree node
class Node {
    int data;
    Node left;
    Node right;

    Node(int value) {
        data = value;
        left = right = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}

class LCAofBinaryTree {

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        out.println("LCA(4, 5): " + findLCA(4, 5, root));
        out.println("LCA(4, 6): " + findLCA(4, 6, root));
        out.println("LCA(3, 4): " + findLCA(3, 4, root));
        out.println("LCA(2, 4): " + findLCA(2, 4, root));
    }


    // Finds the path from root node to given root of the tree.
    static int findLCA(int n1, int n2, Node root) {
        out.println("Given Tree is : " + root.toString());
        return findLCAInternal(root, n1, n2);
    }

    private static int findLCAInternal(Node root, int n1, int n2) {
        List<Integer> path1 = new ArrayList<>();
        List<Integer> path2 = new ArrayList<>();

        if (!findPath(root, n1, path1) || !findPath(root, n2, path2)) {
            err.println(path1.isEmpty() ? "n1 is present" : "n1 is missing");
            err.println(path2.isEmpty() ? "n2 is present" : "n2 is missing");
            return -1;
        }

        int i;
        for (i = 0; i < path1.size() && i < path2.size(); i++) {
            if (!path1.get(i).equals(path2.get(i)))
                break;
        }

        return path1.get(i - 1);
    }


    private static boolean findPath(Node root, int n, List<Integer> path) {
        if (root == null)
            return false;

        path.add(root.data);

        if (root.data == n)
            return true;

        if (findPath(root.left, n, path))
            return true;

        if (findPath(root.right, n, path))
            return true;

        path.remove(path.size() - 1);
        return false;
    }
}
