/*
 * Copyright (c) ysx. 2020-2021. All rights reserved.
 */

package com.ysx.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2021/3/10 23:36
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode1201Test {
    @Test
    public void test1() {
        LeetCode1201 leetCode1201 = new LeetCode1201();
        int n = 3, a = 2, b = 3, c = 5;
        int excepted = 4;
        Assert.assertEquals(excepted, leetCode1201.nthUglyNumber(n, a, b, c));
    }

    @Test
    public void test2() {
        LeetCode1201 leetCode1201 = new LeetCode1201();
        int n = 4, a = 2, b = 3, c = 4;
        int excepted = 6;
        Assert.assertEquals(excepted, leetCode1201.nthUglyNumber(n, a, b, c));
    }

    @Test
    public void test3() {
        LeetCode1201 leetCode1201 = new LeetCode1201();
        int n = 5, a = 2, b = 11, c = 13;
        int excepted = 10;
        Assert.assertEquals(excepted, leetCode1201.nthUglyNumber(n, a, b, c));
    }

    @Test
    public void test4() {
        LeetCode1201 leetCode1201 = new LeetCode1201();
        int n = 1000000000, a = 2, b = 217983653, c = 336916467;
        int excepted = 1999999984;
        Assert.assertEquals(excepted, leetCode1201.nthUglyNumber(n, a, b, c));
    }
}
