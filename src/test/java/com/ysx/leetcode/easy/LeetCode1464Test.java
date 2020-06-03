package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/6/3 21:17
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */

public class LeetCode1464Test {
    @Test
    public void test1() {
        LeetCode1464 leetCode1464 = new LeetCode1464();
        int[] nums = {3, 4, 5, 2};
        int excepted = 12;
        Assert.assertEquals(excepted, leetCode1464.maxProduct(nums));
    }

    @Test
    public void test2() {
        LeetCode1464 leetCode1464 = new LeetCode1464();
        int[] nums = {1,5,4,5};
        int excepted = 16;
        Assert.assertEquals(excepted, leetCode1464.maxProduct(nums));
    }

    @Test
    public void test3() {
        LeetCode1464 leetCode1464 = new LeetCode1464();
        int[] nums = {3,7};
        int excepted = 12;
        Assert.assertEquals(excepted, leetCode1464.maxProduct(nums));
    }
}
