/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/1/12 22:31
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 1256. 加密数字
 * https://leetcode-cn.com/problems/encode-number/comments/
 * 给你一个非负整数 num ，返回它的「加密字符串」。
 * <p>
 * 加密的过程是把一个整数用某个未知函数进行转化，你需要从下表推测出该转化函数：
 * 0 -> "", 1 -> "0", 2 -> "1", 3 -> "00", 4 -> "01"
 * 5 -> "10", 6 -> "11", 7 -> "000"
 * 23 -> "1000", 107 -> "101100"
 */
public class LeetCode1256 {
    /**
     * 结论：num+1的二进制，去掉首位
     *
     * @param num
     * @return
     */
    public String encode(int num) {
        return Integer.toBinaryString(num + 1).substring(1);
    }
}
