package practice_codes.amazon_interviewbit.linked_list;


import java.util.Arrays;

/**
 * Rotate List
 * Asked in:
 * Amazon
 * Given a list, rotate the list to the right by k places, where k is non-negative.
 *
 * For example:
 *
 * Given 1,2,3,4,5,NULL and k = 2,
 * return 4,5,1,2,3,NULL.
 *
 *
 */
public class RotateListByK {
    public static void main(String[] args) {
        LLNode node1 = new LLNode(1);
        LLNode node2 = new LLNode(2);
        LLNode node3 = new LLNode(3);
        LLNode node4 = new LLNode(4);
        LLNode node5 = new LLNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        LLNode head = LLNode.addNodes(
                Arrays.asList(16 , 41 , 3 , 46 , 73 , 7 , 38 , 13 , 24 , 62 , 37 , 65));
        int rotateBy = 86;

        callForSwapNodes(head, rotateBy);
    }

    private static LLNode callForSwapNodes(LLNode head, int rotateBy) {
        System.out.println("Given input: " + head);
        System.out.println("Rotate By: " + rotateBy);
        LLNode result = rotateNodes(head, rotateBy);
        System.out.println("Result : " + result);
        return result;
    }

    private static LLNode rotateNodes(LLNode head, int rotateBy) {
        if(head == null || rotateBy == 0 || head.next == null) return head;
        LLNode result = new LLNode(0);
        result.next = head;

        LLNode temp = head;
        LLNode kThNode = head;
        int tempRotate = rotateBy;
        int nodeSize = 1;

        while (temp.next != null){
            nodeSize ++;
            temp = temp.next;
            if (tempRotate == 0){
                kThNode = kThNode.next;
            }
            if(tempRotate != 0) {
                tempRotate--;
            }
        }

        if(tempRotate != 0){
            int rotate = nodeSize - (rotateBy % nodeSize) ;
            if(rotate == 0 || rotate == nodeSize) return  result.next;
            while (rotate != 1){
                kThNode = kThNode.next;
                rotate--;
            }
        }

        temp.next = head;
        result.next = kThNode.next;
        kThNode.next = null;

        return result.next;
    }

    /*private static LLNode rotateNodes(LLNode head, int rotateBy) {
        if (head == null || head.next == null || rotateBy == 0) return head;
        int llSize = 1;
        int tempRotate = rotateBy -1;

        LLNode result = new LLNode(0); // For start node.
        result.next = head;

        LLNode dummy = head; // dummy will go last
        LLNode dummyAtK = head; // will go to target node

        while (dummy.next != null) {
            if (tempRotate != 0) {
                tempRotate--;
            }
            if (tempRotate == 0) {
                dummyAtK = dummyAtK.next;
            }
            dummy = dummy.next;
            llSize++;
        }

        if (tempRotate != 0) {
            int rotate = llSize - (rotateBy % llSize);
            if (rotate == 0 || rotate == llSize) return result.next;
            while (rotate > 1){
                dummyAtK = dummyAtK.next;
                rotate--;
            }
        }

        dummy.next = head;
        result.next = dummyAtK.next;
        dummyAtK.next = null;
        return result.next;
    }*/
}

// ip: 16 , 41 , 3 , 46 , 73 , 7 , 38 , 13 , 24 , 62 , 37 , 65 = 86
// 37 , 65 , 16 , 41 , 3 , 46 , 73 , 7 , 38 , 13 , 24 , 62


//ip 50 , 65 , 97 , 15 , 93 , 33 , 6 , 51 , 43 , 5 , 95 , 9 , 2 , 68 , 89 , 67 , 49 , 74 , 72 , 34 , 80 , 87 , 79 , 96 , 99 , 4 , 8 , 98 , 64 , 26 = 9
//87 -> 79 -> 96 -> 99 -> 4 -> 8 -> 98 -> 64 -> 26 -> 50 -> 65 -> 97 -> 15 -> 93 -> 33 -> 6 -> 51 -> 43 -> 5 -> 95 -> 9 -> 2 -> 68 -> 89 -> 67 -> 49 -> 74 -> 72 -> 34 -> 80