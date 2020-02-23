package com.ysx.leetcode.easy;

import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/23 10:02
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode1243Test {
    @Test
    public void test1() {
        LeetCode1243 leetCode1243 = new LeetCode1243();
        int[] arr = {6, 2, 3, 4};
        List<Integer> resultList = leetCode1243.transformArray(arr);
        List<Integer> expectedList = Arrays.asList(6, 3, 3, 4);
        Assert.assertEquals(expectedList.get(0), resultList.get(0));
        Assert.assertEquals(expectedList.get(1), resultList.get(1));
        Assert.assertEquals(expectedList.get(2), resultList.get(2));
        Assert.assertEquals(expectedList.get(3), resultList.get(3));
    }

    @Test
    public void test2() {
        LeetCode1243 leetCode1243 = new LeetCode1243();
        int[] arr = {1, 6, 3, 4, 3, 5};
        List<Integer> resultList = leetCode1243.transformArray(arr);
        List<Integer> expectedList = Arrays.asList(1, 4, 4, 4, 4, 5);
        Assert.assertEquals(expectedList.get(0), resultList.get(0));
        Assert.assertEquals(expectedList.get(1), resultList.get(1));
        Assert.assertEquals(expectedList.get(2), resultList.get(2));
        Assert.assertEquals(expectedList.get(3), resultList.get(3));
        Assert.assertEquals(expectedList.get(4), resultList.get(4));
        Assert.assertEquals(expectedList.get(5), resultList.get(5));
    }
}
