/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/1/18 09:02
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 249. 移位字符串分组
 * https://leetcode-cn.com/problems/group-shifted-strings/
 */
public class LeetCode249 {
    /**
     * 用一个List<List<String>> result来保存结果
     * 遍历strings的元素s，如果可以在当前list中找到与s可以通过移位相等的元素，则将s添加到这个list中，
     * 否则，新建一个list，把list添加到result中
     *
     * @param strings
     * @return
     */
    public List<List<String>> groupStrings(String[] strings) {
        List<List<String>> result = new ArrayList<>();
        for (String s : strings) {
            boolean flag = false;
            for (List<String> list : result) {
                if (!list.isEmpty() && isValid(s, list.get(0))) {
                    list.add(s);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                ArrayList<String> list = new ArrayList<>();
                list.add(s);
                result.add(list);
            }
        }
        return result;
    }

    /**
     * 判断两个字符串是否可以通过移位相等
     *
     * @param a
     * @param b
     * @return
     */
    private boolean isValid(String a, String b) {
        if (a.length() == b.length()) {
            int diff = Integer.MAX_VALUE;
            for (int i = 0; i < a.length(); i++) {
                if (Integer.MAX_VALUE == diff) {
                    diff = (a.charAt(i) - b.charAt(i) + 26) % 26;
                } else {
                    if (diff != (a.charAt(i) - b.charAt(i) + 26) % 26) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
}
