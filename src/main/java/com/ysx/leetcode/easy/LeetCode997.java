/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

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

    /**
     * 法官不相信任何人，说明法官不存在出度
     * 所有人都信任法官，说明法官的入度为N-1
     * 那么法官的出度加入度为N-1
     *
     * @param N
     * @param trust
     * @return
     */
    public int findJudge(int N, int[][] trust) {
        // 统计出入度
        int[] count = new int[N + 1];
        for (int[] item : trust) {
            count[item[0]]--; // 出度--
            count[item[1]]++; // 入度++
        }
        for (int i = 0; i < N; i++) {
            if (count[i + 1] == N - 1) {
                return i + 1;
            }
        }
        return -1;
    }

    public int findJudge1(int N, int[][] trust) {
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
