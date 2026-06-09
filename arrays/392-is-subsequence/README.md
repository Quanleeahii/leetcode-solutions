# 392. Is Subsequence

## Solution: Two Pointers
### Idea
- Use two pointers for the two strings
- Traverse the strings from left to right
- If the current characters match, move the pointers forward
- Otherwise, move only the pointer in the second string forward
- If all the characters in the first string is matched, return true
- Otherwise, return false
### Complexity
- Time: O(n)
- Space: O(1)