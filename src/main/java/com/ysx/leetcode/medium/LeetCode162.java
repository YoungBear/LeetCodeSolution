/*
 * Copyright (c) ysx. 2020-2021. All rights reserved.
 */

package com.ysx.leetcode.medium;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2021/6/20 18:17
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * 162. 寻找峰值
 * https://leetcode-cn.com/problems/find-peak-element/
 * 二分查找
 */
public class LeetCode162 {

    /**
     * 迭代二分查找
     * 时间复杂度 O(logN)
     * 空间复杂度 O(1)
     * 查找递增部分的最右侧的值（最大值）
     *
     * @param nums 入参数组
     * @return 峰值 index
     */
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }

    /**
     * 递归二分查找
     * 时间复杂度 O(logN)
     * 空间复杂度 O(logN)
     * 参考：https://leetcode-cn.com/problems/find-peak-element/solution/xun-zhao-feng-zhi-by-leetcode/ 方法二：递归二分查找
     *
     * @param nums 入参数组
     * @return 峰值 index
     */
    public int findPeakElement1(int[] nums) {
        return search(nums, 0, nums.length - 1);
    }

    /**
     * 递归二分查找
     * 查找递增部分的最高点
     *
     * @param nums  入参数组
     * @param left  left
     * @param right right
     * @return 峰值 index
     */
    public int search(int[] nums, int left, int right) {
        if (left == right) {
            return left;
        }
        int mid = (left + right) / 2;
        if (nums[mid] > nums[mid + 1]) {
            return search(nums, left, mid);
        }
        return search(nums, mid + 1, right);
    }

    /**
     * 利用每个元素不相等的特征
     * 只需要不保证nums[i] > nums[i + 1]即可以找到峰值
     * 在循环未找到时（单调递增），返回最后一个元素
     * 参考：https://leetcode-cn.com/problems/find-peak-element/solution/xun-zhao-feng-zhi-by-leetcode/
     * 时间复杂度 O(n)
     *
     * @param nums 入参数组
     * @return 峰值
     */
    public int findPeakElement2(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return i;
            }
        }
        return nums.length - 1;
    }
}
