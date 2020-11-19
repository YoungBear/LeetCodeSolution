/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/11/19 23:56
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 283. 移动零
 * https://leetcode-cn.com/problems/move-zeroes/
 * 双指针
 */
public class LeetCode283 {
    /**
     * 先把非0的移动到最前边，然后把后边补0
     *
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                nums[i++] = nums[j];
            }
        }
        while (i < nums.length) {
            nums[i++] = 0;
        }
    }
}
