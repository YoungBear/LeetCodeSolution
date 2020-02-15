package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.annotation.Inherited;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/15 15:26
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode905Test {
    private LeetCode905 leetCode905;

    @Before
    public void init() {
        leetCode905 = new LeetCode905();
    }

    @Test
    public void test1() {
        int[] A = {3, 1, 2, 4};
        int[] result = leetCode905.sortArrayByParity(A);
        Assert.assertEquals(0, result[0] % 2);
        Assert.assertEquals(0, result[1] % 2);
        Assert.assertEquals(1, result[2] % 2);
        Assert.assertEquals(1, result[3] % 2);
    }
}
