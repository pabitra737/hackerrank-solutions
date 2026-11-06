# Power of Two

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer `n`, return  *`true` if it is a power of two. Otherwise, return `false`*.

An integer `n` is a power of two, if there exists an integer `x` such that `n == 2x`.

 

 **Example 1:** 

```
Input: n = 1
Output: true
Explanation: 20 = 1

```

 **Example 2:** 

```
Input: n = 16
Output: true
Explanation: 24 = 16

```

 **Example 3:** 

```
Input: n = 3
Output: false

```

 

 **Constraints:** 

- -231 <= n <= 231 - 1

 

 **Follow up:**  Could you solve it without loops/recursion?

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 19.48%)  
**Memory:** 42 MB (beats 93.19%)  
**Submitted:** 2026-11-06T03:34:58.838Z  

```java
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n < 1) return false;
        return (n&(n-1))==0;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/power-of-two/)