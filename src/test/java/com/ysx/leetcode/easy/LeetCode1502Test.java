/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/7/19 22:22
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode1502Test {
    @Test
    public void test1() {
        LeetCode1502 leetCode1502 = new LeetCode1502();
        int[] arr = {3, 5, 1};
        Assert.assertTrue(leetCode1502.canMakeArithmeticProgression(arr));
    }

    @Test
    public void test2() {
        LeetCode1502 leetCode1502 = new LeetCode1502();
        int[] arr = {1, 2, 4};
        Assert.assertFalse(leetCode1502.canMakeArithmeticProgression(arr));
    }
}
