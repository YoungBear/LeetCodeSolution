package com.ysx.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2021/6/12 08:26
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode279Test {
    @Test
    public void test1() {
        LeetCode279 leetCode279 = new LeetCode279();
        int n = 12;
        int excepted = 3;
        Assert.assertEquals(excepted, leetCode279.numSquares(n));
    }

    @Test
    public void test2() {
        LeetCode279 leetCode279 = new LeetCode279();
        int n = 13;
        int excepted = 2;
        Assert.assertEquals(excepted, leetCode279.numSquares(n));
    }
}
