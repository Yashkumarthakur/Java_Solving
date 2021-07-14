package practice_codes.amazon_interviewbit.tree_ds;


import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

import static java.lang.System.*;

/**
 * Given a binary tree
 *
 *     struct TreeLinkNode {
 *       TreeLinkNode *left;
 *       TreeLinkNode *right;
 *       TreeLinkNode *next;
 *     }
 * Populate each next pointer to point to its next right node.
 * If there is no next right node, the next pointer should be set to NULL.
 *
 * Initially, all next pointers are set to NULL.
 *
 *  Note:
 * You may only use constant extra space.
 *
 * Example :
 * Given the following binary tree,
 *
 *          1
 *        /  \
 *       2    3
 *      / \  / \
 *     4  5  6  7
 * After calling your function, the tree should look like:
 *
 *          1 -> NULL
 *        /  \
 *       2 -> 3 -> NULL
 *      / \  / \
 *     4->5->6->7 -> NULL
 *  Note 1: that using recursion has memory overhead and does not qualify for constant space.
 * Note 2: The tree need not be a perfect binary tree.
 *
 *
 *
 */
public class NextRightPointerTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode child1 = new TreeNode(2);
        TreeNode child2 = new TreeNode(3);
        TreeNode child3 = new TreeNode(4);
        TreeNode child4 = new TreeNode(5);
        TreeNode child5 = new TreeNode(6);
        TreeNode child6 = new TreeNode(7);

        root.left = child1;
        root.right = child2;
        root.left.left = child3;
        root.left.right = child4;
        root.right.left = child5;
        root.right.right = child6;

        callForAddNextPointer(root);
    }

    protected static void callForAddNextPointer(TreeNode root) {
        out.println("Given tree is :"+ root);
        root = addNextPointer(root);
        out.println("Result is : " + root);
    }

    private static TreeNode addNextPointer(TreeNode root) {
        if(root == null) return null;
        Queue<TreeNode> q = new LinkedList<>(); /// Initialize a queue which contains only root of the tree
        q.add(root);
        while(!q.isEmpty()){ //iterates over each level
            int size = q.size(); // size of the queue
            for(int i = 0; i < size; i++){ // Iterate over all the nodes on the current level
                TreeNode current = q.poll();
                if(i < size-1)
                    current.next = q.peek();
                //add children to the queue
                if(current.left != null) q.add(current.left);
                if(current.right != null) q.add(current.right);
            }
        }
        return root;
    }

    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode next;

        public TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
            this.next = null;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "\ndata=" + data +
                    ", left=" + left +
                    ", right=" + right +
                    ", next=" + next +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TreeNode treeNode = (TreeNode) o;
            return data == treeNode.data && Objects.equals(left, treeNode.left) && Objects.equals(right, treeNode.right) && Objects.equals(next, treeNode.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(data, left, right, next);
        }
    }

}
