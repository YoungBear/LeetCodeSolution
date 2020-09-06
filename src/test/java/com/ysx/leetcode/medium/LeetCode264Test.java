/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/4/26 22:34
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode264Test {
    @Test
    public void test1() {
        LeetCode264 leetCode264 = new LeetCode264();
        int n = 10;
        int excepted = 12;
        Assert.assertEquals(excepted, leetCode264.nthUglyNumber(n));
    }
}
