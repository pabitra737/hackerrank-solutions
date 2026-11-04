# Customers Who Bought All Products

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Table: `Customer`

```
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| customer_id | int     |
| product_key | int     |
+-------------+---------+
This table may contain duplicates rows. 
customer_id is not NULL.
product_key is a foreign key (reference column) to Product table.

```

 

Table: `Product`

```
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| product_key | int     |
+-------------+---------+
product_key is the primary key (column with unique values) for this table.

```

 

Write a solution to report the customer ids from the `Customer` table that bought all the products in the `Product` table.

Return the result table in  **any order**.

The result format is in the following example.

 

 **Example 1:** 

```
Input: 
Customer table:
+-------------+-------------+
| customer_id | product_key |
+-------------+-------------+
| 1           | 5           |
| 2           | 6           |
| 3           | 5           |
| 3           | 6           |
| 1           | 6           |
+-------------+-------------+
Product table:
+-------------+
| product_key |
+-------------+
| 5           |
| 6           |
+-------------+
Output: 
+-------------+
| customer_id |
+-------------+
| 1           |
| 3           |
+-------------+
Explanation: 
The customers who bought all the products (5 and 6) are customers with IDs 1 and 3.

```

## Solution

**Language:** SQL  
**Runtime:** 652 ms (beats 44.50%)  
**Memory:** 0B (beats 100.00%)  
**Submitted:** 2026-11-04T16:36:23.070Z  

```sql
# Write your MySQL query statement below
select customer_id 
from customer 
group by customer_id 
having count(distinct product_key) = (select count(product_key) from product)
```

---

[View on LeetCode](https://leetcode.com/problems/customers-who-bought-all-products/)