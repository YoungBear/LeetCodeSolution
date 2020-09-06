/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/6/21 20:24
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode1475Test {
    @Test
    public void test1() {
        LeetCode1475 leetCode1475 = new LeetCode1475();
        int[] prices = {8, 4, 6, 2, 3};
        int[] excepted = {4, 2, 4, 2, 3};
        Assert.assertArrayEquals(excepted, leetCode1475.finalPrices(prices));
    }

    @Test
    public void test2() {
        LeetCode1475 leetCode1475 = new LeetCode1475();
        int[] prices = {1, 2, 3, 4, 5};
        int[] excepted = {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(excepted, leetCode1475.finalPrices(prices));
    }

    @Test
    public void test3() {
        LeetCode1475 leetCode1475 = new LeetCode1475();
        int[] prices = {10, 1, 1, 6};
        int[] excepted = {9, 0, 1, 6};
        Assert.assertArrayEquals(excepted, leetCode1475.finalPrices(prices));
    }
}
