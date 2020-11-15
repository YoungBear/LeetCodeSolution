/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/11/15 23:05
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode53Test {
    @Test
    public void test1() {
        LeetCode53 leetCode53 = new LeetCode53();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int excepted = 6;
        Assert.assertEquals(excepted, leetCode53.maxSubArray(nums));
    }

}
