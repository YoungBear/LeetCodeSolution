/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.advanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/4 15:57
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 248. 中心对称数 III
 * https://leetcode-cn.com/problems/strobogrammatic-number-iii/
 * 中心对称数是指一个数字在旋转了 180 度之后看起来依旧相同的数字（或者上下颠倒地看）。
 * <p>
 * 写一个函数来计算范围在 [low, high] 之间中心对称数的个数。
 * <p>
 * 示例:
 * <p>
 * 输入: low = "50", high = "100"
 * 输出: 3
 * 解释: 69，88 和 96 是三个在该范围内的中心对称数
 * 注意:
 * 由于范围可能很大，所以 low 和 high 都用字符串表示。
 */
public class LeetCode248 {

    public static void main(String[] args) {
        LeetCode248 leetCode248 = new LeetCode248();
        String s1 = "99999999999999999";
        String s2 = "99999999999999998";
        System.out.println(leetCode248.compare(s1, s2));


        String low = "9695";
        String high = "9697";
        System.out.println(leetCode248.strobogrammaticInRange(low, high));
    }

    public int strobogrammaticInRange(String low, String high) {
        int m = low.length();
        int n = high.length();

        List<String> list1 = Arrays.asList("0", "1", "8");
        List<String> list2 = Arrays.asList("11", "69", "88", "96");
        int sum = 0;
        sum += number(low, high, list1);
        sum += number(low, high, list2);

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
            if (tempList.get(0).length() < m) {
                continue;
            } else if (tempList.get(0).length() == m) {
                sum += number(low, high, tempList);
            } else if (tempList.get(0).length() < n) {
                sum += tempList.size();
            } else {
                sum += number(low, high, tempList);
            }
        }
        return sum;
    }

    /**
     * 计算有序list中处于low 和 high之间的数的个数
     *
     * @param low
     * @param high
     * @param list
     * @return
     */
    private int number(String low, String high, List<String> list) {
        int sum = 0;
        if (list.size() == 0) {
            return 0;
        }
        if (compare(list.get(0), high) > 0 || compare(list.get(list.size() - 1), low) < 0) {
            return 0;
        }
        for (String s : list) {
            if (compare(s, low) < 0) {
                continue;
            }
            if (compare(s, high) > 0) {
                break;
            }
            if (compare(s, low) >= 0 && compare(s, high) <= 0) {
                sum++;
            }
        }
        return sum;
    }


    /**
     * 比较两个整数
     *
     * @param s1
     * @param s2
     * @return
     */
    private int compare(String s1, String s2) {
        if (s1.length() == s2.length()) {
            return s1.compareTo(s2);
        } else {
            return s1.length() > s2.length() ? 1 : -1;
        }
    }
}
