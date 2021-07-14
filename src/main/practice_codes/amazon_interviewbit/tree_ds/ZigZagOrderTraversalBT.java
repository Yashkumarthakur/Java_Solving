package practice_codes.amazon_interviewbit.tree_ds;

import java.util.*;

import static java.lang.System.*;

/**
 *ZigZag Level Order Traversal BT
 * Asked in:
 * Amazon
 * Microsoft
 * Given a binary tree, return the zigzag level order traversal of its nodes’ values.
 * (ie, from left to right, then right to left for the next level and alternate between).
 *
 * Example :
 * Given binary tree
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return
 *
 * [
 *          [3],
 *          [20, 9],
 *          [15, 7]
 * ]
 *
 *
 *
 */


public class ZigZagOrderTraversalBT {
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(1);
        TreeNode<Integer> child1 = new TreeNode<>(2);
        TreeNode<Integer> child2 = new TreeNode<>(3);
        TreeNode<Integer> child3 = new TreeNode<>(4);
        TreeNode<Integer> child4 = new TreeNode<>(5);
        TreeNode<Integer> child5 = new TreeNode<>(6);
        TreeNode<Integer> child6 = new TreeNode<>(7);

        root.left = child1;
        root.right = child2;
        root.left.left = child3;
        root.left.right = child4;
        root.right.left = child5;
        root.right.right = child6;

        callForCreateZigZagOrder(root);
    }

    protected static ArrayList<ArrayList<Integer>> callForCreateZigZagOrder(TreeNode<Integer> root) {
        out.println("Given Tree is : " + root);
        ArrayList<ArrayList<Integer>> result = createZigZagOrder(root);
        out.println("result is :" + result);
        return result;
    }

    private static ArrayList<ArrayList<Integer>> createZigZagOrder(TreeNode<Integer> root) {
        Queue<TreeNode<Integer>> q = new LinkedList<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        boolean flag = true;
        q.add(root);
        while (!q.isEmpty()) {
            ArrayList<Integer> temp = new ArrayList<>();
            int sizeQ = q.size();
            while (sizeQ > 0) {
                TreeNode<Integer> tempElement = q.poll();
                if (tempElement == null)
                    break;
                temp.add(tempElement.data);
                sizeQ--;
                if (tempElement.left != null) q.add(tempElement.left);
                if (tempElement.right != null) q.add(tempElement.right);
            }
            if (flag) {
                result.add(temp);
                flag = false;
            } else {
                result.add(reverseElement(temp));
                flag = true;
            }
        }
        return result;
    }

    private static ArrayList<Integer> reverseElement(ArrayList<Integer> input) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = input.size() - 1; i >= 0; i--) {
            temp.add(input.get(i));
        }
        return temp;
    }
}
