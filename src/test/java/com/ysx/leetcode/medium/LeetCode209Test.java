package com.ysx.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/25 22:03
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode209Test {
    @Test
    public void test1() {
        LeetCode209 leetCode209 = new LeetCode209();
        int[] nums = {2, 3, 1, 2, 4, 3};
        int s = 7;
        int result = 2;
        Assert.assertEquals(result, leetCode209.minSubArrayLen(s, nums));
    }

    @Test
    public void test2() {
        LeetCode209 leetCode209 = new LeetCode209();
        int[] nums = {6, 3, 1, 2, 4, 3};
        int s = 7;
        int result = 2;
        Assert.assertEquals(result, leetCode209.minSubArrayLen(s, nums));
    }

    @Test
    public void test3() {
        LeetCode209 leetCode209 = new LeetCode209();
        int[] nums = {1, 4, 4};
        int s = 4;
        int result = 1;
        Assert.assertEquals(result, leetCode209.minSubArrayLen(s, nums));
    }

    @Test
    public void test4() {
        LeetCode209 leetCode209 = new LeetCode209();
        int[] nums = {1, 2, 3, 4, 5};
        int s = 11;
        int result = 3;
        Assert.assertEquals(result, leetCode209.minSubArrayLen(s, nums));
    }
}
