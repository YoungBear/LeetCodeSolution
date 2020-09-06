/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/6/9 19:41
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 59. 螺旋矩阵 II
 * https://leetcode-cn.com/problems/spiral-matrix-ii/
 */
public class LeetCode59 {
    /**
     * 参考54.
     * 时间复杂度为 O(n*n)
     * 空间复杂度为 O(n*n)
     *
     * @param n
     * @return
     */
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        // directions 用于切换方向
        // 4个元素分别表示右，下，左，上
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int directionIndex = 0;
        int row = 0;
        int column = 0;
        int total = n * n;
        for (int i = 0; i < total; i++) {
            result[row][column] = i + 1;
            int nextRow = row + directions[directionIndex][0];
            int nextColumn = column + directions[directionIndex][1];
            if (nextRow < 0 || nextRow >= n || nextColumn < 0 || nextColumn >= n || result[nextRow][nextColumn] != 0) {
                // 切换方向
                directionIndex = (directionIndex + 1) % 4;
            }
            row += directions[directionIndex][0];
            column += directions[directionIndex][1];
        }
        return result;
    }
}
