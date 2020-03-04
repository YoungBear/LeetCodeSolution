# [LeetCode 994. 腐烂的橘子](https://leetcode-cn.com/problems/rotting-oranges/)

## 1. 题目描述

在给定的网格中，每个单元格可以有以下三个值之一：

值 0 代表空单元格；
值 1 代表新鲜橘子；
值 2 代表腐烂的橘子。
每分钟，任何与腐烂的橘子（在 4 个正方向上）相邻的新鲜橘子都会腐烂。

返回直到单元格中没有新鲜橘子为止所必须经过的最小分钟数。如果不可能，返回 -1。

## 2. 思路

循环二维数组的每一个元素，如果有腐烂的元素（值为2）并且周边四个存在不腐烂的元素（值为1），则修改其状态为2（用一个临时二维数组存储），将状态变化标记置位true。如果遍历二维数组完成之后，状态变化标记为false，则表明状态不会再改变，循环结束。最后判断最终元素是否均为腐败的（值为0或者2，没有1的元素），如果均腐败，则返回二次循环的次数-1（这里注意需要-1，因为最后一次没有变化），否则返回-1.

**执行结果：**
执行用时 :4 ms, 在所有 Java 提交中击败了45.60%的用户
内存消耗 :38.4 MB, 在所有 Java 提交中击败了56.07%的用户

## 3. 代码



```java
/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/4 19:45
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 994. 腐烂的橘子
 * https://leetcode-cn.com/problems/rotting-oranges/
 */
public class LeetCode994 {
    public int orangesRotting(int[][] grid) {
        boolean isChanged = true;
        int minutes = 0;
        while (true) {
            isChanged = false;
            int[][] tempGrid = new int[grid.length][grid[0].length];
            for (int i = 0; i < tempGrid.length; i++) {
                for (int j = 0; j < tempGrid[0].length; j++) {
                    tempGrid[i][j] = grid[i][j];
                }
            }
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (2 == grid[i][j]) {
                        if (i > 0 && 1 == tempGrid[i - 1][j]) {
                            tempGrid[i - 1][j] = 2;
                            isChanged = true;
                        }
                        if (i < grid.length - 1 && 1 == tempGrid[i + 1][j]) {
                            tempGrid[i + 1][j] = 2;
                            isChanged = true;
                        }
                        if (j > 0 && 1 == tempGrid[i][j - 1]) {
                            tempGrid[i][j - 1] = 2;
                            isChanged = true;
                        }
                        if (j < grid[0].length - 1 && 1 == tempGrid[i][j + 1]) {
                            tempGrid[i][j + 1] = 2;
                            isChanged = true;
                        }
                    }
                }
            }
            // 如果状态没有变化，则停止循环
            if (!isChanged) {
                break;
            }
            grid = tempGrid;
            minutes++;
        }
        if (isAllCorrupt(grid)) {
            return minutes;
        } else {
            return -1;
        }
    }

    /**
     * 判断是否全部已经腐烂
     *
     * @param grid
     * @return
     */
    private boolean isAllCorrupt(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (1 == grid[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
```

