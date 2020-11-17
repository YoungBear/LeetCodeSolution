/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/11/17 23:33
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 746. 使用最小花费爬楼梯
 */
public class LeetCode746 {
    /**
     * 动态规划
     *
     * @param cost
     * @return
     */
    public int minCostClimbingStairs(int[] cost) {
        int dp0 = 0;
        int dp1 = 0;
        int dp2 = 0;
        for (int i = 2; i <= cost.length; i++) {
            dp2 = Math.min(dp0 + cost[i - 2], dp1 + cost[i - 1]);
            dp0 = dp1;
            dp1 = dp2;
        }
        return dp2;
    }
}
