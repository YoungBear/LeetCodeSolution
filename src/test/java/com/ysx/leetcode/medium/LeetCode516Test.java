/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/11/15 15:03
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode516Test {
    @Test
    public void test1() {
        LeetCode516 leetCode516 = new LeetCode516();
        String s = "bbbab";
        int excepted = 4;
        Assert.assertEquals(excepted, leetCode516.longestPalindromeSubseq(s));
    }

    @Test
    public void test2() {
        LeetCode516 leetCode516 = new LeetCode516();
        String s = "cbbd";
        int excepted = 2;
        Assert.assertEquals(excepted, leetCode516.longestPalindromeSubseq(s));
    }
}
