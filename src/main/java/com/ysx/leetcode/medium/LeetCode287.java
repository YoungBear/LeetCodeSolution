/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/5/26 23:16
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 287. 寻找重复数
 */
public class LeetCode287 {
    public int findDuplicate(int[] nums) {
        for (int i = 0;i < nums.length; i++) {
            int index = Math.abs(nums[i]);
            // 如果该位置元素已经被修改过，则index已经出现过一次
            if (nums[index] < 0) {
                return index;
            } else {
                nums[index] = - nums[index];
            }
        }
        return 0;
    }
}
