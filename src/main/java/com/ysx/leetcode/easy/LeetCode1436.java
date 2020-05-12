package com.ysx.leetcode.easy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/5/12 22:50
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 1436. 旅行终点站
 * https://leetcode-cn.com/problems/destination-city/
 */
public class LeetCode1436 {
    public String destCity(List<List<String>> paths) {
        Map<String, String> map = new HashMap<>();
        for (List<String> path : paths) {
            map.put(path.get(0), path.get(1));
        }
        String start = paths.get(0).get(0);
        while (map.get(start) != null) {
            start = map.get(start);
        }
        return start;
    }
}
