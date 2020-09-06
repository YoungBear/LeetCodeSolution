/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/5 22:07
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode575Test {
    @Test
    public void distributeCandiesTest1() {
        LeetCode575 leetCode575 = new LeetCode575();
        int[] candies = {1, 1, 2, 2, 3, 3};
        int excepted = 3;
        Assert.assertEquals(excepted, leetCode575.distributeCandies(candies));
    }

    @Test
    public void distributeCandiesTest2() {
        LeetCode575 leetCode575 = new LeetCode575();
        int[] candies = {1, 1, 2, 3};
        int excepted = 2;
        Assert.assertEquals(excepted, leetCode575.distributeCandies(candies));
    }
}
