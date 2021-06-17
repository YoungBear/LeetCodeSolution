/*
 * Copyright (c) ysx. 2020-2021. All rights reserved.
 */

package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2021/6/17 22:59
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 852. 山脉数组的峰顶索引
 * https://leetcode-cn.com/problems/peak-index-in-a-mountain-array/
 */
public class LeetCode852 {
    /**
     * 二分法
     * 时间复杂度O(log(n))
     * 空间复杂度O(1)
     *
     * @param arr 数组
     * @return 峰顶索引
     */
    public int peakIndexInMountainArray(int[] arr) {
        int begin = 0;
        int end = arr.length - 1;
        int result = -1;
        while (begin <= end) {
            int mid = (begin + end) / 2;
            if (arr[mid] > arr[mid + 1]) {
                result = mid;
                end = mid - 1;
            } else {
                begin = mid + 1;
            }
        }
        return result;
    }

    /**
     * 由于存在左边单调递增，右边单调递减，即
     * arr[0] < arr[1] < ... arr[i-1] < arr[i]
     * arr[i] > arr[i+1] > ... > arr[arr.length - 1]
     * 只需要找到arr[i]>arr[i+1]的i即可
     * 时间复杂度O(n)
     * 空间复杂度O(1)
     *
     * @param arr 数组
     * @return 峰顶索引
     */
    public int peakIndexInMountainArray1(int[] arr) {
        int result = -1;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                result = i;
                break;
            }
        }
        return result;
    }

    /**
     * 获取最大值的下标
     * 时间复杂度O(n)
     * 空间复杂度O(1)
     *
     * @param arr 数组
     * @return 最大值下标
     */
    public int peakIndexInMountainArray2(int[] arr) {
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
