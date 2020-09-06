/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/1/18 08:29
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description LCP 2. 分式化简
 * https://leetcode-cn.com/problems/deep-dark-fraction/
 */
public class LeetCodeLCP2 {

    /**
     * up 表示分子，down 表示分母
     * 递推公式： up = up + cont[i] * down，然后交换 up 和 down
     *
     * @param cont
     * @return
     */
    public int[] fraction(int[] cont) {
        int up = 1;
        int down = cont[cont.length - 1];
        int temp;
        for (int i = cont.length - 2; i >= 0; i--) {
            up += cont[i] * down;
            temp = up;
            up = down;
            down = temp;
        }
        // 多交换了一次
        return new int[]{down, up};
    }
}
