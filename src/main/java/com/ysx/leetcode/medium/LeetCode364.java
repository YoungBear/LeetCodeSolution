/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import com.ysx.leetcode.common.NestedInteger;

import java.util.List;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/12/6 22:06
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 364. 加权嵌套序列和 II
 * https://leetcode-cn.com/problems/nested-list-weight-sum-ii/
 * <p>
 * 给一个嵌套整数序列，请你返回每个数字在序列中的加权和，它们的权重由它们的深度决定。
 * <p>
 * 序列中的每一个元素要么是一个整数，要么是一个序列（这个序列中的每个元素也同样是整数或序列）。
 * <p>
 * 与 前一个问题 339 不同的是，前一题的权重按照从根到叶逐一增加，而本题的权重从叶到根逐一增加。
 * <p>
 * 也就是说，在本题中，叶子的权重为1，而根拥有最大的权重。
 */
public class LeetCode364 {
    /**
     * 先求深度，再使用dfs方法
     *
     * @param nestedList
     * @return
     */
    public int depthSumInverse(List<NestedInteger> nestedList) {
        int depth = depth(nestedList);
        return depthSumInverse(nestedList, depth);
    }

    public int depthSumInverse(List<NestedInteger> nestedList, int depth) {
        int sum = 0;
        for (NestedInteger nestedInteger : nestedList) {
            if (nestedInteger.isInteger()) {
                sum += nestedInteger.getInteger() * depth;
            } else {
                sum += depthSumInverse(nestedInteger.getList(), depth - 1);

            }
        }
        return sum;
    }

    /**
     * 获取最大深度
     *
     * @param nestedList
     * @return
     */
    private int depth(List<NestedInteger> nestedList) {
        int maxDepth = 1;
        for (NestedInteger nestedInteger : nestedList) {
            int depth = 0;
            if (nestedInteger.isInteger()) {
                depth = 1;
            } else {
                depth = depth(nestedInteger.getList()) + 1;

            }
            maxDepth = Math.max(maxDepth, depth);
        }
        return maxDepth;
    }
}
