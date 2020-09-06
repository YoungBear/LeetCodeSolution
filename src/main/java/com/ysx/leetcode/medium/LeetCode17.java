/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/8/27 21:38
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 17. 电话号码的字母组合
 * https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/
 */
public class LeetCode17 {
    private static final Map<Character, String> CHARACTER_STRING_MAP = new HashMap<>();

    static {
        CHARACTER_STRING_MAP.put('2', "abc");
        CHARACTER_STRING_MAP.put('3', "def");
        CHARACTER_STRING_MAP.put('4', "ghi");
        CHARACTER_STRING_MAP.put('5', "jkl");
        CHARACTER_STRING_MAP.put('6', "mno");
        CHARACTER_STRING_MAP.put('7', "pqrs");
        CHARACTER_STRING_MAP.put('8', "tuv");
        CHARACTER_STRING_MAP.put('9', "wxyz");
    }

    public List<String> letterCombinations(String digits) {
        List<String> resultList = new ArrayList<>();
        if (digits.length() == 0) {
            return resultList;
        }
        resultList.add("");
        for (int i = 0; i < digits.length(); i++) {
            char[] chars = CHARACTER_STRING_MAP.get(digits.charAt(i)).toCharArray();
            List<String> tempList = new ArrayList<>();
            for (String str : resultList) {
                for (char ch : chars) {
                    tempList.add(str + ch);
                }
            }
            resultList.clear();
            resultList.addAll(tempList);
        }
        return resultList;
    }
}
