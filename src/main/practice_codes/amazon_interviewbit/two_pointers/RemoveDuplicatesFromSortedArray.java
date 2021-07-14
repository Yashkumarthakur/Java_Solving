package practice_codes.amazon_interviewbit.two_pointers;


import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.System.*;

/**
 * Remove Duplicates from Sorted Array
 * Asked in: United Healthgroup, Amazon, Google, Microsoft, Expedia.
 *
 * Remove duplicates from Sorted Array
 * Given a sorted array, remove the duplicates in place such that each element appears only once and return the new length.
 *
 * Note that even though we want you to return the new length, make sure to change the original array as well in place
 *
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 *
 *  Example:
 * Given input array A = [1,1,2],
 * Your function should return length = 2, and A is now [1,2].
 *
 */
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3));
        callForRemoveDuplicates(input);
    }

    protected static int callForRemoveDuplicates(ArrayList<Integer> input) {
        out.println("Given Array : " + input);
        int result = removeDuplicates1(input);
        out.println("New length of array is : " + result);
        return result;

    }

    private static int removeDuplicates(ArrayList<Integer> inputs) {
        if (inputs.isEmpty())
            return 0;
        if (inputs.size() == 1)
            return inputs.size();
        int pointer = 1;
        while (pointer < inputs.size()) {
            if (inputs.get(pointer - 1).equals(inputs.get(pointer))) {
                inputs.remove(pointer);
            } else {
                pointer++;
            }
        }
        return inputs.size();
    }

    private static int removeDuplicates1(ArrayList<Integer> inputs) {
        if (inputs.isEmpty())
            return 0;
        if (inputs.size() == 1)
            return inputs.size();
        for (int i =0;i < inputs.size()-1 ; i ++ ){
            if (inputs.get(i).equals(inputs.get(i+1))){
                inputs.remove(i+1);
                i--;
            }
        }
        return inputs.size();
    }
}
