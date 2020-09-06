/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import java.util.stream.IntStream;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/5 22:06
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 575. 分糖果
 * https://leetcode-cn.com/problems/distribute-candies/
 */
public class LeetCode575 {
    /**
     * 找到数组中唯一元素的长度x，和数组总长度的一半 y，取Math.min(x,y)即可
     * 如果唯一元素大于一半(x>y)，则可从x中取全部元素的一半分给妹妹，返回为y
     * 如果唯一元素小于或者等于一半(x<=y)，则把全部唯一的元素分给妹妹，再加上其余的，总体妹妹手里的糖果的种类是x
     *
     * @param candies
     * @return
     */
    public int distributeCandies(int[] candies) {
        return (int) Math.min(IntStream.of(candies).distinct().count(), candies.length / 2);
    }
}
