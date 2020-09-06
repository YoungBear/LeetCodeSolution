/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import com.ysx.leetcode.common.TreeNode;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/4/6 10:07
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 1022. 从根到叶的二进制数之和
 * https://leetcode-cn.com/problems/sum-of-root-to-leaf-binary-numbers/
 */
public class LeetCode1022 {
    private static final int MODE = 1000000000 + 7;
    private int result = 0;

    public int sumRootToLeaf(TreeNode root) {
        sum(root, 0);
        return result;
    }

    private void sum(TreeNode root, int cur) {
        if (root.left == null && root.right == null) {
            result += (2 * cur + root.val) % MODE;
            return;
        }
        if (root.left == null) {
            sum(root.right, (2 * cur + root.val) % MODE);
            return;
        }
        if (root.right == null) {
            sum(root.left, (2 * cur + root.val) % MODE);
            return;
        }
        sum(root.left, (2 * cur + root.val) % MODE);
        sum(root.right, (2 * cur + root.val) % MODE);
    }
}
