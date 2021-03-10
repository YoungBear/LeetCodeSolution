/*
 * Copyright (c) ysx. 2020-2021. All rights reserved.
 */

package com.ysx.leetcode.advanced;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2021/3/10 23:42
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 * LeetCode 878. 第 N 个神奇数字
 */
public class LeetCode878 {
    /**
     * 二分法，参考1201
     *
     * @param n
     * @param a
     * @param b
     * @return
     */
    public int nthMagicalNumber(int n, int a, int b) {
        int MOD = 1_000_000_007;
        long ab = lcm(a, b);

        long left = 0;
        long right = (long) n * Math.min(a, b);
        while (left < right) {
            long middle = (left + right) / 2;
            long num = middle / a + middle / b - middle / ab;
            if (num < n) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return (int) (left % MOD);
    }

    /**
     * 最大公约数
     *
     * @param x
     * @param y
     * @return
     */
    private long gcd(long x, long y) {
        if (x == 0) {
            return y;
        }
        return gcd(y % x, x);
    }

    /**
     * 最小公倍数
     *
     * @param x
     * @param y
     * @return
     */
    private long lcm(long x, long y) {
        return x * y / gcd(x, y);
    }
}
