/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/1 21:24
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode1010Test {

    @Test
    public void test1() {
        LeetCode1010 leetCode1010 = new LeetCode1010();
        int[] time = {30, 20, 150, 100, 40};
        int n = leetCode1010.numPairsDivisibleBy60(time);
        Assert.assertEquals(3, n);
    }

    @Test
    public void test2() {
        LeetCode1010 leetCode1010 = new LeetCode1010();
        int[] time = {60, 60, 60};
        int n = leetCode1010.numPairsDivisibleBy60(time);
        Assert.assertEquals(3, n);
    }
}
