/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/1/8 21:04
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 294. 翻转游戏 II
 * https://leetcode-cn.com/problems/flip-game-ii/
 */
public class LeetCode294 {

    /**
     * 递归法
     *
     * @param s
     * @return
     */
    public boolean canWin(String s) {
        // 获得第一次操作后所有的情况
        List<String> stringList = generatePossibleNextMoves(s);
        for (String string : stringList) {
            // 如果下一个失败，则该次成功
            if (!canWin(string)) {
                return true;
            }
        }
        return false;
    }

    private List<String> generatePossibleNextMoves(String s) {
        List<String> resultList = new ArrayList<>();
        if (null == s || s.length() == 0) {
            return resultList;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '+' && s.charAt(i + 1) == '+') {
                resultList.add(s.substring(0, i) + "--" + s.substring(i + 2));
            }
        }
        return resultList;
    }
}
