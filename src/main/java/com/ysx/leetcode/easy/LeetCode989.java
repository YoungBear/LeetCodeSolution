/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/24 22:00
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 989. 数组形式的整数加法
 * https://leetcode-cn.com/problems/add-to-array-form-of-integer/
 */
public class LeetCode989 {
    public List<Integer> addToArrayForm(int[] A, int K) {
        StringBuilder sb = new StringBuilder();
        for (int i : A) {
            sb.append(i);
        }
        String kStr = String.valueOf(K);
        String result = addStrings(sb.toString(), kStr);
        List<Integer> resultList = new ArrayList<>();
        for (char ch : result.toCharArray()) {
            resultList.add(ch - '0');
        }
        return resultList;
    }

    public String addStrings(String num1, String num2) {
        int length1 = num1.length();
        int length2 = num2.length();
        if (length1 < length2) {
            return addStrings(num2, num1);
        }
        StringBuilder sb = new StringBuilder();
        // 是否有进位
        boolean flag = false;
        // length1 比length2 长
        for (int i = length1 - 1, j = length2 - 1; i >= 0; i--, j--) {
            int n1 = num1.charAt(i) - '0';
            int n2 = j < 0 ? 0 : num2.charAt(j) - '0';
            int sum = n1 + n2 + (flag ? 1 : 0);
            flag = sum >= 10;
            sb.append(sum % 10);
        }
        if (flag) {
            sb.append(1);
        }
        return sb.reverse().toString();
    }
}
