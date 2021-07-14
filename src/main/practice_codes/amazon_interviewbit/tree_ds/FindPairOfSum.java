package practice_codes.amazon_interviewbit.tree_ds;

import java.util.HashSet;

public class FindPairOfSum {
    static HashSet<Integer> h = new HashSet<>();
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(0);
        TreeNode<Integer> child = new TreeNode<>(1);
        TreeNode<Integer> child1 = new TreeNode<>(5);
        TreeNode<Integer> child2 = new TreeNode<>(6);
        TreeNode<Integer> child3 = new TreeNode<>(8);
        TreeNode<Integer> child4 = new TreeNode<>(4);

        root.left = child;
        root.right = child1;
        root.left.right = child2;
        root.right.left = child3;
        root.left.left= child4;

        int sum = 13;
        callForFirPairWithSum(root,sum);
    }

    protected static boolean callForFirPairWithSum(TreeNode<Integer> root, int sum) {
        System.out.println("Given input data : " + root);
        System.out.println("Given Sum is :" + sum);
        boolean result = isPairFound(root, sum);
        System.out.println(result ? "Pair Found !" : "Pair not found !");
        return result;
    }

    private static boolean isPairFound(TreeNode<Integer> root, int sum) {
        if (root == null) return false;

        if (h.contains(sum - root.data)) {
            System.out.println("Pair is :" + (sum - root.data) + " , " + root.data);
            return true;
        } else {
            h.add(root.data);
        }

        boolean lResult = isPairFound(root.left, sum);
        boolean rResult = isPairFound(root.right, sum);
        return lResult || rResult;
    }
}
