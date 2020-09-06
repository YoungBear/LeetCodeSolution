/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/2 13:44
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode246Test {

    private LeetCode246 leetCode246;

    @Before
    public void init() {
        leetCode246 = new LeetCode246();
    }

    @Test
    public void test1() {
        Assert.assertTrue(leetCode246.isStrobogrammatic("69"));
        Assert.assertTrue(leetCode246.isStrobogrammatic("88"));
        Assert.assertFalse(leetCode246.isStrobogrammatic("962"));
        Assert.assertTrue(leetCode246.isStrobogrammatic("0"));
        Assert.assertTrue(leetCode246.isStrobogrammatic("1"));
        Assert.assertFalse(leetCode246.isStrobogrammatic("2"));
    }

}
