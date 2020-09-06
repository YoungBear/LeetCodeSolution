/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.interview;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/21 23:35
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class Interview03Test {
    @Test
    public void test1() {
        Interview03 interview03 = new Interview03();
        int[] nums = {0, 1, 0};
        int excepted = 0;
        Assert.assertEquals(excepted, interview03.findRepeatNumber(nums));
    }

    @Test
    public void test2() {
        Interview03 interview03 = new Interview03();
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        int excepted = 2;
        Assert.assertEquals(excepted, interview03.findRepeatNumber(nums));
    }
}
