package practice_codes.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.lang.System.*;

/**
 * Selecting Stocks
 * <p>
 * An investor has saved some money and wants to invest in the stock market.
 * There are a number of stocks to choose from, and they want to buy at most 7 share in any company.
 * The total invested cannot exceed the funds available.
 * A friend who is a stock market expert has predicted the values of each stock after 1 year.
 * Determine the maximum profit that can be earned at the end of the year assuming the predictions come true.
 * <p>
 * Example
 * saving = 250
 * currentValue = [175, 133, 109, 210, 971
 * future Value = [200, 125, 128, 228, 133]
 * <p>
 * To maximize profits, the investor should buy stocks at indices 2 and 4 for an investment of 109 + 97 = 206.
 * At the end of the year the stocks are sold for 128 +133=261, so total profit is 261-206 = 55.
 *
 * Space Complexity O(n+1)
 * Time Complexity O(nLogn)
 */
public class StockProfit {

    public static void main(String[] args) {
        ArrayList<Integer> currentStockValue = new ArrayList<>(Arrays.asList(150, 199, 200, 168, 153));
        ArrayList<Integer> futureStockValue = new ArrayList<>(Arrays.asList(140, 175, 199, 121, 111));
        int budgetAmount = 500;

        out.println("Max Profit is : " + getResult(budgetAmount, currentStockValue, futureStockValue));
    }

    protected static int getResult(int budgetAmount, ArrayList<Integer> currentStockValue, ArrayList<Integer> futureStockValue) {
        out.println("Current stock value is : " + currentStockValue);
        out.println("Future stock value is :" + futureStockValue);
        return calculateProfit(budgetAmount, currentStockValue, futureStockValue);
    }

    private static int calculateProfit(int saving, ArrayList<Integer> currentStockValue, ArrayList<Integer> futureStockValue) {
        int profit = 0;
        int totalInvest = 0;
        ArrayList<Integer> profitOfEachStock = new ArrayList<>();

        for (int i = 0; i < currentStockValue.size(); i++) {
            int calculatedProfit = (futureStockValue.get(i) - currentStockValue.get(i));
            profit += calculatedProfit;
            profitOfEachStock.add(calculatedProfit);
        }

        if (totalInvest >= saving) {
            int invested = 0;
            while (invested <= saving) {
                int maxProfitAmount = Collections.max(profitOfEachStock);
                int maxProfitAmountIndex = profitOfEachStock.indexOf(maxProfitAmount);
                profit += maxProfitAmount;

                invested += currentStockValue.get(maxProfitAmountIndex);
                profitOfEachStock.remove(maxProfitAmountIndex);
            }
        }
        return Math.max(profit, 0);
    }
}
