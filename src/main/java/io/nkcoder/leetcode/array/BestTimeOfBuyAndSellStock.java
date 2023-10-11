package io.nkcoder.leetcode.array;

/**
 * <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/">121. Best Time to Buy and Sell Stock</a>
 *
 * <pre>
 * 1. double traversal: TC - O(n^2), SC - O(1)
 * 2. use 2 pointers: left and right, increment left only when prices[left] > prices[right], otherwise increment right . TC - O(n), SC - O(1)
 * </pre>
 */
public class BestTimeOfBuyAndSellStock {

    // use while loop
    public static int maxProfit(int[] prices) {
        if (prices.length < 2) return 0;

        int i = 0, j = 1;
        int maxProfit = 0;
        while (i < prices.length && j < prices.length) {
            if (prices[i] > prices[j]) {
                i++;
                j++;
            } else {
                if (prices[j] - prices[i] > maxProfit) {
                    maxProfit = prices[j] - prices[i];
                }
                j++;
            }
        }

        return maxProfit;
    }

    // almost identical, use left and right with for loop
    public static int maxProfit2(int[] prices) {
        if (prices.length < 2) return 0;

        int left = 0;
        int profit = 0;
        for (int right = 1; right < prices.length; right++) {
            if (prices[right] > prices[left]) {
                profit = Math.max(prices[right] - prices[left], profit);
            } else {
                left = right;
            }
        }

        return profit;
    }
}
