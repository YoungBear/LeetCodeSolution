package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/6/13 22:36
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode509Test {
    @Test
    public void test1() {
        LeetCode509 leetCode509 = new LeetCode509();
        int N = 2;
        int excepted = 1;
        Assert.assertEquals(excepted, leetCode509.fib(N));
    }

    @Test
    public void test2() {
        LeetCode509 leetCode509 = new LeetCode509();
        int N = 3;
        int excepted = 2;
        Assert.assertEquals(excepted, leetCode509.fib(N));
    }

    @Test
    public void test3() {
        LeetCode509 leetCode509 = new LeetCode509();
        int N = 4;
        int excepted = 3;
        Assert.assertEquals(excepted, leetCode509.fib(N));
    }
}
