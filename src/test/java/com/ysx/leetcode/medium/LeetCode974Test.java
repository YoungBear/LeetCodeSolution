/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/12/6 17:15
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode974Test {
    @Test
    public void test1() {
        LeetCode974 leetCode974 = new LeetCode974();
        int[] nums = {4, 5, 0, -2, -3, 1};
        int k = 5;
        int excepted = 7;
        Assert.assertEquals(excepted, leetCode974.subarraysDivByK(nums, k));
    }
}
