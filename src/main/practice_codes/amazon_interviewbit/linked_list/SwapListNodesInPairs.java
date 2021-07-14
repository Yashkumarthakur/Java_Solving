package practice_codes.amazon_interviewbit.linked_list;


import java.util.Arrays;

/**
 * Swap List Nodes in pairs
 * Asked in:
 * Microsoft
 * Amazon
 * Given a linked list, swap every two adjacent nodes and return its head.
 *
 * For example,
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 *
 * Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
 *
 *
 */
public class SwapListNodesInPairs {

    public static void main(String[] args) {
        LLNode head = LLNode.addNodes(Arrays.asList(1,2,3,4,5));
        callForSwapNodes(head);
    }

    private static LLNode callForSwapNodes(LLNode head) {
        System.out.println("Given input: " + head);
        LLNode result = swapNodes(head);
        System.out.println("Result : " + result);
        return result;
    }

    private static LLNode swapNodes(LLNode head) {
        if (head == null || head.next == null) return head;

        LLNode result = new LLNode(0);
        result.next = head;

        LLNode dummy = result;
        while (dummy.next != null && dummy.next.next != null) {
            LLNode first = dummy;
            LLNode second = dummy.next;
            LLNode third = dummy.next.next;

            first.next = third;
            second.next = third.next;
            third.next = second;

            dummy = dummy.next.next;
        }
        return result.next;
    }
}