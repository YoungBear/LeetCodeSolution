/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/8/27 21:40
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode17Test {
    @Test
    public void test1() {
        LeetCode17 leetCode17 = new LeetCode17();
        String digits = "23";
        List<String> excepted = Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        List<String> strings = leetCode17.letterCombinations(digits);
        Assert.assertEquals(excepted.size(), strings.size());
        excepted.forEach(e -> Assert.assertTrue(strings.contains(e)));
    }
}
