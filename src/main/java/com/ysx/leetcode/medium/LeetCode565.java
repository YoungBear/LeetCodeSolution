/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import java.util.Arrays;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/12/6 22:19
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 565. 数组嵌套
 * https://leetcode-cn.com/problems/array-nesting/
 * DFS 深度优先搜索
 */
public class LeetCode565 {
    /**
     * 暴力法
     * 遍历每一个元素
     * 时间复杂度O(n) 每一个元素最多会考虑一次
     * 使用访问过数组visited
     *
     * @param nums
     * @return
     */
    public int arrayNestingVisited(int[] nums) {
        int result = 0;
        boolean[] visited = new boolean[nums.length];
        Arrays.fill(visited, false);
        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                int j = nums[i];
                int count = 0;
                do {
                    j = nums[j];
                    count++;
                    visited[j] = true;
                } while (j != nums[i]);

                result = Math.max(result, count);
            }
        }
        return result;
    }

    /**
     * 暴力法
     * 遍历每一个元素
     * 时间复杂度O(n*n)
     *
     * @param nums
     * @return
     */
    public int arrayNesting(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int j = nums[i];
            int count = 0;
            do {
                j = nums[j];
                count++;
            } while (j != nums[i]);
            result = Math.max(result, count);
        }
        return result;
    }
}
