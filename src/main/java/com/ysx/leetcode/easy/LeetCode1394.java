/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/4/4 20:37
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 1394. 找出数组中的幸运数
 * https://leetcode-cn.com/problems/find-lucky-integer-in-an-array/
 * 在整数数组中，如果一个整数的出现频次和它的数值大小相等，我们就称这个整数为「幸运数」。
 * <p>
 * 给你一个整数数组 arr，请你从中找出并返回一个幸运数。
 * <p>
 * 如果数组中存在多个幸运数，只需返回 最大 的那个。
 * 如果数组中不含幸运数，则返回 -1 。
 * 提示：
 * <p>
 * 1 <= arr.length <= 500
 * 1 <= arr[i] <= 500
 */
public class LeetCode1394 {
    private static final int MAX_LENGTH = 500;

    public int findLucky(int[] arr) {
        int[] count = new int[MAX_LENGTH];
        for (int a : arr) {
            count[a]++;
        }
        int result = -1;
        for (int i = 1; i < MAX_LENGTH; i++) {
            if (i == count[i]) {
                result = i;
            }
        }
        return result;
    }
}
