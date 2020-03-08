package com.ysx.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/8 20:34
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 1018. 可被 5 整除的二进制前缀
 * https://leetcode-cn.com/problems/binary-prefix-divisible-by-5/
 */
public class LeetCode1018 {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> resultList = new ArrayList<>();
        int current = 0;
        for (int value : A) {
            // current 对10取余，不影响其是否可以整除5个结果
            current = (current * 2 + value) % 5;
            resultList.add(current == 0);
        }
        return resultList;
    }


}
