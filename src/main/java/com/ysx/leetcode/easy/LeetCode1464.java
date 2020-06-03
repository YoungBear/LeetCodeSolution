package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/6/3 21:16
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 1464. 数组中两元素的最大乘积
 */
public class LeetCode1464 {
    public int maxProduct(int[] nums) {
        int max = (nums[0] - 1) * (nums[1] - 1);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] - 1) * (nums[j] - 1) > max) {
                    max = (nums[i] - 1) * (nums[j] - 1);
                }
            }
        }
        return max;
    }
}
