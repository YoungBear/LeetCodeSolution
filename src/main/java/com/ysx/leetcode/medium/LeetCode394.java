package com.ysx.leetcode.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/6 21:48
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 394. 字符串解码
 * https://leetcode-cn.com/problems/decode-string/
 */
public class LeetCode394 {
    public String decodeString(String s) {
        List<String> stringList = split(s);
        StringBuilder sb = new StringBuilder();
        for (String str : stringList) {
            sb.append(decodeSingleString(str));
        }
        return sb.toString();
    }

    /**
     * 解码单个字符串
     *
     * @param singleS
     * @return
     */
    private String decodeSingleString(String singleS) {
        if (singleS.charAt(0) < '0' || singleS.charAt(0) > '9') {
            return singleS;
        }
        int n = 0;
        int i = 0;
        while (i < singleS.length() && singleS.charAt(i) >= '0' && singleS.charAt(i) <= '9') {
            n = 10 * n + singleS.charAt(i) - '0';
            i++;
        }
        StringBuilder sb = new StringBuilder();
        // 递归调用解码
        String repeatStr = decodeString(singleS.substring(i + 1, singleS.length() - 1));
        // 重复 n 次
        for (int j = 0; j < n; j++) {
            sb.append(repeatStr);
        }
        return sb.toString();
    }

    /**
     * 将字符串拆分成n个单独的字符串，最终结果是这n个字符串的结果相加
     * 比如将 2[abc]3[cd]ef 分为：2[abc]；3[cd]；ef
     *
     * @param s
     * @return
     */
    public List<String> split(String s) {
        List<String> resultList = new ArrayList<>();
        Stack<Character> stack = new Stack<>();
        int beginIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                continue;
            } else if ('[' == s.charAt(i)) {
                stack.push('[');
            } else if (']' == s.charAt(i)) {
                stack.pop();
                if (stack.isEmpty()) {
                    resultList.add(s.substring(beginIndex, i + 1));
                    beginIndex = i + 1;
                }
            } else {
                if (!stack.isEmpty()) {
                    continue;
                }
                int j = i;
                while (j < s.length() && (s.charAt(j) < '0' || s.charAt(j) > '9')
                        && '[' != s.charAt(j) && ']' != s.charAt(j)) {
                    j++;
                }
                resultList.add(s.substring(beginIndex, j));
                beginIndex = j;
                i = j - 1;
            }
        }
        return resultList;
    }
}
