# N-th Tribonacci Number

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

The Tribonacci sequence Tn is defined as follows: 

T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.

Given `n`, return the value of Tn.

 

 **Example 1:** 

```
Input: n = 4
Output: 4
Explanation:
T_3 = 0 + 1 + 1 = 2
T_4 = 1 + 1 + 2 = 4

```

 **Example 2:** 

```
Input: n = 25
Output: 1389537

```

 

 **Constraints:** 

- 0 <= n <= 37
- The answer is guaranteed to fit within a 32-bit integer, ie. answer <= 2^31 - 1.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 41.1 MB (beats 98.74%)  
**Submitted:** 2026-11-08T04:34:32.261Z  

```java
class Solution {
    public int tribonacci(int n) {
        if(n<=1) return n;
        int a=0, b=1, c=1;
        for(int i = 1; i<=n; i++){
            int temp = a+b+c;
            a=b;
            b=c;
            c=temp;
        }
        return a;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/n-th-tribonacci-number/)