package practice_codes.gold_man_s;

import java.util.ArrayList;
import java.util.List;

/**
 * A traveler is traveling form city of zeta to omega. He starts with X amount of money. Every day he spends some money and also he may work on some days to earn money. He may find good work some day and end up earning more than what he spends that day, it also may happen that he spends more than what he earns on any day.
 * You are given an array of integers which represents his net savings (earning expense) on any day, You need to find out minimum amount the traveler should begin with to ensure that he always have some money (>0) at the end of any day.
 * Constraints:
 * -200<=a <=200, where a, are array elements
 * O<i<=100, where i is the array length
 * X>=0
 * For example:
 * Input:
 * 3 //Array length
 * 4 //Array elements start
 * 2
 * -3
 * output:
 * Explanation:
 * Traveler saves $4 on first day, $2 on second day and $-3 on third day (expense is more on 3 day than earnings)
 * End of the first day, he has X + $4
 * End of the Second day, he has X + $(4+2)
 * End of third day, he has X + $(4+2-3)
 * So he can effectively start with $0
 * OR
 * If input : [10, -5, 7, -8, 5, -9] --> ANS: 1
 * If input : [1 2 -4 -5 ] -- > ANS: -7
 * etc
 */

class TravelFund {

    /*
     * Complete the 'requiredAmountAtStart' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY netSaving as parameter.
     */

    public static int requiredAmountAtStart(List<Integer> netSaving) {
        int eod = 0;
        int small = 0;
        for (int money : netSaving) {
            System.out.println("today is ::" + money);
            eod += money;
            System.out.println("eod is ::" + eod);
            if (eod < 0) {
                if (eod < small) {
                    small = eod;
                }
            }
        }
        if (small == 0)
            return 0;
        return Math.abs(small) + 1;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(-5);
        list.add(4);
        list.add(4);
        list.add(4);
        System.out.println("ArrayList : " + list.toString());

        int netSavingCount = requiredAmountAtStart(list);
        System.out.println("ANS : " + netSavingCount);

    }
}
