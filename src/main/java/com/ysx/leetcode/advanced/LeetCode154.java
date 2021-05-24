/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.advanced;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/22 14:03
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 154. 寻找旋转排序数组中的最小值 II
 * https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array-ii/
 */
public class LeetCode154 {

    /**
     * 参考：https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array-ii/solution/xun-zhao-xuan-zhuan-pai-xu-shu-zu-zhong-de-zui--16/
     * <p>
     * 二分查找
     *
     * @param nums
     * @return
     */
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int pivot = low + (high - low) / 2;
            if (nums[pivot] < nums[high]) {
                // nums[pivot]是最小值右侧的元素，则可以忽略二分查找的右半部分
                high = pivot;
            } else if (nums[pivot] > nums[high]) {
                // nums[pivot]是最小值左侧的元素，则可以忽略二分查找的左半部分
                low = pivot + 1;
            } else {
                // 由于它们的值相同，所以无论nums[high] 是不是最小值，都有一个它的替代品nums[pivot]，因此我们可以忽略二分查找区间的右端点。
                high--;
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
