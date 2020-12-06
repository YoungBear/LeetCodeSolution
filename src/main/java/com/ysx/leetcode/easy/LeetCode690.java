/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/12/6 22:35
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 690. 员工的重要性
 * https://leetcode-cn.com/problems/employee-importance/
 * DFS 深度优先搜索
 */
public class LeetCode690 {

    // 员工id与对象的关系
    private Map<Integer, Employee> emap;

    public int getImportance(List<Employee> employees, int queryid) {
        emap = new HashMap<>();
        for (Employee e : employees) emap.put(e.id, e);
        return dfs(queryid);
    }

    /**
     * dfs方法获取指定员工的权值
     *
     * @param eid
     * @return
     */
    public int dfs(int eid) {
        Employee employee = emap.get(eid);
        int ans = employee.importance;
        for (Integer subid : employee.subordinates)
            ans += dfs(subid);
        return ans;
    }


    static class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    }
}
