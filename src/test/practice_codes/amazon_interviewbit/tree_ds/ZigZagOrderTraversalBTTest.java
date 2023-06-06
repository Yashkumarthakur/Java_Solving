package practice_codes.amazon_interviewbit.tree_ds;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ZigZagOrderTraversalBTTest {
    @Test
    void bestCase() {
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

        Assertions.assertEquals(ZigZagOrderTraversalBT.callForCreateZigZagOrder(root),ZigZagOrderTraversalBT.callForCreateZigZagOrder(root));
    }
}