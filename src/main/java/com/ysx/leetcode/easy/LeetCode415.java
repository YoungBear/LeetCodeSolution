package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/24 19:22
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 415. 字符串相加
 * https://leetcode-cn.com/problems/add-strings/
 * 给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。
 */
public class LeetCode415 {
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
