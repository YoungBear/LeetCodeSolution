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
 * @date 2020/6/21 8:34
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode763Test {
    @Test
    public void test1() {
        LeetCode763 leetCode763 = new LeetCode763();
        String S = "ababcbacadefegdehijhklij";
        List<Integer> excepted = Arrays.asList(9, 7, 8);
        List<Integer> results = leetCode763.partitionLabels(S);
        Assert.assertEquals(excepted.size(), results.size());
        for (int i = 0; i < excepted.size(); i++) {
            Assert.assertEquals(excepted.get(i), results.get(i));
        }
    }
}
