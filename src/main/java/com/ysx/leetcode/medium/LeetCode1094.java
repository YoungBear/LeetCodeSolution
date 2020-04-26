package com.ysx.leetcode.medium;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/4/26 22:25
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 1094. 拼车
 */
public class LeetCode1094 {
    /**
     * 优化，记录数量变化
     *
     * @param trips
     * @param capacity
     * @return
     */
    public boolean carPooling(int[][] trips, int capacity) {
        int[] countChanges = new int[1000];
        for (int[] trip : trips) {
            countChanges[trip[1]] += trip[0];
            countChanges[trip[2]] -= trip[0];
        }
        int currentCount = 0;
        for (int countChange : countChanges) {
            currentCount += countChange;
            if (currentCount > capacity) {
                return false;
            }
        }
        return true;
    }
}
