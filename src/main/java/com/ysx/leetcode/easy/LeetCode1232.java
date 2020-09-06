/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/4 17:52
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 1232. 缀点成线
 * https://leetcode-cn.com/problems/check-if-it-is-a-straight-line/
 */
public class LeetCode1232 {
    /**
     * 判断点是否在一条直线上
     *
     * @param coordinates
     * @return
     */
    public boolean checkStraightLine(int[][] coordinates) {
        int x1 = coordinates[0][0];
        int y1 = coordinates[0][1];
        int x2 = coordinates[1][0];
        int y2 = coordinates[1][1];
        for (int i = 2; i < coordinates.length; i++) {
            if (((coordinates[i][0] - x1) * (y2 - y1)) != ((coordinates[i][1] - y1) * (x2 - x1))) {
                return false;
            }
        }
        return true;
    }
}
