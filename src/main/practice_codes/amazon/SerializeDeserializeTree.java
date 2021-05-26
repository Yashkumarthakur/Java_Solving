package practice_codes.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static java.lang.System.*;

/**
 * Serialization is to store a tree in an array so,
 * that it can be later restored and Deserialization is reading tree back from the array.
 * <p>
 * Note: The structure of tree must be maintained.
 * <p>
 * Input:
 * 1
 * /   \
 * 2     3
 * Output: 2 1 3
 * Example 2:
 * <p>
 * Input:
 * 10
 * /    \
 * 20    30
 * /   \
 * 40  60
 * Output: 40 20 60 10 30
 * <p>
 * <p>
 * Time Complexity: O(N).
 * Space Complexity: O(N).
 */
public class SerializeDeserializeTree {

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
        root.right.right = child4;
        root.right.right.right = child5;
        root.right.right.left = child6;

        callForSerializeTree(root);
        callForDeSerializeTree(new ArrayList<>((Arrays.asList(1, 2, 4, -1, -1, -1, 3, -1, 5, 7, -1, -1, 6, -1, -1))));
    }

    protected static List<Integer> callForSerializeTree(TreeNode root) {
        displayTree(root, "Given");
        List<Integer> result = new ArrayList<>();
        serializeTree(root, result);
        displayList(result, "Serialized tree");
        return result;
    }

    protected static TreeNode callForDeSerializeTree(List<Integer> nodeList) {
        displayList(nodeList, "Deserialize tree");
        TreeNode root = deSerializeTree(nodeList, null);
        displayTree(root, "Result");
        return root;
    }

    private static void serializeTree(TreeNode node, List<Integer> result) {
        if (node == null) {
            result.add(-1);
            return;
        }
        result.add(node.data);
        serializeTree(node.left, result);
        serializeTree(node.right, result);
    }

    private static TreeNode deSerializeTree(List<Integer> nodeList, TreeNode node) {
        if (nodeList.isEmpty())
            return node;
        if (nodeList.get(0) == -1) {
            nodeList.remove(0);
            return node;
        }
        if (node == null) {
            node = new TreeNode(nodeList.get(0));
            nodeList.remove(0);
        }

        node.left = deSerializeTree(nodeList, node.left);
        node.right = deSerializeTree(nodeList, node.right);
        return node;
    }

    private static void displayList(List<Integer> result, String operationName) {
        out.println(operationName + " is : " + result.toString());
    }


    private static void displayTree(TreeNode root, String operation) {
        out.println(operation + " tree is : " + root);
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
            return "TreeNode{ \n" +
                    "data=" + data +
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
