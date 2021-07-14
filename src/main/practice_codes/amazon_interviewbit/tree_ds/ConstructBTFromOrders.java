package practice_codes.amazon_interviewbit.tree_ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static java.lang.System.*;

/**
 * Given inorder and postorder traversal of a tree, construct the binary tree.
 * <p>
 * Note: You may assume that duplicates do not exist in the tree.
 * Example :
 * <p>
 * Input :
 * Inorder : [2, 1, 3]
 * Postorder : [2, 3, 1]
 * <p>
 * Return :
 *   1
 *  / \
 * 2   3
 */

public class ConstructBTFromOrders {
    public static void main(String[] args) {
        List<Integer> inOrder = new ArrayList<>(Arrays.asList(2, 1, 3));
        List<Integer> preOrder = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> postOrder = new ArrayList<>(Arrays.asList(2, 3, 1));

        boolean operation = true; // true for inorder with postorder && false for inorder with preOrder.

        callForBuildTree(inOrder, postOrder, operation);
        callForBuildTree(inOrder, preOrder, !operation);
    }

    protected static TreeNode callForBuildTree(List<Integer> inOrder, List<Integer> elementList, boolean flag) {
        out.println("Given inOrder tree is : " + inOrder);
        out.println(flag ? "Given postOrder tree is " + elementList : "Given preOrder tree is" + elementList);
        TreeNode root = buildTree(inOrder, elementList, flag);
        out.println(flag ? "Result of tree by Inorder and Postorder is : " + root : "Result of tree by Inorder and PreOrder is : " + root);
        return root;
    }

    private static TreeNode buildTree(List<Integer> inOrder, List<Integer> elementList, boolean flag) {
        return recursiveCall(null, inOrder, elementList, flag);
    }

    /**
     * in : 2 5 3 6 4
     * pos : 5 2 6 4 3
     * <p>
     * pre : 3 2 5 4 6 ****
     */
    private static TreeNode recursiveCall(TreeNode root, List<Integer> inOrder, List<Integer> elementList, boolean flag) {
        if (elementList.isEmpty() || inOrder.isEmpty()) {
            return root;
        }
        int foundData = 0;

        if (root == null) {
            if (flag) {
                foundData = elementList.get(elementList.size() - 1);
                elementList.remove(elementList.size() - 1);
            } else {
                foundData = elementList.get(0);
                elementList.remove(0);
            }
            if (!inOrder.contains(foundData)) {
                return root;
            }
            root = new TreeNode(foundData);
        }
        if (flag) {
            root.right = recursiveCall(root.right, inOrder.subList(inOrder.indexOf(foundData) + 1, inOrder.size()), elementList, flag);
            root.left = recursiveCall(root.left, inOrder.subList(0, inOrder.indexOf(foundData)), elementList, flag);
        } else {
            root.left = recursiveCall(root.left, inOrder.subList(0, inOrder.indexOf(foundData)), elementList, flag);
            root.right = recursiveCall(root.right, inOrder.subList(inOrder.indexOf(foundData) + 1, inOrder.size()), elementList, flag);
        }
        return root;
    }

    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "\ndata=" + data +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TreeNode treeNode = (TreeNode) o;
            return data == treeNode.data && Objects.equals(left, treeNode.left) && Objects.equals(right, treeNode.right);
        }

        @Override
        public int hashCode() {
            return Objects.hash(data, left, right);
        }
    }
}
