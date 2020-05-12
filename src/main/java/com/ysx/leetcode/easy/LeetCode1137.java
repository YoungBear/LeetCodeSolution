package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/5/12 21:47
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 1137. 第 N 个泰波那契数
 * https://leetcode-cn.com/problems/n-th-tribonacci-number/
 */
public class LeetCode1137 {
    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        int p1 = 0;
        int p2 = 1;
        int p3 = 1;
        for (int i = 2; i < n; i++) {
            int temp = p1 + p2 + p3;
            p1 = p2;
            p2 = p3;
            p3 = temp;
        }
        return p3;
    }
}
