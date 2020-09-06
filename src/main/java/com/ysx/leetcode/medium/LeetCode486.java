package com.ysx.leetcode.medium;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/9/1 22:37
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 486. 预测赢家
 * https://leetcode-cn.com/problems/predict-the-winner/
 */
public class LeetCode486 {
    public boolean PredictTheWinner(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        int begin = 0;
        int end = nums.length - 1;
        return win(0, 0, 0, nums.length - 1, nums, 0);

    }

    public boolean win(int sum1, int sum2, int begin, int end, int[] nums, int count) {
        if (begin == end) {
            return sum1 >= sum2;
        }
        if (count % 2 == 0) {
            return win(sum1 + nums[begin], sum2, begin + 1, end, nums, count + 1)
                    || win(sum1 + nums[end], sum2, begin, end - 1, nums, count + 1);
        } else {
            return win(sum1, sum2 + nums[begin], begin + 1, end, nums, count + 1)
                    || win(sum1, sum2 + nums[end], begin, end - 1, nums, count + 1);
        }

    }
}
