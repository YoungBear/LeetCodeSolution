/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/18 22:32
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 836. 矩形重叠
 * https://leetcode-cn.com/problems/rectangle-overlap/
 */
public class LeetCode836 {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        // 逆向思维
        // 两个矩形不相交，则 r2 可以在 r1 的上下左右任意一个位置
        return !(rec2[1] >= rec1[3] || // 上
                rec2[3] <= rec1[1] || // 下
                rec2[2] <= rec1[0] || // 左
                rec2[0] >= rec1[2]); // 右
    }
}
