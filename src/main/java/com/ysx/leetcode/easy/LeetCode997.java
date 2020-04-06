package com.ysx.leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/4/6 15:09
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 997. 找到小镇的法官
 * https://leetcode-cn.com/problems/find-the-town-judge/
 */
public class LeetCode997 {
    public int findJudge(int N, int[][] trust) {
        if (N == 1) {
            return 1;
        }
        if (trust == null || trust.length == 0) {
            return -1;
        }
        if (trust.length < N - 1) {
            return -1;
        }
        Map<Integer, TreeSet<Integer>> map = new HashMap<>();
        for (int[] item : trust) {
            if (map.containsKey(item[1])) {
                map.get(item[1]).add(item[0]);
            } else {
                TreeSet<Integer> set = new TreeSet<>();
                set.add(item[0]);
                map.put(item[1], set);
            }
        }
        for (Map.Entry<Integer, TreeSet<Integer>> entry : map.entrySet()) {
            if (isValid(N, trust, entry.getValue(), entry.getKey())) {
                return entry.getKey();
            }
        }
        return -1;
    }

    /**
     * 判断key是否满足
     *
     * @param N
     * @param trust
     * @param set
     * @param key
     * @return
     */
    private boolean isValid(int N, int[][] trust, TreeSet<Integer> set, int key) {
        for (int[] ints : trust) {
            if (ints[0] == key) {
                return false;
            }
        }
        int[] array = set.stream().mapToInt(e -> e).toArray();
        int i = 0;
        int j = 0;
        for (; i < N; i++) {
            if (i + 1 == key) {
                continue;
            }
            if (i + 1 != array[j++]) {
                return false;
            }
        }
        return i == N;
    }
}
