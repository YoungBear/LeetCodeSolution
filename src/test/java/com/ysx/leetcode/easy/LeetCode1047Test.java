/*
 * Copyright (c) ysx. 2020-2021. All rights reserved.
 */

package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2021/3/10 23:47
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode1047Test {
    @Test
    public void test1() {
        LeetCode1047 leetCode1047 = new LeetCode1047();
        String S = "abbaca";
        String excepted = "ca";
        Assert.assertEquals(excepted, leetCode1047.removeDuplicates(S));
    }
}
