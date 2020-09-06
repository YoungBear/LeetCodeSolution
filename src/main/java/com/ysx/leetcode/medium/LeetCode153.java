/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/22 13:46
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 153. 寻找旋转排序数组中的最小值
 * https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array/
 */
public class LeetCode153 {
    public int findMin(int[] nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                result = nums[i];
                break;
            }
        }
        return result;
    }
}
