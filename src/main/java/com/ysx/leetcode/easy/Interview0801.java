/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/7/26 9:48
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 面试题 08.01. 三步问题
 * https://leetcode-cn.com/problems/three-steps-problem-lcci/
 */
public class Interview0801 {
    /**
     * 动态转移方程：dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1]
     * 防止溢出，需要取模。对于三个接近1000000007的数的和，其值可能溢出，两个数的和就不会溢出
     * 所以先对两个数的和取模，再加上第三个数取模
     * Integer.MAX_VALUE - 2 * 1000000007 = 147483633
     * 使用三个变量，空间复杂度由 O(N) 下降到 O(1)
     *
     * @param n 共 n 阶台阶
     * @return 到第 n 阶台阶的走法
     */
    public int waysToStep(int n) {
        if (1 == n) {
            return 1;
        }
        if (2 == n) {
            return 2;
        }
        int dp1 = 1;
        int dp2 = 2;
        int dp3 = 4;
        for (int i = 3; i < n; i++) {
            int next = ((dp3 + dp2) % 1000000007 + dp1) % 1000000007;
            dp1 = dp2;
            dp2 = dp3;
            dp3 = next;
        }
        return dp3;
    }
}
