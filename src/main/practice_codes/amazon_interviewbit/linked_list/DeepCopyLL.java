package practice_codes.amazon_interviewbit.linked_list;

import java.util.HashMap;

class DeepCopyLL {
    /// Test Program.
    public static void main(String[] args) {
        LLNode node3 = new LLNode(3, null, null);
        LLNode node2 = new LLNode(2, node3, null);
        LLNode node1 = new LLNode(1, node2, node3);
        LLNode head = new LLNode(0, node1, node2);

        callForDeepCopy(head);
    }

    private static synchronized void callForDeepCopy(LLNode head) {
        System.out.println("Original linked list: " + head);
        LLNode result = deepCopyRandom(head);
        System.out.println("Copied linked list :" + result);
    }

    public static LLNode deepCopyRandom(LLNode head) {
        if (head == null) return null;

        HashMap<LLNode, LLNode> map = new HashMap<>();
        LLNode oldListPointer = head;
        LLNode newHead = null;
        LLNode newRandom = null;


        // create copy of the linked list, recording the corresponding
        // nodes in hashmap without updating arbitrary pointer
        while (oldListPointer != null) {
            LLNode newNode = new LLNode(oldListPointer.data);

            // copy the old arbitrary pointer in the new node
            newNode.random = oldListPointer.random;

            if (newRandom != null) {
                newRandom.next = newNode;
            } else {
                newHead = newNode;
            }

            map.put(oldListPointer, newNode);
            newRandom = newNode;
            oldListPointer = oldListPointer.next;
        }
        LLNode newListPointer = newHead;

        // updating random
        while (newListPointer != null) {
            if (newListPointer.random != null) {
                newListPointer.random = map.get(newListPointer.random);
            }
            newListPointer = newListPointer.next;
        }

        return newHead;
    }
}
