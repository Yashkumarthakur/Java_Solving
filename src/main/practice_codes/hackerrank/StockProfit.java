package practice_codes.hackerrank;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Selecting Stocks

An investor has saved some money and wants to invest in the stock market. 
There are a number of stocks to choose from, and they want to buy at most 7 share in any company. 
The total invested cannot exceed the funds available. 
A friend who is a stock market expert has predicted the values of each stock after 1 year. 
Determine the maximum profit that can be earned at the end of the year assuming the predictions come true.

Example
saving = 250
currentValue = [175, 133, 109, 210, 971 
future Value = [200, 125, 128, 228, 133]

To maximize profits, the investor should buy stocks at indices 2 and 4 for an investment of 109 + 97 = 206. 
At the end of the year the stocks are sold for 128 +133=261, so total profit is 261-206 = 55.
 *
 */
public class StockProfit {

	public static void main(String[] args) {
		
//        ArrayList<Integer> currentValue = new ArrayList<Integer>();
//        currentValue.add(1);
//        currentValue.add(2);
//        currentValue.add(4);
//        currentValue.add(6);
//
//        ArrayList<Integer> futureValue = new ArrayList<Integer>();
//        futureValue.add(5);
//        futureValue.add(3);
//        futureValue.add(5);
//        futureValue.add(6);
//
//        System.out.println("Max Profit is : " + findProfit(30, currentValue, futureValue));
        
        ArrayList<Integer> currentValue = new ArrayList<Integer>();
        currentValue.add(150);
        currentValue.add(199);
        currentValue.add(200);
        currentValue.add(168);
        currentValue.add(153);

        ArrayList<Integer> futureValue = new ArrayList<Integer>();
        futureValue.add(140);
        futureValue.add(175);
        futureValue.add(199);
        futureValue.add(121);
        futureValue.add(111);

        System.out.println("Max Profit is : " + findProfit(500, currentValue, futureValue));
    }

	public static int findProfit(int saving, ArrayList<Integer> currentValue, ArrayList<Integer> futureValue) {
		int profit = 0;
		int totalInvest = 0;
		for(int i = 0; i < currentValue.size(); i++)
			totalInvest += currentValue.get(i);
		
		if(totalInvest <= saving) {
			for(int i = 0; i < currentValue.size(); i++) {
				profit += (futureValue.get(i) - currentValue.get(i));
			}
		} else {
			ArrayList<Integer> eachProfit = new ArrayList<Integer>();
			for(int i = 0; i < currentValue.size(); i++) {
				eachProfit.add(futureValue.get(i) - currentValue.get(i));
			}
			int invested = 0;
			while(invested <= saving){
				int maxProfit = Collections.max(eachProfit);
				int maxIndex = eachProfit.indexOf(maxProfit);
				profit += maxProfit;
				
				invested += currentValue.get(maxIndex);
				eachProfit.add(maxIndex, 0);
			}
			
		}
		
		if (profit<0)
			return 0;
		return profit;
	}
}
