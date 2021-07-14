package practice_codes.amazon_interviewbit.linked_list;


import java.util.Arrays;

/**
 * Add Two Numbers as Lists
 * Asked in:
 * Amazon
 * Qualcomm
 * Microsoft
 * Facebook
 * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 *
 *     342 + 465 = 807
 * Make sure there are no trailing zeros in the output list
 * So, 7 -> 0 -> 8 -> 0 is not a valid response even though the value is still 807.
 *
 *
 */
public class AddTwoNumbersAsLists {
    public static void main(String[] args) {
        LLNode input1 = LLNode.addNodes(Arrays.asList(1,1,9));
        LLNode input2 = LLNode.addNodes(Arrays.asList(0,9));
        callForAddTwoNumbersAsLists(input1,input2);
    }

    protected static LLNode callForAddTwoNumbersAsLists(LLNode input1, LLNode input2) {
        System.out.println("Given 1st input : " + input1);
        System.out.println("Given 2st input : " + input2);
        LLNode result = addTwoNumbersAsLists(input1,input2);
        System.out.println("Result is : " +result);
        return result;
    }

    private static LLNode addTwoNumbersAsLists(LLNode input1, LLNode input2) {
        if (input1 == null) return input2;
        if (input2 == null) return input1;
        LLNode result = new LLNode(0);
        LLNode current = result;
        LLNode pointer1 = input1;
        LLNode pointer2 = input2;
        int carry = 0;

        while (pointer1 != null || pointer2 != null|| carry != 0) {
            int calculateNo = (pointer1 != null ? pointer1.data : 0) + (pointer2 != null ? pointer2.data : 0) + carry;
            if (calculateNo > 9) {
                carry = calculateNo / 10;
                calculateNo = calculateNo % 10;
                current.next = new LLNode(calculateNo);
            } else {
                carry = 0;
                current.next = new LLNode(calculateNo);
            }
            current = current.next;
            pointer1 = pointer1 != null ? pointer1.next : null;
            pointer2 = pointer2 != null ? pointer2.next : null;
        }
        return result.next;
    }
}
