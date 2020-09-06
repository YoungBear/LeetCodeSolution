/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import com.ysx.leetcode.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/9/6 9:55
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode103Test {
    @Test
    public void test1() {
        LeetCode103 leetCode103 = new LeetCode103();
        TreeNode root = new TreeNode(3);
        TreeNode n9 = new TreeNode(9);
        TreeNode n20 = new TreeNode(20);
        TreeNode n15 = new TreeNode(15);
        TreeNode n7 = new TreeNode(7);
        root.left = n9;
        root.right = n20;
        n20.left = n15;
        n20.right = n7;
        List<List<Integer>> excepted = new ArrayList<>();
        excepted.add(Arrays.asList(3));
        excepted.add(Arrays.asList(20, 9));
        excepted.add(Arrays.asList(15, 7));
        List<List<Integer>> lists = leetCode103.zigzagLevelOrder(root);
        Assert.assertEquals(excepted.size(), lists.size());
        for (int i = 0; i < excepted.size(); i++) {
            Assert.assertEquals(excepted.get(i).size(), lists.get(i).size());
            for (int j = 0; j < excepted.get(i).size(); j++) {
                Assert.assertEquals(excepted.get(i).get(j), lists.get(i).get(j));
            }
        }
    }
}
