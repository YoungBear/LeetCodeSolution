package com.ysx.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/24 23:05
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 442. 数组中重复的数据
 * https://leetcode-cn.com/problems/find-all-duplicates-in-an-array/
 */
public class LeetCode442 {
    /**
     * 将数组中的每个值所对应的下标的值，修改为对应的负值，如果该下标的值已经为负值，则意味着该下标的数出现过2次
     *
     * @param nums
     * @return
     */
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int n : nums) {
            if (nums[abs(n) - 1] < 0) {
                result.add(abs(n));
            } else {
                nums[abs(n) - 1] = -nums[abs(n) - 1];
            }
        }
        return result;
    }
}
