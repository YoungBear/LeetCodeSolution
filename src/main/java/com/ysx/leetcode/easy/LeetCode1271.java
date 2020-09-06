/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/1/7 21:55
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 1271. 十六进制魔术数字
 * https://leetcode-cn.com/problems/hexspeak/
 * <p>
 * 你有一个十进制数字，请按照此规则将它变成「十六进制魔术数字」：首先将它变成字母大写的十六进制字符串，然后将所有的数字 0 变成字母 O ，将数字 1  变成字母 I 。
 * <p>
 * 如果一个数字在转换后只包含 {"A", "B", "C", "D", "E", "F", "I", "O"} ，那么我们就认为这个转换是有效的。
 * <p>
 * 给你一个字符串 num ，它表示一个十进制数 N，如果它的十六进制魔术数字转换是有效的，请返回转换后的结果，否则返回 "ERROR" 。
 */
public class LeetCode1271 {

    public String toHexspeak(String num) {
        String errorMsg = "ERROR";
        // 使用 Long.parseUnsignedLong 不会溢出
        String hexString = Long.toHexString(Long.parseUnsignedLong(num)).toUpperCase();
        String lastString = hexString.replaceAll("1", "I").replaceAll("0", "O");
        if (lastString.contains("2") || lastString.contains("3") || lastString.contains("4")
                || lastString.contains("5") || lastString.contains("6") || lastString.contains("7")
                || lastString.contains("8") || lastString.contains("9")) {
            return errorMsg;
        }
        return lastString;
    }
}
