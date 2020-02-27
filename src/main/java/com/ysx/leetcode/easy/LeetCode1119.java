package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/27 21:09
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 1119. 删去字符串中的元音
 * https://leetcode-cn.com/problems/remove-vowels-from-a-string/
 */
public class LeetCode1119 {
    public String removeVowels(String S) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            if (!isVowel(S.charAt(i))) {
                sb.append(S.charAt(i));
            }
        }
        return sb.toString();
    }

    /**
     * 判断是否为元音字符
     *
     * @param ch
     * @return
     */
    private boolean isVowel(char ch) {
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }
}
