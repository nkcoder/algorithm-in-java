package io.nkcoder.leetcode.array;

import org.junit.jupiter.api.Test;

import static io.nkcoder.leetcode.array.BestTimeOfBuyAndSellStock.maxProfit;
import static io.nkcoder.leetcode.array.BestTimeOfBuyAndSellStock.maxProfit2;
import static org.assertj.core.api.Assertions.assertThat;


public class BestTimeOfBuyAndSellStockTest {

    @Test
    public void test_case1_maxProfit() {
        int result = maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void test_case2_maxProfit() {
        int result = maxProfit(new int[]{7, 6, 4, 3, 1});
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void test_case1_maxProfit2() {
        int result = maxProfit2(new int[]{7, 1, 5, 3, 6, 4});
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void test_case2_maxProfit2() {
        int result = maxProfit2(new int[]{7, 6, 4, 3, 1});
        assertThat(result).isEqualTo(0);
    }
}
