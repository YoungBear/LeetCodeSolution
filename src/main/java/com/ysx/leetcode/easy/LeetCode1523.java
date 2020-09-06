/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/7/30 22:50
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description LeetCode 1523. 在区间范围内统计奇数数目
 * https://leetcode-cn.com/problems/count-odd-numbers-in-an-interval-range/
 */
public class LeetCode1523 {
    public int countOdds(int low, int high) {
        int count = (high - low) / 2;
        return (low % 2 == 0 && high % 2 == 0) ? count : count + 1;
    }
}
