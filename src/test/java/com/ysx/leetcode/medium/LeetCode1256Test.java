/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/1/12 22:36
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode1256Test {
    @Test
    public void encodeTest() {
        LeetCode1256 test = new LeetCode1256();
        Assert.assertEquals("000", test.encode(7));
        Assert.assertEquals("1000", test.encode(23));
        Assert.assertEquals("101100", test.encode(107));
    }
}
