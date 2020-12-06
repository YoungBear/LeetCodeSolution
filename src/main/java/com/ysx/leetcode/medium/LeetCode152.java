/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/12/6 17:09
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 152. 乘积最大子数组
 * https://leetcode-cn.com/problems/maximum-product-subarray/
 * 动态规划
 */
public class LeetCode152 {
    /**
     * https://leetcode-cn.com/problems/maximum-product-subarray/solution/hua-jie-suan-fa-152-cheng-ji-zui-da-zi-xu-lie-by-g/
     * 动态规划
     * 由于存在负数，所以需要维护最大值 imax 和最小值 imin
     * 遍历 imax = max(imax * n, n), imin = min(imin * n, n)
     * 当 n 为负数时，imax 和 imin 需要交换
     * 时间复杂度：O(n)
     *
     * @param nums
     * @return
     */
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int imax = 1;
        int imin = 1;
        for (int n : nums) {
            if (n < 0) {
                int temp = imax;
                imax = imin;
                imin = temp;
            }
            imax = Math.max(imax * n, n);
            imin = Math.min(imin * n, n);
            max = Math.max(max, imax);
        }
        return max;
    }
}
