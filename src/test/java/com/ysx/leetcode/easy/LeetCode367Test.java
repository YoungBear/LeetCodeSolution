package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/7 12:04
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode367Test {
    @Test
    public void test() {
        LeetCode367 leetCode367 = new LeetCode367();
        Assert.assertTrue(leetCode367.isPerfectSquare(16));
        Assert.assertTrue(leetCode367.isPerfectSquare(4));
        Assert.assertTrue(leetCode367.isPerfectSquare(9));
        Assert.assertFalse(leetCode367.isPerfectSquare(14));
    }
}
