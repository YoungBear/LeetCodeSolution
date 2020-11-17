/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/11/17 23:49
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode62Test {
    @Test
    public void test1() {
        LeetCode62 leetCode62 = new LeetCode62();
        int m = 3;
        int n = 2;
        int excepted = 3;
        Assert.assertEquals(excepted, leetCode62.uniquePaths(m, n));
    }

    @Test
    public void test2() {
        LeetCode62 leetCode62 = new LeetCode62();
        int m = 7;
        int n = 3;
        int excepted = 28;
        Assert.assertEquals(excepted, leetCode62.uniquePaths(m, n));
    }
}
