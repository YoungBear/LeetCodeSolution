/*
 * Copyright (c) ysx. 2020-2021. All rights reserved.
 */

package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2021/6/29 22:58
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode168Test {

    @Test
    public void test1() {
        LeetCode168 leetCode168 = new LeetCode168();
        int columnNumber = 1;
        String excepted = "A";
        Assert.assertEquals(excepted, leetCode168.convertToTitle(columnNumber));
    }

    @Test
    public void test2() {
        LeetCode168 leetCode168 = new LeetCode168();
        int columnNumber = 28;
        String excepted = "AB";
        Assert.assertEquals(excepted, leetCode168.convertToTitle(columnNumber));
    }

    @Test
    public void test3() {
        LeetCode168 leetCode168 = new LeetCode168();
        int columnNumber = 701;
        String excepted = "ZY";
        Assert.assertEquals(excepted, leetCode168.convertToTitle(columnNumber));
    }

    @Test
    public void test4() {
        LeetCode168 leetCode168 = new LeetCode168();
        int columnNumber = 2147483647;
        String excepted = "FXSHRXW";
        Assert.assertEquals(excepted, leetCode168.convertToTitle(columnNumber));
    }
}
