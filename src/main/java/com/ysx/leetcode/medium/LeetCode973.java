/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/11/9 23:03
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 973. 最接近原点的 K 个点
 * https://leetcode-cn.com/problems/k-closest-points-to-origin/
 */
public class LeetCode973 {
    /**
     * 先排序，再取前K个元素
     *
     * @param points
     * @param K
     * @return
     */
    public int[][] kClosest(int[][] points, int K) {
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return (o1[0] * o1[0] + o1[1] * o1[1]) - (o2[0] * o2[0] + o2[1] * o2[1]);
            }
        });
        return Arrays.copyOfRange(points, 0, K);
    }

    public int[][] kClosest2(int[][] points, int K) {
        Arrays.sort(points, (o1, o2) -> (o1[0] * o1[0] + o1[1] * o1[1]) - (o2[0] * o2[0] + o2[1] * o2[1]));
        return Arrays.copyOfRange(points, 0, K);
    }

    public int[][] kClosest3(int[][] points, int K) {
        Arrays.sort(points, Comparator.comparingInt(o -> (o[0] * o[0] + o[1] * o[1])));
        return Arrays.copyOfRange(points, 0, K);
    }
}
