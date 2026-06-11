# 283. Move Zeroes 

## Solution: Two Pointers
### Idea
- Use one pointer to read elements from left to right
- Use another pointer to maintain the next position for a valid element
- When a valid element is found, place it at the maintained position
- This keep all valid elements together at the beginning of the array
### Complexity
- Time: O(n)
- Space: O(1)