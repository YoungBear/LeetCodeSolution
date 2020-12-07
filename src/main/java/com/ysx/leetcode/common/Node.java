/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.common;

import java.util.List;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/12/7 23:59
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description N叉树
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
