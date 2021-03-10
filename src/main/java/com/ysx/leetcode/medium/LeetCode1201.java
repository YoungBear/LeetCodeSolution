/*
 * Copyright (c) ysx. 2020-2021. All rights reserved.
 */

package com.ysx.leetcode.medium;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2021/3/10 23:35
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 * LeetCode 1201. 丑数 III
 */
public class LeetCode1201 {
    /**
     * 二分法
     *
     * @param n
     * @param a
     * @param b
     * @param c
     * @return
     */
    public int nthUglyNumber(int n, int a, int b, int c) {
        long ab = lcm(a, b);
        long ac = lcm(a, c);
        long bc = lcm(b, c);
        long abc = lcm(ab, c);

        long left = 0;
        long right = (long) n * Math.min(a, Math.min(b, c));

        while (left < right) {
            long middle = (left + right) / 2;
            // 求middle之内丑数的个数
            long num = middle / a + middle / b + middle / c - middle / ab - middle / ac - middle / bc
                    + middle / abc;
            if (num < n) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return (int) left;
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
