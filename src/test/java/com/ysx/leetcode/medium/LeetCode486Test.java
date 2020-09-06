package com.ysx.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/9/1 22:39
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode486Test {
    @Test
    public void test1() {
        LeetCode486 leetCode486 = new LeetCode486();
        int[] nums = {1, 5, 2};
        Assert.assertFalse(leetCode486.PredictTheWinner(nums));
    }

    @Test
    public void test2() {
        LeetCode486 leetCode486 = new LeetCode486();
        int[] nums = {1, 5, 233, 7};
        Assert.assertTrue(leetCode486.PredictTheWinner(nums));
    }
}
