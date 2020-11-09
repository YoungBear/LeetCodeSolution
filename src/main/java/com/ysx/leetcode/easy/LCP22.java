/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/11/9 23:02
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description LCP 22. 黑白方格画
 * https://leetcode-cn.com/problems/ccw6C7/
 */
public class LCP22 {
    /**
     * 求C(n,a)，即组合
     *
     * @param n
     * @param a
     * @return
     */
    public static int combination(int n, int a) {
        int result = 1;
        for (int i = n; i > n - a; i--) {
            result *= i;
        }
        for (int i = a; i > 0; i--) {
            result /= i;
        }
        return result;
    }

    /**
     * 涂了i行，j列，那么所涂的方块数量应该为 i*n + j*(n-i)
     *
     * @param n
     * @param k
     * @return
     */
    public int paintingPlan(int n, int k) {
        if (k == 0) {
            return 1;
        }
        if (k < n) {
            return 0;
        }
        if (k == n * n) {
            return 1;
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (k == (i * n + j * (n - i))) {
                    result += combination(n, j) * combination(n, i);
                }
            }
        }
        return result;
    }
}
