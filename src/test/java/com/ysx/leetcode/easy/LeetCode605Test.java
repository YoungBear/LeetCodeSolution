/*
 * Copyright (c) ysx. 2020-2021. All rights reserved.
 */

package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2021/6/20 18:24
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode605Test {
    @Test
    public void test1() {
        LeetCode605 leetCode605 = new LeetCode605();
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        Assert.assertTrue(leetCode605.canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void test2() {
        LeetCode605 leetCode605 = new LeetCode605();
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 2;
        Assert.assertFalse(leetCode605.canPlaceFlowers(flowerbed, n));
    }
}
