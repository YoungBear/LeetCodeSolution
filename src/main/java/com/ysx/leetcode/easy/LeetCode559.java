/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import com.ysx.leetcode.common.Node;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/12/7 23:59
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 559. N 叉树的最大深度
 * https://leetcode-cn.com/problems/maximum-depth-of-n-ary-tree/
 * 树
 * DFS 深度优先搜索
 * 给定一个 N 叉树，找到其最大深度。
 * <p>
 * 最大深度是指从根节点到最远叶子节点的最长路径上的节点总数。
 */
public class LeetCode559 {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        if (root.children != null) {
            for (Node node : root.children) {
                max = Math.max(max, maxDepth(node));
            }
        }
        return 1 + max;
    }
}
