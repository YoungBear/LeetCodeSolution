/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/12/6 15:58
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode713Test {
    @Test
    public void test1() {
        LeetCode713 leetCode713 = new LeetCode713();
        int[] nums = {10, 5, 2, 6};
        int k = 100;
        int excepted = 8;
        Assert.assertEquals(excepted, leetCode713.numSubarrayProductLessThanK(nums, k));
    }
}
