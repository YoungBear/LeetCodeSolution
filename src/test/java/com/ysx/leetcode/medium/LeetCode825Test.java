/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/5/7 22:24
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode825Test {
    @Test
    public void test1() {
        LeetCode825 leetCode825 = new LeetCode825();
        int[] ages = {16, 16};
        int excepted = 2;
        Assert.assertEquals(excepted, leetCode825.numFriendRequests(ages));
    }

    @Test
    public void test2() {
        LeetCode825 leetCode825 = new LeetCode825();
        int[] ages = {16, 17, 18};
        int excepted = 2;
        Assert.assertEquals(excepted, leetCode825.numFriendRequests(ages));
    }

    @Test
    public void test3() {
        LeetCode825 leetCode825 = new LeetCode825();
        int[] ages = {20, 30, 100, 110, 120};
        int excepted = 3;
        Assert.assertEquals(excepted, leetCode825.numFriendRequests(ages));
    }
}
