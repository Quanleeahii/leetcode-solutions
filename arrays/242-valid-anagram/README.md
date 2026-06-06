# 242. Valid Anagram

## Solution 1: Sorting
### Idea
- If the 2 strings have different lengths, return false
- Sort both strings
- Traverse the arrays from left to right
- If any pair of characters at the same position is different, return false
- Otherwise, return true
### Complexity
- Time: O(nlogn)
- Space: O(n)

## Solution 2: HashMap
### Idea
- Count the frequency of each character in the first string
- Decrease the frequency while traversing the second string
- If any frequency becomes negative, return false
- Otherwise, return true
### Complexity
- Time: O(n)
- Space: O(n)
