package practice_codes.amazon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class SerializeDeserializeTreeTest {
    @Test
    void bestCase() {
        SerializeDeserializeTree.TreeNode root = new SerializeDeserializeTree.TreeNode(1);
        SerializeDeserializeTree.TreeNode child1 = new SerializeDeserializeTree.TreeNode(2);
        SerializeDeserializeTree.TreeNode child2 = new SerializeDeserializeTree.TreeNode(3);
        SerializeDeserializeTree.TreeNode child3 = new SerializeDeserializeTree.TreeNode(4);
        SerializeDeserializeTree.TreeNode child4 = new SerializeDeserializeTree.TreeNode(5);
        SerializeDeserializeTree.TreeNode child5 = new SerializeDeserializeTree.TreeNode(6);
        SerializeDeserializeTree.TreeNode child6 = new SerializeDeserializeTree.TreeNode(7);

        root.left = child1;
        root.right = child2;
        root.left.left = child3;
        root.right.right = child4;
        root.right.right.right = child5;
        root.right.right.left = child6;
        Assertions.assertEquals(Arrays.asList(1, 2, 4, -1, -1, -1, 3, -1, 5, 7, -1, -1, 6, -1, -1), SerializeDeserializeTree.callForSerializeTree(root));

        Assertions.assertEquals(root, SerializeDeserializeTree.callForDeSerializeTree(new ArrayList<>((Arrays.asList(1, 2, 4, -1, -1, -1, 3, -1, 5, 7, -1, -1, 6, -1, -1)))));

    }

}