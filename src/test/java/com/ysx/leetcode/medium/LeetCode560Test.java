/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/12/6 14:31
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode560Test {
    @Test
    public void test1() {
        LeetCode560 leetCode560 = new LeetCode560();
        int[] nums = {1, 1, 1};
        int k = 2;
        int excepted = 2;
        Assert.assertEquals(excepted, leetCode560.subarraySum(nums, k));
    }
}
