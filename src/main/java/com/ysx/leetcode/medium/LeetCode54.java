/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/6/9 19:36
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 54. 螺旋矩阵
 * https://leetcode-cn.com/problems/spiral-matrix/
 */
public class LeetCode54 {
    /**
     * 使用一个二维数组标记元素是否已经访问
     * 使用一个数组标记4个方向
     * 时间复杂度 O(mn)
     * 空间复杂度 O(mn)
     *
     * @param matrix
     * @return
     */
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return result;
        }
        // 行
        int rows = matrix.length;
        // 列
        int columns = matrix[0].length;
        // 标记数组
        boolean[][] visited = new boolean[rows][columns];
        int total = rows * columns;
        int row = 0;
        int column = 0;
        // directions 用于切换方向
        // 4个元素分别表示右，下，左，上
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int directionIndex = 0;
        for (int i = 0; i < total; i++) {
            result.add(matrix[row][column]);
            visited[row][column] = true;
            int nextRow = row + directions[directionIndex][0];
            int nextColumn = column + directions[directionIndex][1];
            if (nextRow < 0 || nextRow >= rows || nextColumn < 0 || nextColumn >= columns || visited[nextRow][nextColumn]) {
                // 切换方向
                directionIndex = (directionIndex + 1) % 4;
            }
            row += directions[directionIndex][0];
            column += directions[directionIndex][1];
        }
        return result;
    }
}
