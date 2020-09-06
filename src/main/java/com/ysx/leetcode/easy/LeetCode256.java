/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/4/24 20:54
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 256. 粉刷房子
 * 标签：动态规划
 * 假如有一排房子，共 n 个，每个房子可以被粉刷成红色、蓝色或者绿色这三种颜色中的一种，你需要粉刷所有的房子并且使其相邻的两个房子颜色不能相同。
 * 当然，因为市场上不同颜色油漆的价格不同，所以房子粉刷成不同颜色的花费成本也是不同的。每个房子粉刷成不同颜色的花费是以一个 n x 3 的矩阵来表示的。
 * 例如，costs[0][0] 表示第 0 号房子粉刷成红色的成本花费；costs[1][2] 表示第 1 号房子粉刷成绿色的花费，以此类推。请你计算出粉刷完所有房子最少的花费成本。
 */
public class LeetCode256 {
    /**
     * 优化：可使用两个长度为3的数组代替dp
     * dpCur[0] = Math.min(dpPre[1], dpPre[2]) + costs[i][0];
     * dpCur[1] = Math.min(dpPre[0], dpPre[2]) + costs[i][1];
     * dpCur[2] = Math.min(dpPre[0], dpPre[1]) + costs[i][2];
     *
     * @param costs 花费
     * @return 最小花费值
     */
    public int minCost(int[][] costs) {
        if (costs == null || costs.length == 0) {
            return 0;
        }
        int[] dpPre = new int[3];
        int[] dpCur = new int[3];
        dpPre[0] = costs[0][0];
        dpPre[1] = costs[0][1];
        dpPre[2] = costs[0][2];
        for (int i = 1; i < costs.length; i++) {
            dpCur[0] = Math.min(dpPre[1], dpPre[2]) + costs[i][0];
            dpCur[1] = Math.min(dpPre[0], dpPre[2]) + costs[i][1];
            dpCur[2] = Math.min(dpPre[0], dpPre[1]) + costs[i][2];
            dpPre[0] = dpCur[0];
            dpPre[1] = dpCur[1];
            dpPre[2] = dpCur[2];
        }
        return Math.min(Math.min(dpPre[0], dpPre[1]), dpPre[2]);
    }
}
