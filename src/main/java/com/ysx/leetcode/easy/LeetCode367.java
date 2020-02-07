package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/7 12:02
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 367. 有效的完全平方数
 * https://leetcode-cn.com/problems/valid-perfect-square/
 */
public class LeetCode367 {
    /**
     * 参考 LeetCode69
     * 执行用时 :0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗 :32.8 MB, 在所有 Java 提交中击败了74.45%的用户
     *
     * @param num
     * @return
     */
    public boolean isPerfectSquare(int num) {
        if (0 == num || 1 == num) {
            return true;
        }
        int begin = 1;
        int end = num / 2 + 1;
        int middle = 0;
        while (begin <= end) {
            middle = begin + (end - begin) / 2;
            if (middle <= num / middle && (middle + 1) > num / (middle + 1)) {
                break;
            }
            if (middle > num / middle) {
                end = middle - 1;
            } else {
                begin = middle + 1;
            }
        }
        return middle * middle == num;
    }
}
