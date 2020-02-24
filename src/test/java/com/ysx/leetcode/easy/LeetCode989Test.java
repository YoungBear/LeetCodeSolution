package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/24 22:18
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode989Test {
    private LeetCode989 leetCode989;

    @Before
    public void init() {
        leetCode989 = new LeetCode989();
    }

    @Test
    public void test1() {
        int[] A = {1, 2, 0, 0};
        int K = 34;
        List<Integer> result = Arrays.asList(1, 2, 3, 4);
        Assert.assertEquals(result, leetCode989.addToArrayForm(A, K));
    }

    @Test
    public void test2() {
        int[] A = {2, 7, 4};
        int K = 181;
        List<Integer> result = Arrays.asList(4, 5, 5);
        Assert.assertEquals(result, leetCode989.addToArrayForm(A, K));
    }

    @Test
    public void test3() {
        int[] A = {2, 1, 5};
        int K = 806;
        List<Integer> result = Arrays.asList(1, 0, 2, 1);
        Assert.assertEquals(result, leetCode989.addToArrayForm(A, K));
    }

    @Test
    public void test4() {
        int[] A = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        int K = 1;
        List<Integer> result = Arrays.asList(1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        Assert.assertEquals(result, leetCode989.addToArrayForm(A, K));
    }
}
