package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/12 09:35
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 604. 迭代压缩字符串
 * https://leetcode-cn.com/problems/design-compressed-string-iterator/
 */
public class LeetCode604 {
    private int currentIndex;
    private int currentNum;
    private String content;

    public LeetCode604(String compressedString) {
        content = compressedString;
        currentIndex = 0;
        if (compressedString.isEmpty()) {
            currentNum = 0;
        } else {
            currentNum = readNum(0, content);
        }
    }

    public char next() {
        if (currentIndex == content.length()) {
            return ' ';
        } else {
            char result = content.charAt(currentIndex);
            currentNum--;
            if (currentNum == 0) {
                int i = currentIndex + 1;
                for (; i < content.length(); i++) {
                    if (content.charAt(i) < '0' || content.charAt(i) > '9') {
                        currentNum = readNum(i, content);
                        break;
                    }
                }
                currentIndex = i;
            }
            return result;
        }
    }

    public boolean hasNext() {
        return currentIndex != content.length();
    }

    /**
     * 读取当前字符的个数
     *
     * @param currentIndex
     * @param content
     * @return
     */
    private int readNum(int currentIndex, String content) {
        int num = 0;
        for (int i = currentIndex + 1; i < content.length(); i++) {
            if (content.charAt(i) >= '0' && content.charAt(i) <= '9') {
                num = 10 * num + content.charAt(i) - '0';
            } else {
                break;
            }
        }
        return num;
    }
}
