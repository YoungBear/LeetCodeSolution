package com.ysx.leetcode.interview;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/10 22:08
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 面试题64. 求1+2+…+n
 * https://leetcode-cn.com/problems/qiu-12n-lcof/
 * 求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 */
public class Interview64 {
    public int sumNums(int n) {
        int sum = n;
        // 利用逻辑与的断路实现递归的初始值处理，即当n等于0时，sum>0为false，就不会执行后边的递归，则递归结束
        boolean b = sum > 0 && ((sum += sumNums(n - 1)) > 0);
        return sum;
    }
}
