package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/8/1 19:49
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 1470. 重新排列数组
 * https://leetcode-cn.com/problems/shuffle-the-array/
 */
public class LeetCode1479 {

    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        for (int i = 0, j = n; i < n; i++, j++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[j];
        }
        return result;
    }
}
