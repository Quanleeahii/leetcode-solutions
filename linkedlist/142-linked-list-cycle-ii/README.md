# 142. Linked List Cycle II

## Solution: Fast & Slow Pointer
### Idea
- Use fast and slow pointers to detect a cycle
- If they meet, use two pointers from the head and the meeting point
- Move both pointers one step at a time
- The node where they meet is the start of the cycle
### Complexity
- Time: O(n)
- Space: O(1)