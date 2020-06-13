package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/6/13 22:18
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode70Test {
    @Test
    public void test1() {
        LeetCode70 leetCode70 = new LeetCode70();
        int n = 2;
        int excepted = 2;
        Assert.assertEquals(excepted, leetCode70.climbStairs(n));
    }

    @Test
    public void test2() {
        LeetCode70 leetCode70 = new LeetCode70();
        int n = 3;
        int excepted = 3;
        Assert.assertEquals(excepted, leetCode70.climbStairs(n));
    }

    @Test
    public void test3() {
        LeetCode70 leetCode70 = new LeetCode70();
        int n = 1;
        int excepted = 1;
        Assert.assertEquals(excepted, leetCode70.climbStairs(n));
    }
}
