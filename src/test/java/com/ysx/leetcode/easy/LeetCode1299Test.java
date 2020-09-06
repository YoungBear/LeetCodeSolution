/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/4/12 19:13
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode1299Test {
    @Test
    public void test1() {
        LeetCode1299 leetCode1299 = new LeetCode1299();
        int[] arr = {17, 18, 5, 4, 6, 1};
        int[] excepted = {18, 6, 6, 6, 1, -1};
        Assert.assertArrayEquals(excepted, leetCode1299.replaceElements(arr));
    }
}
