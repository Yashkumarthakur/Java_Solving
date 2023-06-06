package practice_codes.amazon_interviewbit.two_pointers;


import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.System.*;

/**
 * Remove Element from Array
 * Asked in:
 * Amazon
 * Remove Element
 *
 * Given an array and a value, remove all the instances of that value in the array.
 * Also return the number of elements left in the array after the operation.
 * It does not matter what is left beyond the expected length.
 *
 *  Example:
 * If array A is [4, 1, 1, 2, 1, 3]
 * and value elem is 1,
 * then new length is 3, and A is now [4, 2, 3]
 * Try to do it in less than linear additional space complexity.
 *
 */
public class RemoveElementFromArray {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList( 2, 2, 0, 3, 2, 1, 0, 1, 2, 1, 3, 0, 2, 1, 3, 0, 3, 0, 1, 3, 2, 1, 2, 1, 1, 3, 3, 2, 0, 2, 1, 0, 2, 1, 1, 3, 0, 2, 3, 1, 1, 2, 3, 0, 2, 0, 2, 0, 1, 1, 1, 2, 3, 1, 3, 0, 1, 3, 1, 1, 2, 1, 0, 3, 0, 0, 1, 1, 0, 3, 3, 3, 3, 1, 0, 0, 3, 0, 1, 3, 2, 3, 1, 3, 1, 1, 1, 0, 1, 0, 2, 2, 1, 1, 3, 0, 2, 3, 3, 0, 0, 2, 2, 3, 2, 1, 0, 0, 1, 2, 2, 1, 1, 1, 0, 2, 0, 1, 3, 3, 1, 2, 1, 2, 1, 2, 3, 0, 2, 2, 1, 1, 3, 2, 1, 0, 3, 0, 3, 3, 2, 1, 2, 0, 3, 2, 3, 3, 1, 3, 0, 3, 2, 0, 0, 3, 2, 3, 1, 3, 3, 2, 3, 3, 2, 0, 1, 0, 2, 2, 2, 1, 1, 0, 3, 3, 2, 2, 3, 0, 3, 3, 2, 2, 0, 2, 2, 2, 1, 0, 2, 2, 0, 1, 3, 3, 0, 1, 1, 1, 1, 2, 2, 1, 1, 1, 1, 0, 1, 2, 1, 2, 3, 3, 2, 0, 3, 2, 0, 2, 0, 1, 2, 0, 1, 0, 0, 0, 2, 1, 3, 0, 1, 0, 1, 1, 2, 0, 0, 2, 0, 3, 0, 2, 1, 2, 3, 0, 0, 2, 3, 3, 1, 0, 1, 1, 2, 1, 1, 2, 0, 2, 0, 1, 2, 1, 0, 2, 2, 0, 3, 3, 1, 3, 0, 0, 0, 2, 3, 3, 2, 1, 3, 2, 0, 3, 0, 0, 1, 0, 2, 0, 3, 1, 0, 1, 1, 1, 1, 2, 3, 3, 3, 1, 0, 0, 1, 2, 0, 2, 1, 2, 2, 2, 2, 0, 1, 1, 2, 2, 1, 1, 1, 0, 3, 3, 1, 2, 2, 3, 3, 3, 1, 3, 1, 2, 3, 1, 1, 3, 3, 1, 3, 3, 2, 0, 3, 0, 2, 3, 3, 0, 3, 0, 2, 3, 0, 0, 1, 1, 2, 1, 3, 1, 1, 1, 2, 1, 0, 3, 1, 2, 0, 2, 2, 3, 0, 1, 0, 1, 1, 3, 2, 3, 3));
//        ArrayList<Integer> input = new ArrayList<>(Arrays.asList( 2,2,1,2,2));
        int element = 1;
        callForRemoveElement(input,element);
    }

    protected static int callForRemoveElement(ArrayList<Integer> input, int element) {
        out.println("Given input is : " + input + " size :" + input.size());
        out.println("Given element is : " + element);
        int result =  removeElement1(input,element);
        out.println("New Length is : " + result);
        out.println("Result input is : " + input);
        return result;
    }

    private static int removeElement(ArrayList<Integer> input, int element) {
        if(input.size() < 2){
            if (input.get(0).equals(element)){
                input.remove(0);
            }
            return input.size();
        }
        int pointer1 =0;
        int pointer2 = input.size() - 1;
        while (pointer1 < pointer2){
            if (input.get(pointer1).equals(element) && input.get(pointer2).equals(element)){
                input.remove(pointer2);
                input.remove(pointer1);
                pointer2 -=2;
            }else{
                if (input.get(pointer1).equals(element)){
                    input.remove(pointer1);
                    pointer2--;
                }else if (input.get(pointer2).equals(element)){
                    input.remove(pointer2);
                    pointer2--;
                } else {
                    pointer1 ++;
                    pointer2 --;
                }
            }
        }
        if(pointer1 == pointer2 && input.get(pointer1).equals(element))
            input.remove(pointer1);
      return input.size();
    }

    private static int removeElement1(ArrayList<Integer> input, int element) {
        input.removeIf(t->t==element);
        return input.size();
    }

}
