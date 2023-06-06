import java.util.ArrayList;

/**
 *                  1
 *              |       |
 *              2       3
 *                     |    |
 *                     4    5
 *                   |
 *                  6
 */


public class TreeTest {
    static class TreeNode {
        int data;
        TreeNode right;
        TreeNode left;

        TreeNode(int data) {
            this.data = data;
            right = null;
            left = null;
        }
    }

    public static void main(String[] args) {
        ArrayList obj = new ArrayList();
        System.out.println(50/9);
        if ( 0 == 0){
            return;
        }
//        for (;i<5;i++)
        TreeNode a = new TreeNode(1);
        a.left = new TreeNode(2);
        a.right = new TreeNode(3);
        a.right.left = new TreeNode(4);
        a.right.right  = new TreeNode(5);
        a.right.left.left= new TreeNode(6);

        System.out.println("Pre order");
        TreeTest.preOrderPrint(a);
        System.out.println("In order");
        TreeTest.inOrderPrint(a);
        System.out.println("Post order");
        TreeTest.postOrderPrint(a);
    }

    private static void postOrderPrint(TreeNode a) {
        if (a == null)
            return;
        postOrderPrint(a.left);
        postOrderPrint(a.right);
        System.out.println(a.data);
    }

    private static void inOrderPrint(TreeNode a) {
        if (a == null)
            return;
        inOrderPrint(a.left);
        System.out.println(a.data);
        inOrderPrint(a.right);
    }

    private static void preOrderPrint(TreeNode a) {
        if (a == null)
            return;
        System.out.println(a.data);
        preOrderPrint(a.left);
        preOrderPrint(a.right);
    }
}
