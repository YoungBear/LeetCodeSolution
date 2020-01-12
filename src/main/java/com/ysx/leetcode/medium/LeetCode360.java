package com.ysx.leetcode.medium;

import java.util.Arrays;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/1/12 22:18
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 360. 有序转化数组
 * https://leetcode-cn.com/problems/sort-transformed-array/
 * 给你一个已经 排好序 的整数数组 nums 和整数 a、b、c。对于数组中的每一个数 x，计算函数值 f(x) = ax2 + bx + c，请将函数值产生的数组返回。
 * <p>
 * 要注意，返回的这个数组必须按照 升序排列，并且我们所期望的解法时间复杂度为 O(n)。
 */
public class LeetCode360 {
    /**
     * 根据函数的导数，找到极值的坐标，然后类似 977题目往两边遍历
     * 1. 先判断 a 是否为 0，a 为 0 则按照直线处理
     * 2. 如果 a > 0
     * 3. 如果 a < 0
     *
     * @param nums
     * @param a
     * @param b
     * @param c
     * @return
     */
    public int[] sortTransformedArray(int[] nums, int a, int b, int c) {
        int R[] = new int[nums.length];
        if (0 == a) {
            if (0 == b) {
                // fx 为常数 c
                Arrays.fill(R, c);
            } else if (b > 0) {
                // fx 为斜率为正数的直线
                for (int i = 0; i < nums.length; i++) {
                    R[i] = f(nums[i], a, b, c);
                }
            } else {
                // fx 为斜率为负数的直线
                for (int i = 0; i < nums.length; i++) {
                    R[i] = f(nums[nums.length - i - 1], a, b, c);
                }
            }
        } else if (a > 0) {
            // 向上的抛物线，有最小值
            // 从中间往两边遍历
            double x0 = -(double) b / (2 * a);
            int minAbsIndex = findMinAbsIndex(nums, x0);
            int k = 0;

            R[k++] = f(nums[minAbsIndex], a, b, c);
            int i = minAbsIndex - 1;
            int j = minAbsIndex + 1;
            while (i >= 0 && j < nums.length) {
                if (Math.abs(nums[i] - x0) < Math.abs(nums[j] - x0)) {
                    R[k++] = f(nums[i--], a, b, c);
                } else {
                    R[k++] = f(nums[j++], a, b, c);
                }
            }
            while (i >= 0) {
                R[k++] = f(nums[i--], a, b, c);
            }
            while (j < nums.length) {
                R[k++] = f(nums[j++], a, b, c);
            }

        } else {
            // 向下的抛物线，有最大值
            // 从两边往中间遍历
            double x0 = -(double) b / (2 * a);
            int k = 0;
            int i = 0;
            int j = nums.length - 1;
            while (i <= j) {
                if (Math.abs(nums[i] - x0) > Math.abs(nums[j] - x0)) {
                    R[k++] = f(nums[i++], a, b, c);
                } else {
                    R[k++] = f(nums[j--], a, b, c);
                }
            }
        }
        return R;
    }

    private int f(int x, int a, int b, int c) {
        return a * x * x + b * x + c;
    }

    /**
     * 找到距离极值点最近的下标
     * 时间复杂度为 O(n)
     *
     * @param A
     * @return
     */
    private int findMinAbsIndex(int[] A, double x0) {
        int index = 0;
        for (int i = 0; i < A.length; i++) {
            if (Math.abs(A[i] - x0) < Math.abs(A[index] - x0)) {
                index = i;
            }
        }
        return index;
    }
}
