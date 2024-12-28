package leetcode.DS1.array;

/*
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
solution: https://www.youtube.com/watch?v=3RHCb8LY-X4

Question:
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future
to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Example 1:
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
 */

public class Best_Time_to_Buy_and_Sell_Stock {

    public static int maxProfit(int[] prices) {
        int min_value = Integer.MAX_VALUE;
        int max_profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (min_value > prices[i]) {
                min_value = prices[i];
            } else if (prices[i] - min_value > max_profit) {
                max_profit = prices[i] - min_value;
            }
        }

        return max_profit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));

        System.out.println(maxProfit(new int[]{7, 4, 5, 3, 6, 4, 1}));
    }
}
