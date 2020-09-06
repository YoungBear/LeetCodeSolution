/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/5/1 4:12
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode202Test {
    @Test
    public void test1() {
        LeetCode202 leetCode202 = new LeetCode202();
        Assert.assertTrue(leetCode202.isHappy(19));
    }

    @Test
    public void test2() {
        LeetCode202 leetCode202 = new LeetCode202();
        Assert.assertTrue(leetCode202.isHappy(1111111));
    }

    @Test
    public void test3() {
        LeetCode202 leetCode202 = new LeetCode202();
        Assert.assertFalse(leetCode202.isHappy(111111));
    }
}
