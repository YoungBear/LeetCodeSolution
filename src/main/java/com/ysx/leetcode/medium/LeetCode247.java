package com.ysx.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/4 14:34
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 中心对称数 II
 * https://leetcode-cn.com/problems/strobogrammatic-number-ii/
 * 中心对称数是指一个数字在旋转了 180 度之后看起来依旧相同的数字（或者上下颠倒地看）。
 * <p>
 * 找到所有长度为 n 的中心对称数。
 * <p>
 * 示例 :
 * <p>
 * 输入:  n = 2
 * 输出: ["11","69","88","96"]
 * <p>
 * 动态规划：
 * 执行用时 :21 ms, 在所有 Java 提交中击败了42.86%的用户
 * 内存消耗 :52 MB, 在所有 Java 提交中击败了28.69%的用户
 */
public class LeetCode247 {

    public static void main(String[] args) {
        LeetCode247 leetCode247 = new LeetCode247();
        System.out.println(leetCode247.findStrobogrammatic(1));
        System.out.println(leetCode247.findStrobogrammatic(2));
        System.out.println(leetCode247.findStrobogrammatic(3));
        System.out.println(leetCode247.findStrobogrammatic(4));
    }

    public List<String> findStrobogrammatic(int n) {
        List<String> list1 = Arrays.asList("0", "1", "8");
        if (1 == n) {
            return list1;
        }
        List<String> list2 = Arrays.asList("11", "69", "88", "96");
        if (2 == n) {
            return list2;
        }
        List<String> list2help = Arrays.asList("00", "11", "69", "88", "96");
        List<String> workList = new ArrayList<>(list2);
        List<String> tempList = new ArrayList<>();
        for (int i = 3; i <= n; i++) {
            tempList.clear();
            if (i % 2 == 1) {
                for (String value : workList) {
                    String begin = value.substring(0, value.length() / 2);
                    String end = value.substring(value.length() / 2);
                    for (String s : list1) {
                        tempList.add(begin + s + end);
                    }
                }
                if (i == n) {
                    return tempList;
                }
            } else {
                for (String value : workList) {
                    String begin = value.substring(0, value.length() / 2);
                    String end = value.substring(value.length() / 2);
                    for (String s : list2help) {
                        tempList.add(begin + s + end);
                    }
                }
                workList.clear();
                workList.addAll(tempList);
            }
        }
        return workList;
    }
}
