/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/21 20:36
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 365. 水壶问题
 * https://leetcode-cn.com/problems/water-and-jug-problem/
 */
public class LeetCode365 {
    public boolean canMeasureWater(int x, int y, int z) {
        if (z > x + y) {
            return false;
        }
        if (x == 0 || y == 0) {
            return z == 0 || z == x + y;
        }
        return z % gcd(x, y) == 0;
    }

    /**
     * 辗转相除法求 x 和 y 的最大公约数
     *
     * @param x
     * @param y
     * @return
     */
    public int gcd(int x, int y) {
        if (x < y) {
            return gcd(y, x);
        }
        while (y != 0) {
            int temp = x % y;
            x = y;
            y = temp;
        }
        return x;
    }
}
