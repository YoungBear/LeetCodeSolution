/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/11/15 0:53
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode5Test {
    @Test
    public void test1() {
        LeetCode5 leetCode5 = new LeetCode5();
        String s = "babad";
        int excepted = 3;
        Assert.assertEquals(excepted, leetCode5.longestPalindrome(s).length());
    }

    @Test
    public void test2() {
        LeetCode5 leetCode5 = new LeetCode5();
        String s = "cbbd";
        int excepted = 2;
        Assert.assertEquals(excepted, leetCode5.longestPalindrome(s).length());
    }
}
