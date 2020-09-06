/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/25 22:06
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode892Test {
    @Test
    public void test1() {
        LeetCode892 leetCode892 = new LeetCode892();
        int[][] grid = {{2}};
        int excepted = 10;
        Assert.assertEquals(excepted, leetCode892.surfaceArea(grid));
    }

    @Test
    public void test2() {
        LeetCode892 leetCode892 = new LeetCode892();
        int[][] grid = {{1, 2}, {3, 4}};
        int excepted = 34;
        Assert.assertEquals(excepted, leetCode892.surfaceArea(grid));
    }

    @Test
    public void test3() {
        LeetCode892 leetCode892 = new LeetCode892();
        int[][] grid = {{1, 0}, {0, 2}};
        int excepted = 16;
        Assert.assertEquals(excepted, leetCode892.surfaceArea(grid));
    }

    @Test
    public void test4() {
        LeetCode892 leetCode892 = new LeetCode892();
        int[][] grid = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int excepted = 32;
        Assert.assertEquals(excepted, leetCode892.surfaceArea(grid));
    }

    @Test
    public void test5() {
        LeetCode892 leetCode892 = new LeetCode892();
        int[][] grid = {{2, 2, 2}, {2, 1, 2}, {2, 2, 2}};
        int excepted = 46;
        Assert.assertEquals(excepted, leetCode892.surfaceArea(grid));
    }

}
