package practice_codes.amazon_interviewbit.linked_list;


import java.util.Arrays;

/**
 * Given a singly linked list and an integer K, reverses the nodes of the
 *
 * list K at a time and returns modified linked list.
 *
 *  NOTE : The length of the list is divisible by K
 * Example :
 *
 * Given linked list 1 -> 2 -> 3 -> 4 -> 5 -> 6 and K=2,
 *
 * You should return 2 -> 1 -> 4 -> 3 -> 6 -> 5
 *
 * Try to solve the problem using constant extra space.
 *
 *
 */
public class KReverseLinkedList {
    public static void main(String[] args) {
        LLNode head = LLNode.addNodes(Arrays.asList(1, 2, 3, 4, 5, 6));
        int rotateBy = 2;
        callForKReverseLinkedList(head, rotateBy);
    }

    protected static LLNode callForKReverseLinkedList(LLNode head, int rotateBy) {
        System.out.println("Given List is :" + head);
        System.out.println("Rotate by : " + rotateBy);
        LLNode result = kReverseLinkedList(head, rotateBy);
        System.out.println("Result is : " + result);
        return result;
    }

    private static LLNode kReverseLinkedList(LLNode head, int k) {
        if (head == null || head.next == null || k < 1) return head;

        LLNode current = head;
        LLNode next = null;
        LLNode prev = null;

        int count = 0;

        /* Reverse first k nodes of linked list */
        while (count < k && current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        /* next is now a pointer to (k+1)th node
           Recursively call for the list starting from
           current. And make rest of the list as next of
           first node */
        if (next != null)
            head.next = kReverseLinkedList(next, k);

        // prev is now head of input list
        return prev;
    }
}
