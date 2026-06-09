# 125. Valid Palindrome

## Solution: Two Pointers
### Idea
- Use two pointers at both ends of the string
- Skip non-alphanumeric characters
- Compare the current characters ignoring case
- If any pairs of characters is different, return false
- Otherwise, continue until the pointers meet 
### Complexity
- Time: O(n)
- Space: O(1)