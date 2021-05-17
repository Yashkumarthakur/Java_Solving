package practice_codes.paytm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LCAofBinaryTreeTest {

    @Test
    void BestCase() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Assertions.assertEquals(1, LCAofBinaryTree.findLCA(4, 6, root));
        Assertions.assertEquals(1, LCAofBinaryTree.findLCA(3, 4, root));
        Assertions.assertEquals(2, LCAofBinaryTree.findLCA(2, 4, root));
    }

    /**
     *                  8
     *             |        |
     *             11       15
     *     |        |       |           |
     *     10       0       90           18
     */
    @Test
    void CornerCase() {
        Node root = new Node(8);
        root.left = new Node(11);
        root.right = new Node(15);
        root.left.left = new Node(10);
        root.left.right = new Node(0);
        root.right.left = new Node(0);
        root.right.right = new Node(18);

        Assertions.assertEquals(11, LCAofBinaryTree.findLCA(10, 0, root));
        Assertions.assertEquals(8, LCAofBinaryTree.findLCA(0, 8, root));
        Assertions.assertEquals(-1, LCAofBinaryTree.findLCA(22, 4, root));
        Assertions.assertEquals(-1, LCAofBinaryTree.findLCA(22, 4, new Node(0)));
    }
}