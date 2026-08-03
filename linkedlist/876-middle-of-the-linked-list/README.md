# 876. Middle of the Linked List

## Solution: Fast & Slow Pointer
### Idea
- Use two pointers:
  + `slow` moves one step at a time
  + `fast` moves two steps at a time
- When `fast` reaches the end of the list, `slow` will be at the middle node
- If the list has an even number of nodes, return the second middle node
### Complexity
- Time: O(n)
- Space: O(1)