package com.ysx.leetcode.advanced;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/22 14:03
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode154Test {
    @Test
    public void test1() {
        LeetCode154 leetCode154 = new LeetCode154();
        int[] nums = {1, 3, 5};
        int excepted = 1;
        Assert.assertEquals(excepted, leetCode154.findMin(nums));
    }

    @Test
    public void test2() {
        LeetCode154 leetCode154 = new LeetCode154();
        int[] nums = {2, 2, 2, 0, 1};
        int excepted = 0;
        Assert.assertEquals(excepted, leetCode154.findMin(nums));
    }

    @Test
    public void test3() {
        LeetCode154 leetCode154 = new LeetCode154();
        int[] nums = {1, 1, 1, 1, 0, 0};
        int excepted = 0;
        Assert.assertEquals(excepted, leetCode154.findMin(nums));
    }
}
