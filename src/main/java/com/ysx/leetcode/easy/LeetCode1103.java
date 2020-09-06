/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/5 22:11
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 1103. 分糖果 II
 * https://leetcode-cn.com/problems/distribute-candies-to-people/
 */
public class LeetCode1103 {
    public int[] distributeCandies(int candies, int num_people) {
        int[] array = new int[num_people];
        // 共有m个，即1,2,3,...,m
        int m = (int) Math.sqrt(2 * candies);
        for (int i = 0; i < 10; i++) {
            if (m * (m + 1) / 2 <= candies) {
                m++;
            } else {
                break;
            }
        }
        int last = candies - m * (m - 1) / 2;
        int lastLineNumber = m % num_people;
        int height = m / num_people;
        if (height * num_people == m) {
            height--;
            lastLineNumber = num_people;
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = height * (i + 1) + height * (height - 1) * num_people / 2;
        }
        // 处理最后一行
        for (int i = 0; i < lastLineNumber - 1; i++) {
            array[i] += height * num_people + (i + 1);
        }
        // 处理最后一个元素
        array[lastLineNumber - 1] += last;
        return array;
    }
}
