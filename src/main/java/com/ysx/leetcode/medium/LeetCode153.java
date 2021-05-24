/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/22 13:46
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 153. 寻找旋转排序数组中的最小值
 * https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array/
 */
public class LeetCode153 {

    /**
     * 二分查找
     *
     * @param nums
     * @return
     */
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        // 由于不存在重复元素，当区间为1，结束二分查找，得到的就是最小值所在的位置
        while (low < high) {
            int pivot = low + (high - low) / 2;
            // nums[pivot]是最小值右侧的元素，则可以忽略二分查找的右半部分
            if (nums[pivot] < nums[high]) {
                high = pivot;
            } else {
                // nums[pivot]是最小值左侧的元素，则可以忽略二分查找的左半部分
                low = pivot + 1;
            }
        }
        return nums[low];
    }

    public int findMin1(int[] nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                result = nums[i];
                break;
            }
        }
        return result;
    }
}
