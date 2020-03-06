package com.ysx.leetcode.interview;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/6 22:31
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class Interview57Test {
    @Test
    public void test1() {
        Interview57 interview57 = new Interview57();
        int target = 9;
        int[][] excepted = {{2, 3, 4}, {4, 5}};
        Assert.assertArrayEquals(excepted, interview57.findContinuousSequence(target));
    }

    @Test
    public void test2() {
        Interview57 interview57 = new Interview57();
        int target = 15;
        int[][] excepted = {{1, 2, 3, 4, 5}, {4, 5, 6}, {7, 8}};
        Assert.assertArrayEquals(excepted, interview57.findContinuousSequence(target));
    }
}
