/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/12/6 15:36
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 523. 连续的子数组和
 * 前缀和
 * https://leetcode-cn.com/problems/continuous-subarray-sum/
 */
public class LeetCode523 {
    /**
     * 前缀和
     *
     * @param nums
     * @param k
     * @return
     */
    public boolean checkSubarraySum(int[] nums, int k) {
        if (null == nums || 2 > nums.length) {
            return false;
        }
        int m = nums.length;

        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = i; j < m; j++) {
                sum += nums[j];
                if (i == j) {
                    continue;
                }
                if (sum == k || (k != 0 && sum % k == 0)) {
                    return true;
                }
            }
        }
        return false;
    }
}
