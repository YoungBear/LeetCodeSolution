/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/4/26 22:31
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode263Test {
    @Test
    public void test1() {
        LeetCode263 leetCode263 = new LeetCode263();
        Assert.assertTrue(leetCode263.isUgly(6));
        Assert.assertTrue(leetCode263.isUgly(8));
        Assert.assertFalse(leetCode263.isUgly(14));
    }
}
