/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/6/4 22:25
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 238. 除自身以外数组的乘积
 */
public class LeetCode238 {

    /**
     * 使用数组result，表示当前下标左侧所有数的乘积
     * 使用变量right表示当前下标所有右侧的数的乘积
     * 从最后一个节点遍历，逐渐填充每一个元素
     * 时间复杂度O(n)
     * 空间复杂度O(1)
     *
     * @param nums
     * @return
     */
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }
        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] = result[i] * right;
            right *= nums[i];
        }
        return result;
    }

    /**
     * 使用两个数组left和right，分别表示当前下标左侧和右侧的所有数的乘积
     * 时间复杂度O(n)
     * 空间复杂度O(n)
     *
     * @param nums
     * @return
     */
    public int[] productExceptSelf2(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        left[0] = 1;
        right[nums.length - 1] = 1;
        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] * nums[i - 1];
            right[nums.length - 1 - i] = right[nums.length - i] * nums[nums.length - i];
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = left[i] * right[i];
        }
        return result;
    }
}
