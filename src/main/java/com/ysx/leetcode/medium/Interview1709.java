/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/11/30 23:44
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 面试题 17.09. 第 k 个数
 * https://leetcode-cn.com/problems/get-kth-magic-number-lcci/
 * 动态规划
 * 三指针
 * 与 264. 丑数 II 相同：
 * https://leetcode-cn.com/problems/ugly-number-ii/
 */
public class Interview1709 {
    /**
     * 三指针
     * 动态规划
     * 与 264. 丑数 II 相同：
     * https://leetcode-cn.com/problems/ugly-number-ii/
     *
     * @param k
     * @return
     */
    public int getKthMagicNumber(int k) {
        int[] result = new int[k];
        result[0] = 1;
        int p3 = 0;
        int p5 = 0;
        int p7 = 0;
        for (int i = 1; i < k; i++) {
            result[i] = Math.min(result[p3] * 3, Math.min(result[p5] * 5, result[p7] * 7));
            if (result[i] == result[p3] * 3) {
                p3++;
            }
            if (result[i] == result[p5] * 5) {
                p5++;
            }
            if (result[i] == result[p7] * 7) {
                p7++;
            }
        }
        return result[k - 1];
    }
}
