package practice_codes.amazon_interviewbit.tree_ds;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.*;

/**
 *BST Iterator
 * Asked in:
 * Apple
 * Amazon
 * Facebook
 * Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.
 *
 * The first call to next() will return the smallest number in BST.
 * Calling next() again will return the next smallest number in the BST, and so on.
 *
 *  Note: next() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of the tree.
 * Try to optimize the additional space complexity apart from the amortized time complexity.
 *
 *  NOTE: You only need to implement the given function. Do not read input,
 *  instead use the arguments to the function. Do not print the output, instead return values as specified.
 *
 *
 */

public class BSTIterator {
    int heightOfTree;
    List<TreeNode> listOfTreeNode;
    private final TreeNode root;
    private boolean flag;

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

        BSTIterator iterator = new BSTIterator(root);

        while (iterator.hasNext()) {
            out.println("result :" + iterator.next());
            out.println("Size of iterator : " + iterator.size());
        }
    }

    /**
     * Constructor !
     *
     * @param root : root of tree.
     */
    BSTIterator(TreeNode root) {
        this.root = root;
        this.heightOfTree = calculateHeight(root);
        this.listOfTreeNode = new ArrayList<>(this.heightOfTree);
        this.flag = true;
        this.listOfTreeNode = addElements(listOfTreeNode, root, null, heightOfTree);
    }

    /**
     * Returns size of iterator.
     * @return : size of iterator.
     */
    protected int size() {
        return this.listOfTreeNode.size();
    }

    /**
     * Add the elements from tree to iterator.
     *
     * @param listOfTreeNode : list of TreeNode
     * @param root : root of tree.
     * @param treeNode : last element of tree.
     * @param heightOfTree : height of tree
     * @return : return list of TreeNode.
     */
    private List<TreeNode> addElements(List<TreeNode> listOfTreeNode, TreeNode root, TreeNode treeNode, int heightOfTree) {
        if (root == null || listOfTreeNode.size() == heightOfTree)
            return listOfTreeNode;
        if (root == treeNode) {
            this.flag = true;
        }
        if (listOfTreeNode.size() < heightOfTree && this.flag && !root.equals(treeNode)) {
            listOfTreeNode.add(root);
        }
        addElements(listOfTreeNode, root.left, treeNode, heightOfTree);
        addElements(listOfTreeNode, root.right, treeNode, heightOfTree);
        return listOfTreeNode;
    }

    /**
     * Calculate right of tree
     *
     * @param root : root of tree.
     * @return : return height of tree.
     */
    private int calculateHeight(TreeNode root) {
        if (root == null)
            return 0;

        int max = Math.max(calculateHeight(root.left), calculateHeight(root.right));
        return (max + 1);
    }

    /**
     * next(), to print next element and remove the element from list.
     *
     * @return : next element.
     */
    protected TreeNode next() {
        if (!hasNext()) {
            return new TreeNode(-1);
        }
        TreeNode temp = this.listOfTreeNode.remove(0);
        this.flag = false;
        if (listOfTreeNode.isEmpty()) {
            addElements(this.listOfTreeNode, this.root, null, this.heightOfTree);
        } else {
            addElements(this.listOfTreeNode, this.root, this.listOfTreeNode.get(listOfTreeNode.size() - 1), this.heightOfTree);
        }
        return temp;
    }

    /**
     * return true is next element is available otherwise false.
     *
     * @return : boolean true or false.
     */
    protected boolean hasNext() {
        return this.listOfTreeNode != null && !this.listOfTreeNode.isEmpty();
    }
}
