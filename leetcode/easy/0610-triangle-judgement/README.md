# Triangle Judgement

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Table: `Triangle`

```
+-------------+------+
| Column Name | Type |
+-------------+------+
| x           | int  |
| y           | int  |
| z           | int  |
+-------------+------+
In SQL, (x, y, z) is the primary key column for this table.
Each row of this table contains the lengths of three line segments.

```

 

Report for every three line segments whether they can form a triangle.

Return the result table in  **any order**.

The result format is in the following example.

 

 **Example 1:** 

```
Input: 
Triangle table:
+----+----+----+
| x  | y  | z  |
+----+----+----+
| 13 | 15 | 30 |
| 10 | 20 | 15 |
+----+----+----+
Output: 
+----+----+----+----------+
| x  | y  | z  | triangle |
+----+----+----+----------+
| 13 | 15 | 30 | No       |
| 10 | 20 | 15 | Yes      |
+----+----+----+----------+

```

## Solution

**Language:** SQL  
**Runtime:** 351 ms (beats 35.19%)  
**Memory:** 0B (beats 100.00%)  
**Submitted:** 2026-11-06T03:10:06.466Z  

```sql
# Write your MySQL query statement below
select x, y, z, case when x+y > z and y+z > x and x+z > y then 'Yes' else 'No' end as triangle
from triangle
```

---

[View on LeetCode](https://leetcode.com/problems/triangle-judgement/)