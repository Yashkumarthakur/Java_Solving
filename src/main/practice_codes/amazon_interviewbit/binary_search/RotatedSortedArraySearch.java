package practice_codes.amazon_interviewbit.binary_search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.*;

/**
 * Rotated Sorted Array Search
 * Asked in:
 * Facebook
 * Google
 * Microsoft
 * Amazon
 * Given an array of integers A of size N and an integer B.
 *
 * array A is rotated at some pivot unknown to you beforehand.
 *
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2 ).
 *
 * You are given a target value B to search. If found in the array, return its index, otherwise return -1.
 *
 * You may assume no duplicate exists in the array.
 *
 * NOTE:- Array A was sorted in non-decreasing order before rotation.
 *
 * NOTE : Think about the case when there are duplicates. Does your current solution work? How does the time complexity change?*
 * Input Format
 *
 * The first argument given is the integer array A.
 * The second argument given is the integer B.
 * Output Format
 *
 * Return index of B in array A, otherwise return -1
 * Constraints
 *
 * 1 <= N <= 1000000
 * 1 <= A[i] <= 10^9
 * all elements in A are disitinct.
 * For Example
 *
 * Input 1:
 *     A = [4, 5, 6, 7, 0, 1, 2, 3]
 *     B = 4
 * Output 1:
 *     0
 * Explanation 1:
 *  Target 4 is found at index 0 in A.
 *
 *
 * Input 2:
 *     A = [5, 17, 100, 3]
 *     B = 6
 * Output 2:
 *     -1
 *
 */

public class RotatedSortedArraySearch {
    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(Arrays.asList(101, 103, 106, 109, 158, 164, 182, 187, 202, 205, 2, 3, 32, 57, 69, 74, 81, 99, 100));
        int search = 202;
        callForSearch(input, search);
    }

    protected static int callForSearch(List<Integer> input, int search) {
        out.println("Given Arrays is : " + input);
        out.println("Search element " + search);
        int result = searchElement(input, search);
        int result1 = binarySearchRotated(input, search);
        out.println("Result is " + result);
        return result;
    }

    public static int binarySearch(List<Integer>  arr, int start, int end, int key) {
        if (start > end) return -1;

        int mid = start + (end - start) / 2;

        if (arr.get(mid) == key) return mid;

        if (arr.get(start) <= arr.get(mid) && key <= arr.get(mid) && key >= arr.get(start)) {
            return binarySearch(arr, start, mid - 1, key);
        } else if (arr.get(mid) <= arr.get(end) && key >= arr.get(mid) && key <= arr.get(end)) {
            return binarySearch(arr, mid + 1, end, key);
        } else if (arr.get(end) <= arr.get(mid)) {
            return binarySearch(arr, mid + 1, end, key);
        } else if (arr.get(start) >= arr.get(mid)) {
            return binarySearch(arr, start, mid - 1, key);
        }

        return -1;
    }

    static int binarySearchRotated(List<Integer> input, int key) {
        return binarySearch(input, 0, input.size() - 1, key);
    }

    private static int searchElement(List<Integer> input, int search) {
        if (input.isEmpty())
            return -1;
        if (search < input.get(0) && search > input.get(input.size() - 1))
            return -1;
        for (int i : input) {
            if (i == search) {
                return input.indexOf(i);
            }
        }
        return -1;
    }

}
