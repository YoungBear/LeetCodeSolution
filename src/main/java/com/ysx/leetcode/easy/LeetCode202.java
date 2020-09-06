/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/5/1 4:11
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 202. 快乐数
 * https://leetcode-cn.com/problems/happy-number/
 */
public class LeetCode202 {
    /**
     * 使用hash判断是否存在环
     *
     * @param n
     * @return
     */
    public boolean isHappy1(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1 && !set.contains(n)) {
            set.add(n);
            n = getNext(n);
        }
        return n == 1;
    }

    /**
     * 使用快慢指针判断是否存在环
     *
     * @param n
     * @return
     */
    public boolean isHappy(int n) {
        int slow = n;
        int fast = getNext(n);
        while (slow != 1 && slow != fast) {
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }
        return slow == 1;
    }

    /**
     * 获取下一个数
     *
     * @param n
     * @return
     */
    private int getNext(int n) {
        int sum = 0;
        while (n > 0) {
            int k = n % 10;
            sum += k * k;
            n /= 10;
        }
        return sum;
    }
}
