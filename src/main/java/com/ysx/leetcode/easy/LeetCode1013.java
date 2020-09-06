/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import java.util.stream.IntStream;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/11 22:19
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 1013. 将数组分成和相等的三个部分
 * https://leetcode-cn.com/problems/partition-array-into-three-parts-with-equal-sum/
 */
public class LeetCode1013 {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = IntStream.of(A).sum();
        int a = sum / 3;
        if (a * 3 != sum) {
            return false;
        }
        int sum1 = 0;
        int sum2 = 0;
        boolean flag1 = true;
        boolean flag2 = true;
        for (int value : A) {
            if (flag1) {
                flag1 = false;
                // 保证分组不为空，必须加添加一个元素
                sum1 += value;
                continue;
            }
            if (sum1 != a) {
                sum1 += value;
            } else {
                if (flag2) {
                    flag2 = false;
                    // 保证分组不为空，必须加添加一个元素
                    sum2 += value;
                    continue;
                }
                if (sum2 != a) {
                    sum2 += value;
                } else {
                    return true;
                }
            }
        }
        return false;
    }
}
