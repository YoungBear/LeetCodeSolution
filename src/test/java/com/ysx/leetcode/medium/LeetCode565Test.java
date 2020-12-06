/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/12/6 22:19
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode565Test {
    @Test
    public void test1() {
        LeetCode565 leetCode565 = new LeetCode565();
        int[] nums = {5, 4, 0, 3, 1, 6, 2};
        int excepted = 4;
        Assert.assertEquals(excepted, leetCode565.arrayNesting(nums));
    }

    @Test
    public void test2() {
        LeetCode565 leetCode565 = new LeetCode565();
        int[] nums = {5, 4, 0, 3, 1, 6, 2};
        int excepted = 4;
        Assert.assertEquals(excepted, leetCode565.arrayNestingVisited(nums));
    }
}
