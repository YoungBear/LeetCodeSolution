package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/8 20:35
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode1018Test {
    @Test
    public void test1() {
        LeetCode1018 leetCode1018 = new LeetCode1018();
        int[] A = {0, 1, 1};
        List<Boolean> excepted = Arrays.asList(true, false, false);
        List<Boolean> result = leetCode1018.prefixesDivBy5(A);
        Assert.assertEquals(excepted.get(0), result.get(0));
        Assert.assertEquals(excepted.get(1), result.get(1));
        Assert.assertEquals(excepted.get(2), result.get(2));
    }

    @Test
    public void test2() {
        LeetCode1018 leetCode1018 = new LeetCode1018();
        int[] A = {1, 1, 1};
        List<Boolean> excepted = Arrays.asList(false, false, false);
        List<Boolean> result = leetCode1018.prefixesDivBy5(A);
        Assert.assertEquals(excepted.get(0), result.get(0));
        Assert.assertEquals(excepted.get(1), result.get(1));
        Assert.assertEquals(excepted.get(2), result.get(2));
    }

    @Test
    public void test3() {
        LeetCode1018 leetCode1018 = new LeetCode1018();
        int[] A = {0, 1, 1, 1, 1, 1};
        List<Boolean> excepted = Arrays.asList(true, false, false, false, true, false);
        List<Boolean> result = leetCode1018.prefixesDivBy5(A);
        Assert.assertEquals(excepted.get(0), result.get(0));
        Assert.assertEquals(excepted.get(1), result.get(1));
        Assert.assertEquals(excepted.get(2), result.get(2));
        Assert.assertEquals(excepted.get(3), result.get(3));
        Assert.assertEquals(excepted.get(4), result.get(4));
        Assert.assertEquals(excepted.get(5), result.get(5));
    }

    @Test
    public void test4() {
        LeetCode1018 leetCode1018 = new LeetCode1018();
        int[] A = {1, 1, 1, 0, 1};
        List<Boolean> excepted = Arrays.asList(false, false, false, false, false);
        List<Boolean> result = leetCode1018.prefixesDivBy5(A);
        Assert.assertEquals(excepted.get(0), result.get(0));
        Assert.assertEquals(excepted.get(1), result.get(1));
        Assert.assertEquals(excepted.get(2), result.get(2));
        Assert.assertEquals(excepted.get(3), result.get(3));
        Assert.assertEquals(excepted.get(4), result.get(4));
    }
}
