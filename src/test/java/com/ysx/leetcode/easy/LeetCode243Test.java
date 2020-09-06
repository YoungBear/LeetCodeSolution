/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/1/8 21:24
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode243Test {
    @Test
    public void shortestDistanceTest() {
        LeetCode243 test = new LeetCode243();
        String[] words = {"practice", "makes", "perfect", "coding", "makes"};
        Assert.assertEquals(3, test.shortestDistance(words, "coding", "practice"));
        Assert.assertEquals(1, test.shortestDistance(words, "makes", "coding"));
    }
}
