package com.ysx.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/1/8 20:45
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 293. Flip Game
 * https://leetcode-cn.com/problems/flip-game/
 * Write a function to compute all possible states of the string after one valid move.
 */
public class LeetCode293 {
    public List<String> generatePossibleNextMoves(String s) {
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
