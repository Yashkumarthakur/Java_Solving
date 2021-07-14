package practice_codes.amazon_interviewbit.linked_list;


import java.util.Arrays;

/**
 * Merge Two Sorted Lists
 * Asked in:
 * Microsoft
 * Yahoo
 * Amazon
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists, and should also be sorted.
 *
 * For example, given following linked lists :
 *
 *   5 -> 8 -> 20
 *   4 -> 11 -> 15
 * The merged list should be :
 *
 * 4 -> 5 -> 8 -> 11 -> 15 -> 20
 *
 */
public class MergeTwoSortedLists {
    public static void main(String[] args) {
        LLNode input1 = LLNode.addNodes(Arrays.asList(1));
        LLNode input2 = LLNode.addNodes(Arrays.asList(1));
        callForSortList(input1,input2);
    }

    protected static LLNode callForSortList(LLNode input1, LLNode input2) {
        System.out.println("Given input 1 is : " +input1);
        System.out.println("Given input 2 is : " +input2);

        long startTime = System.currentTimeMillis();
        LLNode result = sortList(input1,input2);
        long endTime = System.currentTimeMillis();
        System.out.println("Result is : " + result + " In time :" + (endTime - startTime));

/*        startTime = System.currentTimeMillis();
        LLNode result1 = sortListNewNode(input1,input2);
        endTime = System.currentTimeMillis();
        System.out.println("Result is : " + result1 + " In time :" + (endTime - startTime));*/

        return result;
    }

    private static LLNode sortList(LLNode input1, LLNode input2) {
        if (input1 == null) return input2;
        if (input2 == null) return input1;
        LLNode result = new LLNode(0);
        LLNode current = result;
        LLNode pointer1 = input1;
        LLNode pointer2 = input2;

        while (pointer1 != null || pointer2 != null) {
            if (pointer2 == null || (pointer1 != null && pointer1.data <= pointer2.data)) {
                current.next = pointer1;
                pointer1 = pointer1.next;
                current = current.next;
            }else if (pointer1 == null || (pointer2 != null && pointer2.data <= pointer1.data)) {
                current.next = pointer2;
                pointer2 = pointer2.next;
                current = current.next;
            }
        }
        return result.next;
    }

    private static LLNode sortListNewNode(LLNode input1, LLNode input2) {
        if (input1 == null) return input2;
        if (input2 == null) return input1;
        LLNode result = new LLNode(0);
        LLNode current = result;
        LLNode pointer1 = input1;
        LLNode pointer2 = input2;

        while (input1 != null && input2 != null){
            if(pointer2 == null || pointer1.data < pointer2.data){
                current.next = new LLNode(pointer1.data);
                pointer1 = pointer1.next;
                current = current.next;
            }
            if(pointer1 == null || pointer2.data < pointer1.data){
                current.next = new LLNode(pointer2.data);
                pointer2 = pointer2.next;
                current = current.next;
            }
        }
        return result.next;
    }
}
