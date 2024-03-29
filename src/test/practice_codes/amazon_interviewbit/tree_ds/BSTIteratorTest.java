package practice_codes.amazon_interviewbit.tree_ds;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BSTIteratorTest {
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

        BSTIterator iteratorTest = new BSTIterator(root);

        Assertions.assertEquals(root, iteratorTest.next());
        Assertions.assertEquals(3, iteratorTest.size());
        assertTrue(iteratorTest.hasNext());
        Assertions.assertEquals(child1, iteratorTest.next());
        Assertions.assertEquals(3, iteratorTest.size());
        assertTrue(iteratorTest.hasNext());
        Assertions.assertEquals(child3, iteratorTest.next());
        Assertions.assertEquals(3, iteratorTest.size());
        assertTrue(iteratorTest.hasNext());
        Assertions.assertEquals(child4, iteratorTest.next());
        Assertions.assertEquals(3, iteratorTest.size());
        assertTrue(iteratorTest.hasNext());
        Assertions.assertEquals(child2, iteratorTest.next());
        Assertions.assertEquals(2, iteratorTest.size());
        assertTrue(iteratorTest.hasNext());
        Assertions.assertEquals(child5, iteratorTest.next());
        Assertions.assertEquals(1, iteratorTest.size());
        assertTrue(iteratorTest.hasNext());
        Assertions.assertEquals(child6, iteratorTest.next());
        assertFalse(iteratorTest.hasNext());
    }

}