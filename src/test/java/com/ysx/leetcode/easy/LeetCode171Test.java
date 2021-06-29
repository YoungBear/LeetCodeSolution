/*
 * Copyright (c) ysx. 2020-2021. All rights reserved.
 */

package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2021/6/29 23:03
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode171Test {

    @Test
    public void test1() {
        LeetCode171 leetCode171 = new LeetCode171();
        String columnTitle = "A";
        int excepted = 1;
        Assert.assertEquals(excepted, leetCode171.titleToNumber(columnTitle));
    }

    @Test
    public void test2() {
        LeetCode171 leetCode171 = new LeetCode171();
        String columnTitle = "AB";
        int excepted = 28;
        Assert.assertEquals(excepted, leetCode171.titleToNumber(columnTitle));
    }

    @Test
    public void test3() {
        LeetCode171 leetCode171 = new LeetCode171();
        String columnTitle = "ZY";
        int excepted = 701;
        Assert.assertEquals(excepted, leetCode171.titleToNumber(columnTitle));
    }

}
