package practice_codes.amazon_interviewbit.two_pointers;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *Maximum Ones After Modification
 * Asked in:
 * Amazon
 * hotstar
 * Problem Description
 *
 * Given a binary array A and a number B, we need to find length of the longest subsegment of ‘1’s possible by changing at most B ‘0’s.
 *
 *
 *
 * Problem Constraints
 * 1 <= N, B <= 105
 *
 * A[i]=0 or A[i]=1
 *
 *
 *
 * Input Format
 * First argument is an binary array A.
 *
 * Second argument is an integer B.
 *
 *
 *
 * Output Format
 * Return a single integer denoting the length of the longest subsegment of ‘1’s possible by changing at most B ‘0’s.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = [1, 0, 0, 1, 1, 0, 1]
 *  B = 1
 * Input 2:
 *
 *  A = [1, 0, 0, 1, 0, 1, 0, 1, 0, 1]
 *  B = 2
 *
 *
 * Example Output
 * Output 1:
 *
 *  4
 * Output 2:
 *
 *  5
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  Here, we should only change 1 zero(0). Maximum possible length we can get is by changing the 3rd zero in the array,
 *  we get a[] = {1, 0, 0, 1, 1, 1, 1}
 * Explanation 2:
 *
 *  Here, we can change only 2 zeros. Maximum possible length we can get is by changing the 3rd and 4th (or) 4th and 5th zeros.
 *
 */
public class MaximumOnesAfterModification {
    public static void main(String[] args) {
        ArrayList<Integer> inputs = new ArrayList<>(Arrays.asList(1, 0, 0, 1, 1, 0, 1));
        int changes = 2;
        callForMaximumOnesAfterModification(inputs,changes);
    }

    protected static int callForMaximumOnesAfterModification(ArrayList<Integer> inputs, int changes) {
        System.out.println("Given inputs : " + inputs);
        System.out.println("Given changes : "+ changes);
        int result = findMaximumOnes(inputs,changes);
//        int result = longestOnes(new int[]{1, 0, 0, 1,1,0, 1, 0, 1, 0, 1},changes);
        System.out.println("Result is : " + result);
        return result;
    }

    private static int findMaximumOnesAfterModification(ArrayList<Integer> inputs, int changes) {
        int result = 0 ;
        int tempResult = 0;
        int[] tempInput = new int[inputs.size()];
        int oneCount = 0;
        int tempChange = changes;
        for (int i = 0 ; i < inputs.size() ; i++){
            //for 1 encounter
            if(inputs.get(i) == 1){
                oneCount++;
                tempInput[i] = oneCount + tempResult;
            } else{
             oneCount = 0;
             }
            if(inputs.get(i) == 0){
                if(i != 0 && inputs.get(i) == 1){
                    if(tempChange !=0){
                        tempInput[i] = inputs.get(i-1) + 1;
                        tempChange --;
                    } else {
                        tempChange = changes;
                    }
                } else {
                }
            }
            }
        return result;
    }


    private static int findMaximumOnes(ArrayList<Integer> input, int possibleModification) {

        ArrayList<Integer> maxLength = new ArrayList<Integer>(Collections.nCopies(input.size(), 0));
        int maxLengthPointer = 0;
        int tempPossibility = possibleModification;
        int lastOnePoint = 0;

        for(int i=0; i<input.size(); i++) {

            if(input.get(i).equals(1)) {
                maxLength.set(maxLengthPointer, maxLength.get(maxLengthPointer)+1);

            } else {
                if(tempPossibility != 0){
                    tempPossibility--;
                    maxLength.set(maxLengthPointer, maxLength.get(maxLengthPointer)+1);
                } else {
                    tempPossibility = possibleModification;
                    maxLengthPointer +=1;
                    if(lastOnePoint!=0) {
                        i=lastOnePoint;
                        continue;
                    }
                }
                if((i+1) != input.size() && input.get(i+1).equals(1)) {
                    lastOnePoint = i;
                }
            }
        }
        return Collections.max(maxLength);
    }


    private static int longestOnes(int[] nums, int k) {

        int maxLen = 0, i = 0, j = 0;
        int one_cnt = 0, zero_cnt = 0;

        while (j < nums.length) {
            if (nums[j] == 1) {
                one_cnt++;
            } else {
                zero_cnt++;
            }

            if (zero_cnt <= k) {
                int currMax = Math.min(zero_cnt, k) + one_cnt;
                maxLen = Math.max(maxLen, currMax);

            }

            while (zero_cnt > k && i <= j) {

                if (nums[i] == 0) {
                    zero_cnt--;
                } else {
                    one_cnt--;
                }
                int currMax = Math.min(zero_cnt, k) + one_cnt;
                maxLen = Math.max(maxLen, currMax);
                i++;
            }
            j++;
        }

        return maxLen;
    }


}
