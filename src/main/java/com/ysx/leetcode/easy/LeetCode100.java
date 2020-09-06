/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import com.ysx.leetcode.common.TreeNode;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/5/7 22:11
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 100. 相同的树
 * https://leetcode-cn.com/problems/same-tree/
 */
public class LeetCode100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // 如果p和q都为null，则认为两个树相同
        if (null == p && null == q) {
            return true;
        }
        // 如果一个树为null，但是另一个不为null，则两个树不相同
        if (null == p || null == q) {
            return false;
        }
        // 如果两个树不为空，值不一样，则两个树不相同
        if (p.val != q.val) {
            return false;
        }
        // 递归比较左子树和右子树相同
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
