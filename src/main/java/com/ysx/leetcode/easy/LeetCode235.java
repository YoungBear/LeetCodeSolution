package com.ysx.leetcode.easy;

import com.ysx.leetcode.common.TreeNode;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/5/1 4:27
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 235. 二叉搜索树的最近公共祖先
 * https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 * 面试题68 - I. 二叉搜索树的最近公共祖先
 * https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-zui-jin-gong-gong-zu-xian-lcof/
 */
public class LeetCode235 {
    /**
     * 二叉搜索树的最近公共祖先
     *
     * @param root 根节点
     * @param p    节点p
     * @param q    节点q
     * @return p和q的最近公共祖先
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 如果p和q在root的右边，递归判断其在右子树中
        if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (root.val < p.val && root.val < q.val) {
            // 如果p和q在root的左边，递归判断其在右子树中
            return lowestCommonAncestor(root.right, p, q);
        } else {
            // 如果p和q在root的左右两边，则root为其最近公共祖先
            return root;
        }
    }
}
