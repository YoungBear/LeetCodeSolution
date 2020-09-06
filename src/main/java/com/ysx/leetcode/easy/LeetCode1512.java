/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/7/18 23:12
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 1512. 好数对的数目
 * https://leetcode-cn.com/problems/number-of-good-pairs/
 */
public class LeetCode1512 {
    /**
     * 将相同的数分成一组，然后对于每组的数，求其组合，即 Cu(n,2)，将所以数目相加即可
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     *
     * @param nums 整数数组
     * @return 好数对对数
     */
    public int numIdenticalPairs(int[] nums) {
        int[] counts = new int[101];
        for (int num : nums) {
            counts[num]++;
        }
        int result = 0;
        for (int count : counts) {
            if (count >= 2) {
                result += count * (count - 1) / 2;
            }
        }
        return result;
    }
}
