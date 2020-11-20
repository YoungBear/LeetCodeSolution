/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import static java.lang.Math.max;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/11/20 23:24
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 122. 买卖股票的最佳时机 II
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/
 * 可以完成多次交易
 */
public class LeetCode122 {

    /**
     * dp0表示第i天结束后手里没有股票的最大利润
     * dp1表示第i天结束后手里有1支股票的最大利润
     * 则状态转移方程为:
     * dp0 = max(dp0, dp1 + prices[i])
     * dp1 = max(dp0 - prices[i], dp1)
     * 初始状态：
     * dp0 = 0
     * dp1 = -prices[0]
     * 结果：最后一天手上没有股票
     * dp0
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        if (null == prices || 0 == prices.length) {
            return 0;
        }
        int dp0 = 0;
        int dp1 = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp0 = max(dp0, dp1 + prices[i]);
            dp1 = max(dp0 - prices[i], dp1);
        }
        return dp0;
    }

    /**
     * 贪心算法
     * 当天不交易，可以理解为卖出又买入
     * 所以可以理解为，只要前一天比后一天的价格低，则就可以前一天买入，后一天卖出
     * 其利润为:prices[i]- prices[i-1]
     *
     * @param prices
     * @return
     */
    public int maxProfit2(int[] prices) {
        if (null == prices || prices.length == 0) {
            return 0;
        }
        // 同一天可以卖出再买入，所以，只要第一天比第二天的价格低，则第一天买入，第二天卖出...
        int sum = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i - 1] < prices[i]) {
                sum += prices[i] - prices[i - 1];
            }
        }
        return sum;
    }
}
