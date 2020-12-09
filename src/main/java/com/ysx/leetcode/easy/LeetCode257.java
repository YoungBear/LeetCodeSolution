/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import com.ysx.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/12/8 0:06
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 257. 二叉树的所有路径
 * https://leetcode-cn.com/problems/binary-tree-paths/
 * 树
 * DFS 深度优先搜索
 */
public class LeetCode257 {
    /**
     * DFS
     *
     * @param root
     * @return
     */
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        if (root.left == null && root.right == null) {
            return Arrays.asList(root.val + "");
        }
        int val = root.val;
        List<String> leftList = binaryTreePaths(root.left);
        List<String> rightList = binaryTreePaths(root.right);
        List<String> resultList = new ArrayList<>();
        for (String str : leftList) {
            resultList.add(val + "->" + str);
        }

        for (String str : rightList) {
            resultList.add(val + "->" + str);
        }
        return resultList;
    }
}
