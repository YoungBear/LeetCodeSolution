package com.ysx.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/15 9:35
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 1346. 检查整数及其两倍数是否存在
 * https://leetcode-cn.com/problems/check-if-n-and-its-double-exist/
 */
public class LeetCode1346 {
    /**
     * 使用一个set存储元素，遍历每一个元素e，判断set中是否存在2*e或者e/2(需要整除2)，存在则返回true，均不存在则返回false
     * 执行用时 :2 ms, 在所有 Java 提交中击败了97.15%的用户
     * 内存消耗 :45.7 MB, 在所有 Java 提交中击败了100.00%的用户
     *
     * @param arr
     * @return
     */
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int e : arr) {
            if (set.contains(2 * e) || (e % 2 == 0 && set.contains(e / 2))) {
                return true;
            } else {
                set.add(e);
            }
        }
        return false;
    }
}
