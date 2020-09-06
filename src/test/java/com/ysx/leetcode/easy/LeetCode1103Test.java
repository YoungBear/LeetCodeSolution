/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/5 22:13
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode1103Test {
    @Test
    public void distributeCandiesTest1() {
        LeetCode1103 leetCode1103 = new LeetCode1103();
        int candies = 7;
        int num_people = 4;
        int[] excepted = {1, 2, 3, 1};
        Assert.assertArrayEquals(excepted, leetCode1103.distributeCandies(candies, num_people));
    }

    @Test
    public void distributeCandiesTest2() {
        LeetCode1103 leetCode1103 = new LeetCode1103();
        int candies = 10;
        int num_people = 3;
        int[] excepted = {5, 2, 3};
        Assert.assertArrayEquals(excepted, leetCode1103.distributeCandies(candies, num_people));
    }
}
