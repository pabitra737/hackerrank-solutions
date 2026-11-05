# Palindrome Number

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer `x`, return `true` if `x` is a  **palindrome**, and `false` otherwise.

 

 **Example 1:** 

```
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

```

 **Example 2:** 

```
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

```

 **Example 3:** 

```
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

```

 

 **Constraints:** 

- -231 <= x <= 231 - 1

 

 **Follow up:**  Could you solve it without converting the integer to a string?

## Solution

**Language:** Java  
**Runtime:** 14 ms (beats 26.31%)  
**Memory:** 45.3 MB (beats 91.42%)  
**Submitted:** 2026-11-05T17:27:05.630Z  

```java
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int temp = x;
        int sum = 0;
        while(temp>0){
            int d = temp % 10;
            sum = sum * 10 + d;
            temp /= 10;
        }
        if(sum == x){
            return true;
        }
        else{
            return false;
        }
        //return sum == x;

        // String s = String.valueOf(x); // Convert to String
        // int n = s.length(); // Store the String length to int n

        // for (int i=0; i<n/2; i++) {
        //     // We check whether the elements at the same distance from
        //     // beginning and from ending are same, if not we return false
        //     if (s.charAt(i) != s.charAt(n-i-1)) return false;
        // }

        // // if no flaws are found we return true
        // return true;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/palindrome-number/)