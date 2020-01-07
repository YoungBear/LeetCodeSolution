package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/1/7 21:43
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 344. 反转字符串
 * https://leetcode-cn.com/problems/reverse-string/
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 * <p>
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 * <p>
 * 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
 */
public class LeetCode344 {
    /**
     * 从0遍历到length/2，交换首位元素即可
     */
    public void reverseString(char[] s) {
        if (null == s || s.length <= 1) {
            return;
        }
        int length = s.length;
        int half = length / 2;
        for (int i = 0; i < half; i++) {
            char temp = s[i];
            s[i] = s[length - i - 1];
            s[length - i - 1] = temp;
        }
    }
}
