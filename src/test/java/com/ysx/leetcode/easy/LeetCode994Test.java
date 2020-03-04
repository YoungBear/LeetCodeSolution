package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/4 19:46
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode994Test {
    @Test
    public void orangesRotting1() {
        LeetCode994 leetCode994 = new LeetCode994();
        int[][] grid = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        int excepted = 4;
        Assert.assertEquals(excepted, leetCode994.orangesRotting(grid));
    }

    @Test
    public void orangesRotting2() {
        LeetCode994 leetCode994 = new LeetCode994();
        int[][] grid = {{2, 1, 1}, {0, 1, 1}, {1, 0, 1}};
        int excepted = -1;
        Assert.assertEquals(excepted, leetCode994.orangesRotting(grid));
    }
}
