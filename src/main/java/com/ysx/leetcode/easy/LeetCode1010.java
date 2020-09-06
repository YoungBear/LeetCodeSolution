/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/1 21:24
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 1010. 总持续时间可被 60 整除的歌曲
 * https://leetcode-cn.com/problems/pairs-of-songs-with-total-durations-divisible-by-60/
 */
public class LeetCode1010 {

    /**
     * 取余数，时间复杂度为O(n)，空间复杂度为O(1)
     *
     * @param time
     * @return
     */
    public int numPairsDivisibleBy60(int[] time) {
        int result = 0;
        // 存储当前对60取余为R的个数，如counters[0]的值表示当前对60取余为0的个数，counters[1]的值表示当前对60取余为1的个数
        int[] counters = new int[60];
        for (int n : time) {
            int remainder = n % 60;
            // 当前数对60取余为0，说明它可以跟前边所有对60取余为0的数组成一个满足条件的一对数
            if (0 == remainder) {
                result += counters[0];
            } else {
                // 当前数对60取余为remainder，则他可以跟浅表所有对60取余为60-remainder的数组成一个满足条件的一对数
                result += counters[60 - remainder];
            }
            counters[remainder]++;
        }
        return result;
    }

    /**
     * 直接二重循环，超时。时间复杂度为O(n*n)，空间复杂度为O(1)
     *
     * @param time
     * @return
     */
    public int numPairsDivisibleBy602(int[] time) {
        int result = 0;
        for (int i = 0; i < time.length; i++) {
            for (int j = i + 1; j < time.length; j++) {
                if ((time[i] + time[j]) % 60 == 0) {
                    result++;
                }
            }
        }
        return result;
    }
}
