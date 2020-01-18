package com.ysx.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/1/18 08:46
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 1309. 解码字母到整数映射
 * https://leetcode-cn.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
 */
public class LeetCode1309 {

    private static final Map<String, String> MAP = new HashMap<>();

    static {
        MAP.put("1", "a");
        MAP.put("2", "b");
        MAP.put("3", "c");
        MAP.put("4", "d");
        MAP.put("5", "e");
        MAP.put("6", "f");
        MAP.put("7", "g");
        MAP.put("8", "h");
        MAP.put("9", "i");
        MAP.put("10#", "j");
        MAP.put("11#", "k");
        MAP.put("12#", "l");
        MAP.put("13#", "m");
        MAP.put("14#", "n");
        MAP.put("15#", "o");
        MAP.put("16#", "p");
        MAP.put("17#", "q");
        MAP.put("18#", "r");
        MAP.put("19#", "s");
        MAP.put("20#", "t");
        MAP.put("21#", "u");
        MAP.put("22#", "v");
        MAP.put("23#", "w");
        MAP.put("24#", "x");
        MAP.put("25#", "y");
        MAP.put("26#", "z");
    }

    /**
     * 使用map保存编码到字母的映射关系
     * 遍历时，先判断长度为3的编码是否在map中，如果有则获取；否则获取长度为1的编码。
     *
     * @param s
     * @return
     */
    public String freqAlphabets(String s) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            if (i + 3 <= s.length()) {
                if (MAP.containsKey(s.substring(i, i + 3))) {
                    result.append(MAP.get(s.substring(i, i + 3)));
                    i += 3;
                } else {
                    result.append(MAP.get(s.substring(i, i + 1)));
                    i++;
                }
            } else {
                result.append(MAP.get(s.substring(i, i + 1)));
                i++;
            }
        }
        return result.toString();
    }

    /**
     * 直接解析字符的关系获得
     *
     * @param s
     * @return
     */
    public String freqAlphabets2(String s) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            if (i + 3 <= s.length()) {
                if (s.substring(i, i + 3).charAt(2) == '#') {
                    result.append((char) (Integer.parseInt(s.substring(i, i + 2)) - 1 + 'a'));
                    i += 3;
                } else {
                    result.append((char) (Integer.parseInt(s.substring(i, i + 1)) - 1 + 'a'));
                    i++;
                }
            } else {
                result.append((char) (Integer.parseInt(s.substring(i, i + 1)) - 1 + 'a'));
                i++;
            }
        }
        return result.toString();
    }
}
