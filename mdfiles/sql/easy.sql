-- LeetCode 1350. 院系无效的学生
SELECT S.id, S.name FROM Students S LEFT JOIN Departments D ON S.department_id = D.id WHERE D.id IS NULL
SELECT id, name FROM Students WHERE department_id NOT IN (SELECT id FROM Departments)


-- LeetCode 175. 组合两个表
SELECT P.FirstName, P.LastName, A.City, A.State FROM Person P LEFT JOIN Address A ON P.PersonId = A.PersonId
SELECT FirstName, LastName, City, State FROM Person LEFT JOIN Address ON Person.PersonId = Address.PersonId

-- 内连接 inner join ... on 或 join ... on 展现出来的是共同的数据
-- 左外连接 left join ... on 将返回右表的所有行。如果左表的某行在右表中没有匹配行，则将为右表返回空值左连接：
-- 右外连接 right join ... on 将返回右表的所有行。如果右表的某行在左表中没有匹配行，则将为左表返回空值;
-- 全外连接 full join ... on 完整外部联接返回左表和右表中的所有行。当某行在另一个表中没有匹配行时，则另一个表的选择列表列包含空值。如果表之间有匹配行，则整个结果集行包含基表的数据值。

-- LeetCode 176. 第二高的薪水
SELECT MAX(Salary) AS SecondHighestSalary FROM Employee WHERE Salary NOT IN (SELECT MAX(Salary) FROM Employee)

-- LeetCode 196. 删除重复的电子邮箱
-- 分组查询ID最小的数据，再删除ID不在这个集合中的数据
DELETE FROM Person WHERE ID NOT IN (SELECT T.MINID FROM (SELECT MIN(ID) AS MINID FROM Person GROUP BY EMAIL) T);

