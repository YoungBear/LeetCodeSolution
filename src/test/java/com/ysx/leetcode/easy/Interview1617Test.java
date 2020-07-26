package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/7/26 9:43
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class Interview1617Test {
    @Test
    public void test1() {
        Interview1617 interview1617 = new Interview1617();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int excepted = 6;
        Assert.assertEquals(excepted, interview1617.maxSubArray(nums));
    }
}
