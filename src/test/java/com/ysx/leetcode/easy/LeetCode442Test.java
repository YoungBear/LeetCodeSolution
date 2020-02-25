package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/25 20:57
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode442Test {
    @Test
    public void test1() {
        LeetCode442 leetCode442 = new LeetCode442();
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> duplicates = leetCode442.findDuplicates(nums);
        List<Integer> excepted = Arrays.asList(2, 3);
        Assert.assertEquals(excepted, duplicates);
    }
}
