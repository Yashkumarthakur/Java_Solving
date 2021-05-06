package practice_codes.paytm;

import java.util.Arrays;

import static java.lang.System.*;

/**
 * Candies
 * <p>
 * You are distributing N candies to K children. You give 1 candy to the first child, 2 candies the second child, 3 candies to the third child and so on till K children have received the
 * candies. You then start from the first child again and give him/her K+1 candies, K+2 candi to the second child and so on till all the candies are distributed.
 * Find the number of candies that each child gets.
 * <p>
 * Input Specification:
 * input1: The number of candies N. input2: The number of children K
 * Output Specification:
 * Return array A representing the candies all children get where A[i] is the number of candies received by ith child.
 * <p>
 * Example 1:
 * input1: 7
 * input2:4
 * Output: (1,2,3,1)
 * Explanation:
 * Here, the first child gets 1 candy, second child gets 2 candies, third child gets 3 candies and now you have only 1 candy left, so you give it to the fourth child.
 * <p>
 * Example 2:
 * input1: 10
 * input2: 3
 * Output: (5,2,3)
 * Explanation:
 * Here, the first child gets 1 candy, second child gets 2 candies, third child gets 3 candies and now you go back to the first child and give him/her 4(K+1 3+14) candies which are all that you have.
 */

class Candies {
    public static void main(String[] args) {
        int children = 4;
        int candy = 7;

        out.println("Result is : " + Arrays.toString(distributeCandy(children, candy)));
    }

    protected static int[] distributeCandy(int children, int candy) {
        out.println("Given Data: Children count is " + children + " Candies are " + candy);
        return distribute(children, candy);
    }

    private static int[] distribute(int children, int candy) {
        int[] result = new int[children];
        Arrays.fill(result, 0);
        int pointer = 0;
        int round = 1;
        while (candy > 0) {
            if (pointer >= children) {
                pointer = 0;
                round++;
            }
            if (isRequiredCandyAvailable(pointer, round, candy)) {
                result[pointer] += pointer + round;
                candy = candy - (pointer + round);
                pointer++;
            } else {
                result[pointer] += candy;
                candy = 0;
            }
        }
        return result;
    }

    private static boolean isRequiredCandyAvailable(int pointer, int round, int candy) {
        return (candy >= pointer + round);
    }
}
