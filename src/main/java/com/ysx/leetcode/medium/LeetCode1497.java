package com.ysx.leetcode.medium;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/6/30 22:17
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 1497. 检查数组对是否可以被 k 整除
 * https://leetcode-cn.com/problems/check-if-array-pairs-are-divisible-by-k/
 */
public class LeetCode1497 {
    /**
     * 使用长度为k的数组记录余数的个数，如果两个余数加起来为k，则把这两个数据删除
     * ...
     * 如果遍历完成后，还有数据，则说明不能组对，返回false，否则返回true
     * 时间复杂度： O(n)
     * 空间复杂度：O(k)
     *
     * @param arr
     * @param k
     * @return
     */
    public boolean canArrange(int[] arr, int k) {
        int[] count = new int[k];
        for (int a : arr) {
            int n = (a % k + k) % k;
            if (n == 0) {
                if (count[0] > 0) {
                    count[0]--;
                } else {
                    count[0]++;
                }
            } else {
                if (count[k - n] > 0) {
                    count[k - n]--;
                } else {
                    count[n]++;
                }
            }
        }
        for (int c : count) {
            if (c > 0) {
                return false;
            }
        }
        return true;
    }
}
