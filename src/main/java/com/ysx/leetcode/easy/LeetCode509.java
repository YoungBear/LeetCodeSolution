package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/6/13 22:35
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 509. 斐波那契数
 * https://leetcode-cn.com/problems/fibonacci-number/
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 */
public class LeetCode509 {
    public int fib(int N) {
        if (N == 0 || N == 1) {
            return N;
        }
        int pre = 0;
        int cur = 1;
        int next = 1;
        for (int i = 0; i < N - 1; i++) {
            next = pre + cur;
            pre = cur;
            cur = next;
        }
        return next;
    }
}
