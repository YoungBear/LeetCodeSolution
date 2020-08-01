package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/8/1 19:49
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode1479Test {
    @Test
    public void test1() {
        LeetCode1479 leetCode1479 = new LeetCode1479();
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] excepted = {2, 3, 5, 4, 1, 7};
        Assert.assertArrayEquals(excepted, leetCode1479.shuffle(nums, n));
    }
}
