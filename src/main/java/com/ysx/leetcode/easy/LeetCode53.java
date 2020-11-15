/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/11/15 22:53
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 53. 最大子序和
 * https://leetcode-cn.com/problems/maximum-subarray/
 * 动态规划
 * 分治法
 */
public class LeetCode53 {

    /**
     * 动态规划
     * dp[i] 表示以第i个数结尾的连续子数组的最大和
     * dp[i] = max(dp[i-1] + nums[i], nums[i])
     * 求 max(dp[i])
     * 时间复杂度 O(n)
     * 空间复杂度 O(n)
     *
     * @param nums
     * @return
     */
    public int maxSubArray2(int[] nums) {
        int[] dp = new int[nums.length];
        int max = nums[0];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            max = Math.max(max, dp[i]);
        }
        return max;
    }


    /**
     * 动态规划
     * dp[i] 表示以第i个数结尾的连续子数组的最大和
     * dp[i] = max(dp[i-1] + nums[i], nums[i])
     * 求 max(dp[i])
     * 空间复杂度优化大常数级
     * 时间复杂度 O(n)
     * 空间复杂度 O(1)
     *
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int cur = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            cur = Math.max(cur + nums[i], nums[i]);
            max = Math.max(max, cur);
        }
        return max;
    }
}
