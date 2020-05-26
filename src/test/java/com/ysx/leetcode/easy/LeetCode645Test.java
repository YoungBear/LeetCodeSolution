package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/5/26 23:20
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode645Test {
    @Test
    public void test1() {
        LeetCode645 leetCode645 = new LeetCode645();
        int[] nums = {1, 2, 2, 4};
        int[] excepted = {2, 3};
        Assert.assertArrayEquals(excepted, leetCode645.findErrorNums(nums));
    }

    @Test
    public void test2() {
        LeetCode645 leetCode645 = new LeetCode645();
        int[] nums = {1, 3, 4, 2, 2};
        int[] excepted = {2, 5};
        Assert.assertArrayEquals(excepted, leetCode645.findErrorNums(nums));
    }

    @Test
    public void test3() {
        LeetCode645 leetCode645 = new LeetCode645();
        int[] nums = {3, 1, 3, 4, 2};
        int[] excepted = {3, 5};
        Assert.assertArrayEquals(excepted, leetCode645.findErrorNums(nums));
    }
}
