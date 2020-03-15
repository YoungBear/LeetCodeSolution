package com.ysx.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/15 21:02
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode695Test {
    @Test
    public void test1() {
        LeetCode695 leetCode695 = new LeetCode695();
        int[][] grid = {
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
        };
        int excepted = 6;
        Assert.assertEquals(excepted, leetCode695.maxAreaOfIsland(grid));
    }

    @Test
    public void test2() {
        LeetCode695 leetCode695 = new LeetCode695();
        int[][] grid = {
                {0, 0, 0, 0, 0, 0, 0, 0},
        };
        int excepted = 0;
        Assert.assertEquals(excepted, leetCode695.maxAreaOfIsland(grid));
    }
}
