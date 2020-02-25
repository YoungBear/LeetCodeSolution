package com.ysx.leetcode.medium;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/25 22:03
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 209. 长度最小的子数组
 * https://leetcode-cn.com/problems/minimum-size-subarray-sum/
 */
public class LeetCode209 {
    /**
     * 双指针
     *
     * @param s
     * @param nums
     * @return
     */
    public int minSubArrayLen(int s, int[] nums) {
        int left = 0;
        int right = 0;
        int sum = 0;
        while (right < nums.length && sum < s) {
            sum += nums[right++];
        }
        // 如果数组全部的和都小于s，则返回0
        if (sum < s) {
            return 0;
        }
        // 全部的和满足，但是前n-1个元素不满足，特殊处理
        if (right == nums.length) {
            while (sum >= s) {
                sum -= nums[left];
                left++;
            }
            return right - left + 1;
        }
        // 动态规划
        int result = right - left;
        while (left <= right && right < nums.length) {
            sum = sum - nums[left] + nums[right];
            left++;
            while (left <= right && sum >= s) {
                sum -= nums[left];
                left++;
            }
            left--;
            sum += nums[left];
            result = Math.min(result, right - left + 1);
            right++;
        }
        return result;
    }
}
