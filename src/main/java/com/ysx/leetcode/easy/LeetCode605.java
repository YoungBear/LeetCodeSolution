/*
 * Copyright (c) ysx. 2020-2021. All rights reserved.
 */

package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2021/6/20 18:23
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * 605. 种花问题
 * https://leetcode-cn.com/problems/can-place-flowers/
 */
public class LeetCode605 {
    /**
     * 循环
     * 时间复杂度 O(N)
     *
     * @param flowerbed 花坛数组
     * @param n 新种n朵花
     * @return 是否可以种入
     */
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 && canPlace(flowerbed, i)) {
                flowerbed[i] = 1;
                n--;
                if (n <= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * index是否可以种花
     *
     * @param flowerbed 花坛数组
     * @param index 下标
     * @return 是否可以种花
     */
    private boolean canPlace(int[] flowerbed, int index) {
        if (flowerbed.length == 1) {
            return true;
        }
        if (index <= 0) {
            return flowerbed[index + 1] == 0;
        }
        if (index == flowerbed.length - 1) {
            return flowerbed[index - 1] == 0;
        }
        return flowerbed[index - 1] == 0 && flowerbed[index + 1] == 0;
    }
}
