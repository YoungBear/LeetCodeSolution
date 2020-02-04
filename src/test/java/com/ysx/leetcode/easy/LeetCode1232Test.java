package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/4 18:10
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode1232Test {
    @Test
    public void test1() {
        LeetCode1232 leetCode1232 = new LeetCode1232();
        int[][] coordinates = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};
        Assert.assertTrue(leetCode1232.checkStraightLine(coordinates));
    }

    @Test
    public void test2() {
        LeetCode1232 leetCode1232 = new LeetCode1232();
        int[][] coordinates = {{1, 2}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}};
        Assert.assertFalse(leetCode1232.checkStraightLine(coordinates));
    }


}
