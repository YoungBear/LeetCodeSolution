package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/1/5 23:03
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 342. 4的幂
 * https://leetcode-cn.com/problems/power-of-four/
 */
public class LeetCode342 {
    /**
     * (num & (num - 1)) == 0 用来判断num是否为2的幂
     * 4的幂，即2的偶数次幂，表示为32位二进制数时，其第0位，第2位，第4位...即第偶数位为1
     * 可以表示为与二进制的数(101010...10)按位与运算后为0
     * 其中(101010...10)是第1,3,5,...等奇数位为1，其余位为0。表示为十六进制为0xaaaaaaaa
     *
     * @param num
     * @return
     */
    public boolean isPowerOfFour(int num) {
        return (num > 0) && ((num & (num - 1)) == 0) && ((num & 0xaaaaaaaa) == 0);
    }
}
