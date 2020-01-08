package com.ysx.leetcode.easy;

import org.junit.Test;

import java.util.List;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/1/8 20:50
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode293Test {
    @Test
    public void generatePossibleNextMovesTest() {
        LeetCode293 test = new LeetCode293();
        String s = "++++";
        List<String> resultList = test.generatePossibleNextMoves(s);
        System.out.println(resultList);
        System.out.println(true);

    }
}
