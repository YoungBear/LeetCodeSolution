/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/6 21:50
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode394Test {
    private LeetCode394 leetCode394;

    @Before
    public void init() {
        leetCode394 = new LeetCode394();
    }

    @Test
    public void test1() {
        String s = "3[a]2[bc]";
        Assert.assertEquals("aaabcbc", leetCode394.decodeString(s));
    }

    @Test
    public void test2() {
        String s = "3[a2[c]]";
        Assert.assertEquals("accaccacc", leetCode394.decodeString(s));
    }

    @Test
    public void test3() {
        String s = "2[abc]3[cd]ef";
        Assert.assertEquals("abcabccdcdcdef", leetCode394.decodeString(s));
    }
}
