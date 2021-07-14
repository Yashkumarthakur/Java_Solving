package practice_codes.amazon_interviewbit.linked_list;

import java.util.Arrays;

/**
 * Reorder List
 * Asked in:
 * Amazon
 * Microsoft
 * Given a singly linked list
 *
 *     L: L0 → L1 → … → Ln-1 → Ln,
 * reorder it to:
 *
 *     L0 → Ln → L1 → Ln-1 → L2 → Ln-2 → …
 * You must do this in-place without altering the nodes’ values.
 *
 * For example,
 * Given {1,2,3,4}, reorder it to {1,4,2,3}.
 *
 *
 */
public class ReorderList {
    public static void main(String[] args) {
        LLNode head = LLNode.addNodes(Arrays.asList(1, 2, 3, 4, 5, 6));
        callForReorderList(head);
    }

    private static void callForReorderList(LLNode head) {
        System.out.println("Given list is : " + head);
//        LLNode result = reorderList(head);
        LLNode result = reorder(head);
        System.out.println("Result is : " + result);
    }

    private static LLNode reorderList(LLNode head) {
        if (head == null || head.next == null) return head;

        LLNode result = head;
        LLNode slow = head;
        LLNode fast = head.next;

        while (fast != null || fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }


        return result.next;
    }

    static LLNode reorder(LLNode result) {
        if (result == null || result.next == null) return result;

        //Finding the middle point
        LLNode slowPointer = result;
        LLNode fastPointer = slowPointer.next;

        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        //Spliting the linked list
        LLNode fList = result;
        LLNode sList = slowPointer.next;
        slowPointer.next = null; // Break the slow pointer list.

        //Reverse the second half
        sList = reverselist(sList);

        //Merge alternate nodes
        result = new LLNode(0);
        LLNode curr = result;
        while (fList != null || sList != null) {

            if (fList != null) {
                curr.next = fList;
                curr = curr.next;
                fList = fList.next;
            }

            if (sList != null) {
                curr.next = sList;
                curr = curr.next;
                sList = sList.next;
            }
        }
        return result.next;
    }

    static LLNode reverselist(LLNode head) {
        LLNode prev = null;
        LLNode curr = head;
        LLNode next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }

}
