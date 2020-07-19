package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/7/19 21:45
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 5464. 换酒问题
 * https://leetcode-cn.com/problems/water-bottles/
 */
public class LeetCode5464 {
    public int numWaterBottles(int numBottles, int numExchange) {
        int result = numBottles;
        while (numBottles >= numExchange) {
            result += numBottles / numExchange;
            numBottles = numBottles / numExchange + numBottles % numExchange;
        }
        return result;
    }
}
