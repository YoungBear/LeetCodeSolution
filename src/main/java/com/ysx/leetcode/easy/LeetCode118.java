/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/12/6 23:06
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 118. 杨辉三角
 * https://leetcode-cn.com/problems/pascals-triangle/
 */
public class LeetCode118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return result;
        }
        List<Integer> sub = new ArrayList<>();
        sub.add(1);
        result.add(sub);

        for (int i = 1; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            List<Integer> last = result.get(i - 1);
            temp.add(1);
            for (int j = 1; j < i; j++) {
                temp.add(last.get(j - 1) + last.get(j));
            }
            temp.add(1);
            result.add(temp);
        }
        return result;
    }
}
