/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/15 15:24
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 905. 按奇偶排序数组
 * https://leetcode-cn.com/problems/sort-array-by-parity/
 * 给定一个非负整数数组 A，返回一个数组，在该数组中， A 的所有偶数元素之后跟着所有奇数元素。
 * <p>
 * 你可以返回满足此条件的任何数组作为答案。
 * <p>
 * **示例：**
 * <p>
 * ```
 * 输入：[3,1,2,4]
 * 输出：[2,4,3,1]
 * 输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
 * ```
 */
public class LeetCode905 {
    public int[] sortArrayByParity(int[] A) {
        int[] result = new int[A.length];
        int i = 0;
        int j = result.length - 1;
        for (int e : A) {
            if (e % 2 == 0) {
                result[i++] = e;
            } else {
                result[j--] = e;
            }
        }
        return result;
    }
}
