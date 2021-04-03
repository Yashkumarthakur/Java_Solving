package main.goldManS;

/*Find the difference between two arrays: Two unsorted arrays are given, and you need to find (arr1 – arr2) and (arr2 – arr1). The difference between the two arrays is defined as all the elements from the first array which are not present in the second array, taking the number of occurrences into consideration.
Example:

arr1: [3, 5, 2, 7, 4, 2, 7] arr2: [1, 7, 5, 2, 2, 9]
arr1 – arr2 = [3, 7, 4]
arr2 – arr1 = [1, 7]
*/

import java.util.ArrayList;
import java.util.List;

public class ArrayMinusOp {

    public static void main(String[] args) {

        int[] array1 = {3, 5, 2, 7, 4, 2, 7};
        int[] array2 = {1, 7, 5, 2, 2, 9};

        System.out.println("\nArray1 - Array2 is :" + display(array1, array2));

    }

    public static List<Integer> display(int[] array1, int[] array2) {

        System.out.print("Array1 is :");
        for (int element : array1)
            System.out.print(element + ",");

        System.out.print("\nArray2 is :");
        for (int element : array2)
            System.out.print(element + ",");

        return arrayMinus(array1,array2);

    }

    /**
     * @param array1
     * @param array2
     * @return
     */
    private static List<Integer> arrayMinus(int[] array1, int[] array2) {
        if (array1 == null || array2 == null)
            return null;

        ArrayList<Integer> result = new ArrayList<>();
        List<Integer> l1 = new ArrayList();

        int negation = -1;

        for (int k : array1) {
            for (int j = 0; j < array2.length; j++) {
                if (k == array2[j]) {
                    array2[j] = negation;
                    break;
                } else if (j == array2.length - 1) {
                    l1.add(k);
                    result.add(k);
                }
            }
        }
        return l1;
    }

}
