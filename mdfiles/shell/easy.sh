#!/bin/bash

# LeetCode 195. 第十行 给定一个文本文件 file.txt，请只打印这个文件中的第十行。（如果文件不到10行，则不打印）
# 1. 使用sed打印第10行内容
sed -n '10p' file.txt
# 2. 获取从文件开始到第10行的数据，再打印最后一行（当文件不到10行时，会打印最后一行数据，不满足）
# head -n 10 file.txt | tail -1
# 3. 获取从第10行到结尾的数据，再打印第1行
tail -n +10 file.txt | head -1
# 4. 使用awk
awk 'NR==10' file.txt