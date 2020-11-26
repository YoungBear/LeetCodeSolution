/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/11/27 0:03
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 74. 搜索二维矩阵
 * https://leetcode-cn.com/problems/search-a-2d-matrix/
 * 分治法
 */
public class LeetCode74 {
    /**
     * 二分查找
     *
     * @param nums   整型数组
     * @param target 目标值
     * @return 查找匹配的下标，如果没有匹配的则返回-1
     */
    public static int binarySearch(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int begin = 0;
        int end = nums.length - 1;
        int result = -1;
        while (begin <= end) {
            // 这种写法是防止begin+end溢出
            int middle = begin + (end - begin) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] > target) {
                end = middle - 1;
            } else {
                begin = middle + 1;
            }
        }
        return result;
    }

    /**
     * 分治法
     * 可以直接用二分法，作为一个一维数组
     *
     * @param matrix
     * @param target
     * @return
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if (m == 0) {
            return false;
        }
        int n = matrix[0].length;
        if (n == 0 || target < matrix[0][0] || target > matrix[m - 1][n - 1]) {
            return false;
        }
        for (int i = 0; i < m; i++) {
            if (-1 != binarySearch(matrix[i], target)) {
                return true;
            }
        }
        return false;
    }
}
