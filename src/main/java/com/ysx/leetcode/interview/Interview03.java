/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.interview;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/21 23:31
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 面试题03. 数组中重复的数字
 * https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/
 */
public class Interview03 {
    public int findRepeatNumber(int[] nums) {
        // 把元素大小改为 1-n
        // 参考 LeetCode442 https://leetcode-cn.com/problems/find-all-duplicates-in-an-array/
        for (int i = 0; i < nums.length; i++) {
            nums[i]++;
        }
        for (int num : nums) {
            if (nums[Math.abs(num)-1] < 0) {
                return Math.abs(num) - 1;
            } else {
                nums[Math.abs(num) - 1] *= -1;
            }
        }
        throw new RuntimeException("has no answer.");
    }
}
