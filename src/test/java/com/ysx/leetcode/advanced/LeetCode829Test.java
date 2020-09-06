/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.advanced;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/6 22:35
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode829Test {
    @Test
    public void test1() {
        LeetCode829 leetCode829 = new LeetCode829();
        int N = 5;
        int excepted = 2;
        Assert.assertEquals(excepted, leetCode829.consecutiveNumbersSum(N));
    }

    @Test
    public void test2() {
        LeetCode829 leetCode829 = new LeetCode829();
        int N = 9;
        int excepted = 3;
        Assert.assertEquals(excepted, leetCode829.consecutiveNumbersSum(N));
    }
}
