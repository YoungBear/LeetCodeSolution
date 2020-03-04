package com.ysx.leetcode.interview;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/4 21:56
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 面试题 01.01. 判定字符是否唯一
 * https://leetcode-cn.com/problems/is-unique-lcci/
 * 实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
 */
public class Interview0101 {
    /**
     * 执行用时 :2 ms, 在所有 Java 提交中击败了5.90%的用户
     * <p>
     * 内存消耗 :37.5 MB, 在所有 Java 提交中击败了100.00%的用户
     *
     * @param astr
     * @return
     */
    public boolean isUnique1(String astr) {
        return astr.chars().distinct().count() == astr.length();
    }

    /**
     * 执行用时 :0 ms, 在所有 Java 提交中击败了100.00%的用户
     * <p>
     * 内存消耗 :37.2 MB, 在所有 Java 提交中击败了100.00%的用户
     *
     * @param astr
     * @return
     */
    public boolean isUnique2(String astr) {
        for (int i = 0; i < astr.length(); i++) {
            // 查看从0到i(不包含i)的子串是否包含当前字符
            if (astr.substring(0, i).contains(String.valueOf(astr.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    public boolean isUnique(String astr) {
        for (int i = 0; i < astr.length(); i++) {
            // 从i+1之后查看是否有与当前字符相同的字符
            if (astr.indexOf(astr.charAt(i), i + 1) != -1) {
                return false;
            }
        }
        return true;
    }

}
