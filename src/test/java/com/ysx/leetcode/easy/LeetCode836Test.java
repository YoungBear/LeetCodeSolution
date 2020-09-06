/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/18 22:32
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode836Test {
    @Test
    public void test1() {
        LeetCode836 leetCode836 = new LeetCode836();
        int[] rec1 = {0, 0, 2, 2};
        int[] rec2 = {1, 1, 3, 3};
        Assert.assertTrue(leetCode836.isRectangleOverlap(rec1, rec2));
    }

    @Test
    public void test2() {
        LeetCode836 leetCode836 = new LeetCode836();
        int[] rec1 = {0, 0, 1, 1};
        int[] rec2 = {1, 0, 2, 1};
        Assert.assertFalse(leetCode836.isRectangleOverlap(rec1, rec2));
    }

    @Test
    public void test3() {
        LeetCode836 leetCode836 = new LeetCode836();
        int[] rec1 = {7, 8, 13, 15};
        int[] rec2 = {10, 8, 12, 20};
        Assert.assertTrue(leetCode836.isRectangleOverlap(rec1, rec2));
    }
}
