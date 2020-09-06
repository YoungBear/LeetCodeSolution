/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/8/27 21:44
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 1337. 方阵中战斗力最弱的 K 行
 * https://leetcode-cn.com/problems/the-k-weakest-rows-in-a-matrix/
 */
public class LeetCode1337 {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] result = new int[k];
        int cur = 0;
        List<Integer> resultList = new ArrayList<>();
        for (int j = 0; j < mat[0].length; j++) {
            for (int i = 0; i < mat.length; i++) {
                if (resultList.contains(i)) {
                    continue;
                }
                if (mat[i][j] == 0) {
                    resultList.add(i);
                    result[cur++] = i;
                    if (cur == k) {
                        return result;
                    }
                }
            }
        }
        int begin = 0;
        for (int i = cur; i < k; i++) {
            while (resultList.contains(begin)) {
                begin++;
            }
            result[i] = begin;
            resultList.add(begin);
        }
        return result;
    }
}
