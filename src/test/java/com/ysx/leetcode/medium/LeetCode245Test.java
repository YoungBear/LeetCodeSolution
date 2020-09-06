/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/1/8 22:15
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode245Test {
    @Test
    public void shortestWordDistanceTest() {
        LeetCode245 test = new LeetCode245();
        String[] words = {"practice", "makes", "perfect", "coding", "makes"};
        Assert.assertEquals(3, test.shortestWordDistance(words, "coding", "practice"));
        Assert.assertEquals(1, test.shortestWordDistance(words, "makes", "coding"));
        Assert.assertEquals(3, test.shortestWordDistance(words, "makes", "makes"));
    }
}
