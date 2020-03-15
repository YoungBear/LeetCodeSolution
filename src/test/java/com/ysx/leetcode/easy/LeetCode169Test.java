package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/15 20:52
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode169Test {
    @Test
    public void test1() {
        LeetCode169 leetCode169 = new LeetCode169();
        int[] A = {3, 2, 3};
        int excepted = 3;
        Assert.assertEquals(excepted, leetCode169.majorityElement(A));
    }

    @Test
    public void test2() {
        LeetCode169 leetCode169 = new LeetCode169();
        int[] A = {2, 2, 1, 1, 1, 2, 2};
        int excepted = 2;
        Assert.assertEquals(excepted, leetCode169.majorityElement(A));
    }
}
