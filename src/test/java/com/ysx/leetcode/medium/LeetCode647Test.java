/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/11/15 15:11
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode647Test {
    @Test
    public void test1() {
        LeetCode647 leetCode647 = new LeetCode647();
        String s = "abc";
        int excepted = 3;
        Assert.assertEquals(excepted, leetCode647.countSubstrings(s));
    }

    @Test
    public void test2() {
        LeetCode647 leetCode647 = new LeetCode647();
        String s = "aaa";
        int excepted = 6;
        Assert.assertEquals(excepted, leetCode647.countSubstrings(s));
    }
}
