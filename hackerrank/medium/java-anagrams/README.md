# Java Anagrams

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Two strings, $a$ and $b$, are called anagrams if they contain all the same characters in the same frequencies.  For this challenge, the test is not case-sensitive. For example, the anagrams of `CAT` are `CAT`, `ACT`, `tac`, `TCA`, `aTC`, and `CtA`.

**Function Description**    

Complete the *isAnagram* function in the editor.   

*isAnagram* has the following parameters:  

- *string a:* the first string   
- *string b:* the second string   

**Returns**   

- *boolean:* If $a$ and $b$ are case-insensitive anagrams, return true.  Otherwise, return false.   

**Input Format**

The first line contains a string $a$.		
The second line contains a string $b$.

**Constraints**

- $1 \le length(a), length(b) \le 50$
- Strings $a$ and $b$ consist of English alphabetic characters.
- The comparison should NOT be case sensitive. 

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-25T14:40:36.584Z  

```java


    static boolean isAnagram(String a, String b) {
        // Anagrams must have equal lengths
        if (a.length() != b.length())
            return false;

        // Ignore uppercase and lowercase differences
        a = a.toLowerCase();
        b = b.toLowerCase();

        // Base condition: both strings are empty
        if (a.length() == 0)
            return true;

        // Take the first character from string a
        char ch = a.charAt(0);

        // Find that character in string b
        int index = b.indexOf(ch);

        // Character not found, so not anagrams
        if (index == -1)
            return false;

        // Remove one character from both strings
        return isAnagram(
            a.substring(1),
            b.substring(0, index) + b.substring(index + 1)
        );
    }


```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-anagrams/problem)