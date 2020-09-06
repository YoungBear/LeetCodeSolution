/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/4 17:22
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode1056Test {

    @Test
    public void test() {
        LeetCode1056 leetCode1056 = new LeetCode1056();
        Assert.assertTrue(leetCode1056.confusingNumber(6));
        Assert.assertTrue(leetCode1056.confusingNumber(89));
        Assert.assertFalse(leetCode1056.confusingNumber(11));
        Assert.assertFalse(leetCode1056.confusingNumber(25));
        Assert.assertTrue(leetCode1056.confusingNumber(8000));
    }
}
