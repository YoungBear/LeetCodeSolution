package com.ysx.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/4 17:15
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 1056. 易混淆数
 * https://leetcode-cn.com/problems/confusing-number/
 * <p>
 * 给定一个数字 N，当它满足以下条件的时候返回 true：
 * <p>
 * 原数字旋转 180° 以后可以得到新的数字。
 * <p>
 * 如 0, 1, 6, 8, 9 旋转 180° 以后，得到了新的数字 0, 1, 9, 8, 6 。
 * <p>
 * 2, 3, 4, 5, 7 旋转 180° 后，得到的不是数字。
 * <p>
 * 易混淆数 (confusing number) 在旋转180°以后，可以得到和原来不同的数，且新数字的每一位都是有效的。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * <p>
 * 输入：6
 * 输出：true
 * 解释：
 * 把 6 旋转 180° 以后得到 9，9 是有效数字且 9!=6 。
 * 示例 2：
 * <p>
 * <p>
 * <p>
 * 输入：89
 * 输出：true
 * 解释:
 * 把 89 旋转 180° 以后得到 68，86 是有效数字且 86!=89 。
 * 示例 3：
 * <p>
 * <p>
 * <p>
 * 输入：11
 * 输出：false
 * 解释：
 * 把 11 旋转 180° 以后得到 11，11 是有效数字但是值保持不变，所以 11 不是易混淆数字。
 * 示例 4：
 * <p>
 * <p>
 * <p>
 * 输入：25
 * 输出：false
 * 解释：
 * 把 25 旋转 180° 以后得到的不是数字。
 * <p>
 * <p>
 * 提示：
 * <p>
 * 0 <= N <= 10^9
 * 可以忽略掉旋转后得到的前导零，例如，如果我们旋转后得到 0008 那么该数字就是 8 。
 * <p>
 * 解题思路
 * 先判断N所对应的字符串的所有字符，如果有旋转180度后不为数字，则直接返回false。
 * 然后再根据246的方法，246是求中心对称数，即旋转后两个数相同，这里取反即可。
 * <p>
 * 执行结果:
 * 执行用时 :1 ms, 在所有 Java 提交中击败了69.84%的用户
 * 内存消耗 :33.1 MB, 在所有 Java 提交中击败了48.89%的用户
 * <p>
 * 作者：youngbear
 * 链接：https://leetcode-cn.com/problems/confusing-number/solution/gen-ju-246de-fang-fa-zai-jia-yi-ge-pan-duan-by-you/
 */
public class LeetCode1056 {

    private static final Map<Character, Character> MAP = new HashMap<>();

    static {
        MAP.put('0', '0');
        MAP.put('1', '1');
        MAP.put('6', '9');
        MAP.put('8', '8');
        MAP.put('9', '6');
    }

    public boolean confusingNumber(int N) {
        String s = String.valueOf(N);
        for (char ch : s.toCharArray()) {
            if (!MAP.containsKey(ch)) {
                return false;
            }
        }
        return !isStrobogrammatic(s);
    }

    private boolean isStrobogrammatic(String num) {
        for (int i = 0; i < num.length() / 2 + 1; i++) {
            if (!MAP.containsKey(num.charAt(i))) {
                return false;
            }
            if (MAP.get(num.charAt(i)) != num.charAt(num.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
