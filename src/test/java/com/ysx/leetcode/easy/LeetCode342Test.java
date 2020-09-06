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
 * @date 2020/1/5 23:16
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode342Test {
    private LeetCode342 instance;

    @Before
    public void init() {
        instance = new LeetCode342();
    }

    @Test
    public void rangeBitwiseAndTest() {
        Assert.assertTrue(instance.isPowerOfFour(1));
        Assert.assertTrue(instance.isPowerOfFour(4));
        Assert.assertTrue(instance.isPowerOfFour(16));
        Assert.assertFalse(instance.isPowerOfFour(5));
    }
}
