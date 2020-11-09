/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import java.util.Arrays;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/11/9 23:06
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 215. 数组中的第K个最大元素
 * https://leetcode-cn.com/problems/kth-largest-element-in-an-array/
 */
public class LeetCode215 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
