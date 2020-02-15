package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/15 18:21
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode922Test {
    private LeetCode922 leetCode922;

    @Before
    public void init() {
        leetCode922 = new LeetCode922();
    }

    @Test
    public void test1() {
        int[] A = {4, 2, 5, 7};
        int[] result = leetCode922.sortArrayByParityII(A);
        for (int i = 0; i < result.length; i++) {
            Assert.assertEquals(i % 2, result[i] % 2);
        }
    }
}
