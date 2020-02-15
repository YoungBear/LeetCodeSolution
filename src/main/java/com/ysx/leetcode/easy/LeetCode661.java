package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/15 9:54
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 661. 图片平滑器
 * https://leetcode-cn.com/problems/image-smoother/
 */
public class LeetCode661 {
    public int[][] imageSmoother(int[][] M) {
        int m = M.length;
        int n = M[0].length;
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int num = 0;
                int sum = 0;
                for (int ki = i - 1; ki <= i + 1; ki++) {
                    for (int kj = j - 1; kj <= j + 1; kj++) {
                        if (ki >= 0 && ki < m && kj >= 0 && kj < n) {
                            sum += M[ki][kj];
                            num++;
                        }
                    }
                }
                result[i][j] = sum / num;
            }
        }
        return result;
    }
}
