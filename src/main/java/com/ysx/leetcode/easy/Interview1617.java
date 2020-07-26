package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/7/26 9:40
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 面试题 16.17. 连续数列
 * https://leetcode-cn.com/problems/contiguous-sequence-lcci/
 */
public class Interview1617 {
    /**
     * 用 dp[i] 表示包含当前节点连续数列的和的最大值
     * 状态转移方程：dp[i] = max(dp[i-1] + nums[i], nums[i])
     * 可以优化为一个变量
     * 用 max 表示最大的和的值
     *
     * @param nums 输入数组
     * @return 连续数列的最大和
     */
    public int maxSubArray(int[] nums) {
        if (null == nums || nums.length == 0) {
            return 0;
        }
        int cur = nums[0];
        int max = cur;
        for (int i = 1; i < nums.length; i++) {
            cur = Math.max(cur + nums[i], nums[i]);
            max = Math.max(max, cur);
        }
        return max;
    }
}
