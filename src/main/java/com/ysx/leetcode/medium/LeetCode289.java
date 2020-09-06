/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/4/2 22:15
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 289. 生命游戏
 * https://leetcode-cn.com/problems/game-of-life/
 */
public class LeetCode289 {
    public void gameOfLife(int[][] board) {
        if (null == board || 0 == board.length || 0 == board[0].length) {
            return;
        }
        int[][] temp = new int[2][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int cur = sum1(board, i, j);
                if (board[i][j] == 1) {
                    if (cur < 2 || cur > 3) {
                        temp[i % 2][j] = 0;
                    } else {
                        temp[i % 2][j] = 1;
                    }
                } else {
                    temp[i % 2][j] = cur == 3 ? 1 : 0;
                }
            }
            if (i > 0) {
                System.arraycopy(temp[(i - 1) % 2], 0, board[i - 1], 0, board[0].length);
            }
        }
        System.arraycopy(temp[(board.length - 1) % 2], 0, board[board.length - 1], 0, board[0].length);
    }

    /**
     * 获取元素周边1的个数
     *
     * @param board
     * @param i
     * @param j
     * @return
     */
    private int sum1(int[][] board, int i, int j) {
        int sum = 0;

        sum += element(board, i, j - 1) + element(board, i, j + 1)
                + element(board, i - 1, j - 1) + element(board, i - 1, j) + element(board, i - 1, j + 1)
                + element(board, i + 1, j - 1) + element(board, i + 1, j) + element(board, i + 1, j + 1);
        return sum;

    }

    /**
     * 获取当前元素的值
     *
     * @param board
     * @param i
     * @param j
     * @return
     */
    private int element(int[][] board, int i, int j) {
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length) {
            return 0;
        }
        return board[i][j];
    }
}
