package com.ysx.leetcode.interview;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/3 21:31
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 面试题 10.01. 合并排序的数组
 * https://leetcode-cn.com/problems/sorted-merge-lcci/
 * 给定两个排序后的数组 A 和 B，其中 A 的末端有足够的缓冲空间容纳 B。 编写一个方法，将 B 合并入 A 并排序。
 * <p>
 * 初始化 A 和 B 的元素数量分别为 m 和 n。
 */
public class Interview1001 {
    /**
     * 使用双指针，从后往前遍历，比较A和B的元素的大小，将较大的放在A的后边。直到A或者B遍历完，然后将剩下的另一个数组全部放在A中。
     *
     * @param A
     * @param m
     * @param B
     * @param n
     */
    public void merge(int[] A, int m, int[] B, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (A[i] > B[j]) {
                A[k--] = A[i--];
            } else {
                A[k--] = B[j--];
            }
        }
        while (i >= 0) {
            A[k--] = A[i--];
        }
        while (j >= 0) {
            A[k--] = B[j--];
        }
    }
}
