/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/27 20:51
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 914. 卡牌分组
 * https://leetcode-cn.com/problems/x-of-a-kind-in-a-deck-of-cards/
 */
public class LeetCode914 {
    public boolean hasGroupsSizeX(int[] deck) {
        if (deck.length <= 1) {
            return false;
        }
        int[] counters = new int[10000];
        for (int d : deck) {
            counters[d]++;
        }
        int maxDivisor = 0;
        for (int c : counters) {
            if (c == 0) {
                continue;
            }
            if (c == 1) {
                return false;
            }
            maxDivisor = gcd(maxDivisor, c);
            if (maxDivisor == 1) {
                return false;
            }
        }
        return maxDivisor >= 2;
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
