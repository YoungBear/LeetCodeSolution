/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/26 21:23
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode1002Test {
    @Test
    public void test1() {
        LeetCode1002 leetCode1002 = new LeetCode1002();
        String[] A = {"bella","label","roller"};
        List<String> stringList = leetCode1002.commonChars(A);
        List<String> exceptedList = Arrays.asList("e","l","l");
        Assert.assertEquals(exceptedList, stringList);
    }

    @Test
    public void test2() {
        LeetCode1002 leetCode1002 = new LeetCode1002();
        String[] A = {"cool","lock","cook"};
        List<String> stringList = leetCode1002.commonChars(A);
        List<String> exceptedList = Arrays.asList("c","o");
        Assert.assertEquals(exceptedList, stringList);
    }
}
