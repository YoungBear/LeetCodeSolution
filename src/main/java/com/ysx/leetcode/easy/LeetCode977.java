package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/1/12 22:13
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 977. 有序数组的平方
 * https://leetcode-cn.com/problems/squares-of-a-sorted-array/
 * 给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
 */
public class LeetCode977 {
    /**
     * 先找到绝对值最小的数的下标 minAbsIndex
     * 然后以 minAbsIndex 为中心，向两边循环，每次取绝对值小的数的平方放到结果数组中
     * 时间复杂度为 O(n)
     *
     * @param A
     * @return
     */
    public int[] sortedSquares(int[] A) {
        int[] R = new int[A.length];
        int minAbsIndex = findMinAbsIndex(A);
        int k = 0;

        R[k++] = A[minAbsIndex] * A[minAbsIndex];
        int i = minAbsIndex - 1;
        int j = minAbsIndex + 1;
        while (i >= 0 && j < A.length) {
            if (Math.abs(A[i]) < Math.abs(A[j])) {
                R[k++] = A[i] * A[i--];
            } else {
                R[k++] = A[j] * A[j++];
            }
        }
        while (i >= 0) {
            R[k++] = A[i] * A[i--];
        }
        while (j < A.length) {
            R[k++] = A[j] * A[j++];
        }
        return R;
    }

    /**
     * 找到绝对值最小的数的下标
     * 时间复杂度为 O(n)
     *
     * @param A
     * @return
     */
    private int findMinAbsIndex(int[] A) {
        int index = 0;
        for (int i = 0; i < A.length; i++) {
            if (Math.abs(A[i]) < Math.abs(A[index])) {
                index = i;
            }
        }
        return index;
    }
}
