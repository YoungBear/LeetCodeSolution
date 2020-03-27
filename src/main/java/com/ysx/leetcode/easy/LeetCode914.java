package com.ysx.leetcode.easy;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/27 20:51
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 914. 卡牌分组
 * https://leetcode-cn.com/problems/x-of-a-kind-in-a-deck-of-cards/
 */
public class LeetCode914 {
    public boolean hasGroupsSizeX(int[] deck) {
        if (deck.length <= 1) {
            return false;
        }
        // 按值分组
        Map<Integer, Long> map =
                IntStream.of(deck).boxed()
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        // 找到成员最小的组的成员个数 min
        int min = map.values().stream().min(Long::compareTo).get().intValue();
        if (min < 2) {
            return false;
        }
        for (Long n : map.values()) {
            // 求最大公约数
            min = gcd(min, n.intValue());
            if (min == 1) {
                return false;
            }
        }
        return min >= 2;
    }

    /**
     * 辗转相除法求 x 和 y 的最大公约数
     *
     * @param x
     * @param y
     * @return
     */
    public int gcd(int x, int y) {
        if (x < y) {
            return gcd(y, x);
        }
        while (y != 0) {
            int temp = x % y;
            x = y;
            y = temp;
        }
        return x;
    }
}
