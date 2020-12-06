/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import java.util.Arrays;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/12/6 16:26
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 724. 寻找数组的中心索引
 * https://leetcode-cn.com/problems/find-pivot-index/
 * 前缀和
 * 双指针
 */
public class LeetCode724 {

    /**
     * 前缀和
     *
     * @param nums
     * @return
     */
    public int pivotIndex(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        int sum = Arrays.stream(nums).sum();
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum * 2 == sum - nums[i]) {
                return i;
            } else {
                leftSum += nums[i];
            }
        }
        return -1;
    }

    /**
     * 双指针
     *
     * @param nums
     * @return
     */
    public int pivotIndexOld(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        int sum = Arrays.stream(nums).sum();
        int left = 0;
        int right = sum;
        for (int i = 0; i < nums.length; i++) {
            if (i != 0) {
                left += nums[i - 1];
            }
            right -= nums[i];
            if (left == right) {
                return i;
            }
        }
        return -1;
    }
}
