package practice_codes.amazon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BSTIteratorTest {
    @Test
    void bestCase() {
        BSTIterator.TreeNode root = new BSTIterator.TreeNode(1);
        BSTIterator.TreeNode child1 = new BSTIterator.TreeNode(2);
        BSTIterator.TreeNode child2 = new BSTIterator.TreeNode(3);
        BSTIterator.TreeNode child3 = new BSTIterator.TreeNode(4);
        BSTIterator.TreeNode child4 = new BSTIterator.TreeNode(5);
        BSTIterator.TreeNode child5 = new BSTIterator.TreeNode(6);
        BSTIterator.TreeNode child6 = new BSTIterator.TreeNode(7);

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