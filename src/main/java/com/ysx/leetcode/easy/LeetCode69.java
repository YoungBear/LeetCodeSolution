package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/7 10:33
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 69. x 的平方根
 * https://leetcode-cn.com/problems/sqrtx/
 */
public class LeetCode69 {
    /**
     * 执行用时 :2 ms, 在所有 Java 提交中击败了83.44%的用户
     * 内存消耗 :33.6 MB, 在所有 Java 提交中击败了60.43%的用户
     *
     * @param x
     * @return
     */
    public int mySqrt(int x) {
        if (0 == x || 1 == x) {
            return x;
        }
        int begin = 1;
        int end = x / 2 + 1;
        int middle = 0;
        while (begin <= end) {
            middle = begin + (end - begin) / 2;
            if (middle <= x / middle && (middle + 1) > x / (middle + 1)) {
                return middle;
            }
            if (middle > x / middle) {
                end = middle - 1;
            } else {
                begin = middle + 1;
            }
        }
        return middle;
    }
}
