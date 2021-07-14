package practice_codes.amazon_interviewbit.binary_search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.lang.System.*;

/**
 * Matrix Median
 * Asked in:
 * Amazon
 * Given a matrix of integers A of size N x M in which each row is sorted.
 *
 * Find an return the overall median of the matrix A.
 *
 * Note: No extra memory is allowed.
 *
 * Note: Rows are numbered from top to bottom and columns are numbered from left to right.
 *
 *
 * Input Format
 *
 * The first and only argument given is the integer matrix A.
 * Output Format
 *
 * Return the overall median of the matrix A.
 * Constraints
 *
 * 1 <= N, M <= 10^5
 * 1 <= N*M  <= 10^6
 * 1 <= A[i] <= 10^9
 * N*M is odd
 * For Example
 *
 * Input 1:
 *     A = [   [1, 3, 5],
 *             [2, 6, 9],
 *             [3, 6, 9]   ]
 * Output 1:
 *     5
 * Explanation 1:
 *     A = [1, 2, 3, 3, 5, 6, 6, 9, 9]
 *     Median is 5. So, we return 5.
 *
 * Input 2:
 *     A = [   [5, 17, 100]    ]
 * Output 2:
 *     17 ``` Matrix=
 *
 */

public class MatrixMedian {
    public static void main(String[] args) {
        /*int[][] input = new int[][]
                {{1, 3, 5},
                {2, 6, 9},
                {3, 6, 9}};*/
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(Arrays.asList(1,3,5)));
        input.add(new ArrayList<>(Arrays.asList(2,6,9)));
        input.add(new ArrayList<>(Arrays.asList(3,6,9)));
        callForFindMedian(input);
    }

    private static int callForFindMedian(ArrayList<ArrayList<Integer>> input) {
        out.println("Given array is :" + input);
        int result = findMedian(input);
        out.println("Result is : "+ result);
        return result;
    }

    private static int findMedian(ArrayList<ArrayList<Integer>> input) {
        int median = input.size() * input.get(0).size();
        boolean flag = median % 2 == 0;
        ArrayList<Integer> sortedArray = new ArrayList<>();
        for (ArrayList<Integer> i: input) {
            sortedArray.addAll(i);
        }
        Collections.sort(sortedArray);
        if (flag){
            return (sortedArray.get(median) + sortedArray.get(median-1))/2 ;
        } else {
            return sortedArray.get(median/2);
        }
    }
}
