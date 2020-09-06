/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/24 22:50
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 448. 找到所有数组中消失的数字
 * https://leetcode-cn.com/problems/find-all-numbers-disappeared-in-an-array/
 */
public class LeetCode448 {
    /**
     * 将数组中的每个值所对应的下标的值，修改为对应的负值，完成之后，再找到值为正数的下标即可
     *
     * @param nums
     * @return
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int n : nums) {
            nums[abs(n) - 1] = -abs(nums[abs(n) - 1]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }
        return result;
    }
}
