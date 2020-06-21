package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/6/21 16:27
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 1480. 一维数组的动态和
 * https://leetcode-cn.com/problems/running-sum-of-1d-array/
 */
public class LeetCode1480 {
    public int[] runningSum(int[] nums) {
        int[] answer = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            answer[i] = sum;
        }
        return answer;
    }
}
