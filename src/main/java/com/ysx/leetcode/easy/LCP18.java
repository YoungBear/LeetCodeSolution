/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import java.util.Arrays;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/10/9 20:48
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description LCP 18. 早餐组合
 */
public class LCP18 {
    private static final int MODE = 1000000007;

    /**
     * 先排序，再使用双指针
     * 时间复杂度为 O(m+n)
     *
     * @param staple
     * @param drinks
     * @param x
     * @return
     */
    public int breakfastNumber(int[] staple, int[] drinks, int x) {
        Arrays.sort(staple);
        Arrays.sort(drinks);
        int sum = 0;
        for (int i = 0, j = drinks.length - 1; i < staple.length && j >= 0; ) {
            if (staple[i] + drinks[j] > x) {
                j--;
            } else {
                sum += j + 1;
                sum %= MODE;
                i++;
            }
        }
        return sum;
    }
}
