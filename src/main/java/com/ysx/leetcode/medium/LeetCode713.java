/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/12/6 15:58
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 713. 乘积小于K的子数组
 * 滑动窗口
 * https://leetcode-cn.com/problems/subarray-product-less-than-k/
 */
public class LeetCode713 {

    /**
     * 滑动窗口
     *
     * @param nums
     * @param k
     * @return
     */
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }
        int result = 0;
        int left = 0;
        int right = 0;
        int product = 1;
        while (right < nums.length) {
            product = product * nums[right];
            while (product >= k) {
                product = product / nums[left];
                left++;
            }
            // 从left一直到right满足的个数
            result += right - left + 1;
            right++;
        }
        return result;
    }

}
