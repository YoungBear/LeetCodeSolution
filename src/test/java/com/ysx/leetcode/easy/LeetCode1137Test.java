/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/5/12 21:47
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode1137Test {
    @Test
    public void test1() {
        LeetCode1137 leetCode1137 = new LeetCode1137();
        int n = 4;
        int excepted = 4;
        Assert.assertEquals(excepted, leetCode1137.tribonacci(n));
    }

    @Test
    public void test2() {
        LeetCode1137 leetCode1137 = new LeetCode1137();
        int n = 25;
        int excepted = 1389537;
        Assert.assertEquals(excepted, leetCode1137.tribonacci(n));
    }
}
