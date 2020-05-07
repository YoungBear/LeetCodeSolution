package com.ysx.leetcode.easy;

import com.ysx.leetcode.common.TreeNode;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/5/7 22:15
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 572. 另一个树的子树
 * https://leetcode-cn.com/problems/subtree-of-another-tree/
 */
public class LeetCode572 {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (null == s) {
            return false;
        }
        return isSameTree(s, t) || isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    /**
     * 判断两个树是否相同
     *
     * @param s
     * @param t
     * @return
     */
    private boolean isSameTree(TreeNode s, TreeNode t) {
        if (null == s && null == t) {
            return true;
        }
        if (null == s || null == t) {
            return false;
        }
        if (s.val != t.val) {
            return false;
        }
        return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
    }
}
