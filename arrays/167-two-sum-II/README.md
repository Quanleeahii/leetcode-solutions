# 167. Two Sum II

## Solution: Two pointers
### Idea
- Use two pointers at both ends of the sorted array
- If the current sum is larger than target, move the right pointer left
- If the current sum is smaller than the target, move the left pointer right
- When the sum equals the target, return their indices
### Complexity
- Time: O(n)
- Space: O(1)