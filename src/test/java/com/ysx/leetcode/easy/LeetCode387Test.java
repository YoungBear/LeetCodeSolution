/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/4/6 11:27
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode387Test {
    @Test
    public void test1() {
        LeetCode387 leetCode387 = new LeetCode387();
        String s = "leetcode";
        int excepted = 0;
        Assert.assertEquals(excepted, leetCode387.firstUniqChar(s));
    }

    @Test
    public void test2() {
        LeetCode387 leetCode387 = new LeetCode387();
        String s = "loveleetcode";
        int excepted = 2;
        Assert.assertEquals(excepted, leetCode387.firstUniqChar(s));
    }

    @Test
    public void test3() {
        LeetCode387 leetCode387 = new LeetCode387();
        String s = "cc";
        int excepted = -1;
        Assert.assertEquals(excepted, leetCode387.firstUniqChar(s));
    }

    @Test
    public void test4() {
        LeetCode387 leetCode387 = new LeetCode387();
        String s = "aadadaad";
        int excepted = -1;
        Assert.assertEquals(excepted, leetCode387.firstUniqChar(s));
    }

    @Test
    public void test5() {
        LeetCode387 leetCode387 = new LeetCode387();
        String s = "dddccdbba";
        int excepted = 8;
        Assert.assertEquals(excepted, leetCode387.firstUniqChar(s));
    }
}
