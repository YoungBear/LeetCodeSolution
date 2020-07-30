package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/7/30 22:51
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode1523Test {
    @Test
    public void test1() {
        LeetCode1523 leetCode1523 = new LeetCode1523();
        int low = 3;
        int high = 7;
        int excepted = 3;
        Assert.assertEquals(excepted, leetCode1523.countOdds(low, high));
    }

    @Test
    public void test2() {
        LeetCode1523 leetCode1523 = new LeetCode1523();
        int low = 8;
        int high = 10;
        int excepted = 1;
        Assert.assertEquals(excepted, leetCode1523.countOdds(low, high));
    }
}
