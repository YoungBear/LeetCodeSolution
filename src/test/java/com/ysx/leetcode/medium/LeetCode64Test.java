/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/11/18 22:46
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode64Test {
    @Test
    public void test1() {
        LeetCode64 leetCode64 = new LeetCode64();
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        int excepted = 7;
        Assert.assertEquals(excepted, leetCode64.minPathSum(grid));
    }

    @Test
    public void test2() {
        LeetCode64 leetCode64 = new LeetCode64();
        int[][] grid = {{1, 2, 3}, {4, 5, 6}};
        int excepted = 12;
        Assert.assertEquals(excepted, leetCode64.minPathSum(grid));
    }
}
