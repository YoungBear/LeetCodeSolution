/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.advanced;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/11/24 0:03
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode45Test {
    @Test
    public void test1() {
        LeetCode45 leetCode45 = new LeetCode45();
        int[] nums = {2, 3, 1, 1, 4};
        int excepted = 2;
        Assert.assertEquals(excepted, leetCode45.jump(nums));
    }
}
