/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/25 22:04
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 892. 三维形体的表面积
 * https://leetcode-cn.com/problems/surface-area-of-3d-shapes/
 */
public class LeetCode892 {
    /**
     * 先计算当前元素贡献的表面积，然后再减去相邻的两个元素重合的部分
     * 时间复杂度为 O(N*N)
     * 空间复杂度为O(1)
     *
     * @param grid
     * @return
     */
    public int surfaceArea(int[][] grid) {
        int area = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] > 0) {
                    // 获取当前这个元素贡献的表面积，4 个侧面积和 2 个顶面和地面
                    area += grid[i][j] * 4 + 2;
                    // 减去和 grid[i-1][j] 重合的面积
                    if (i > 0) {
                        area -= Math.min(grid[i - 1][j], grid[i][j]) * 2;
                    }
                    // 减去和 grid[i][j-1] 重合的面积
                    if (j > 0) {
                        area -= Math.min(grid[i][j - 1], grid[i][j]) * 2;
                    }
                }
            }
        }
        return area;
    }
}
