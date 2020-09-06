/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/24 22:51
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode448Test {
    private LeetCode448 leetCode448;

    @Before
    public void init() {
        leetCode448 = new LeetCode448();
    }

    @Test
    public void test1() {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> result = Arrays.asList(5, 6);
        Assert.assertEquals(result, leetCode448.findDisappearedNumbers(nums));
    }
}
