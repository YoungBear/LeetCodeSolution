/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/11/19 23:31
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 121. 买卖股票的最佳时机
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
 * 动态规划
 */
public class LeetCode121 {
    /**
     * 朴素法动态规划
     * dp[i] 表示前i天的最大利润
     * minPrice 表示前i天的最小价格
     * 状态转移方程：
     * dp[i] = max(dp[i-1], prices[i] - minPrice)
     * 初始状态：dp[0] = 0; minPrice = prices[0]
     * 结果：dp[prices.length - 1]
     * 时间复杂度：O(n)
     * 空间复杂度:O(n)
     *
     * @param prices
     * @return
     */
    public int maxProfit1(int[] prices) {
        if (null == prices || 0 == prices.length) {
            return 0;
        }
        int minPrice = prices[0];
        int[] dp = new int[prices.length];
        dp[0] = 0;
        for (int i = 1; i < prices.length; i++) {
            dp[i] = Math.max(dp[i - 1], prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return dp[prices.length - 1];
    }

    /**
     * 优化后的动态规划
     * <p>
     * dp 表示前i天的最大利润
     * minPrice 表示前i天的最小价格
     * 状态转移方程：
     * dp = max(dp, prices[i] - minPrice)
     * 初始状态：dp = 0; minPrice = prices[0]
     * 结果：dp
     * 时间复杂度：O(n)
     * 空间复杂度:O(1)
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        if (null == prices || 0 == prices.length) {
            return 0;
        }
        int minPrice = prices[0];
        int dp = 0;
        for (int i = 1; i < prices.length; i++) {
            dp = Math.max(dp, prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return dp;
    }
}
