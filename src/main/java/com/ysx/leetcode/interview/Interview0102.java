package com.ysx.leetcode.interview;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/4 22:19
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 面试题 01.02. 判定是否互为字符重排
 * https://leetcode-cn.com/problems/check-permutation-lcci/
 * 给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
 */
public class Interview0102 {
    /**
     * 执行用时 :5 ms, 在所有 Java 提交中击败了28.47%的用户
     * <p>
     * 内存消耗 :38.3 MB, 在所有 Java 提交中击败了100.00%的用户
     *
     * @param s1
     * @param s2
     * @return
     */
    public boolean CheckPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            // 替换第一次出现的字符为空
            s2 = s2.replaceFirst(String.valueOf(s1.charAt(i)), "");
        }
        return s2.isEmpty();
    }
}
