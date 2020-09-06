/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/7/19 10:01
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 1491. 去掉最低工资和最高工资后的工资平均值
 * https://leetcode-cn.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
 */
public class LeetCode1491 {
    public double average(int[] salary) {
        int sum = 0;
        int max = salary[0];
        int min = salary[0];
        for (int sa : salary) {
            sum += sa;
            if (sa > max) {
                max = sa;
            }
            if (sa < min) {
                min = sa;
            }
        }
        double result = (sum - max - min) / (double) (salary.length - 2);
        return result;
    }
}
