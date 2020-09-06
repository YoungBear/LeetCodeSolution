/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.interview;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/4 21:57
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class Interview0101Test {
    @Test
    public void isUniqueTest1() {
        Interview0101 interview0101 = new Interview0101();
        Assert.assertFalse(interview0101.isUnique("leetcode"));
        Assert.assertTrue(interview0101.isUnique("abc"));
        Assert.assertTrue(interview0101.isUnique(""));
    }
}
